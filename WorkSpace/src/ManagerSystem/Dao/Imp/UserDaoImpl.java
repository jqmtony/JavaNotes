package ManagerSystem.Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import DBM_Day6_JDBC.JDBCUtils;
import ManagerSystem.Dao.UserDao;
import ManagerSystem.Domain.User;

/**
 * 使用JDBC建立Java项目至mySQL数据库的连接
 * 
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao, resultSetHandler {

	/**
	 * 用户登录功能，获取User并返回给Service层，要么是User要么是null，需要访问数据库
	 * @throws SQLException 
	 */
	@Override
	public User getUser(String... params) throws SQLException {
		// 访问数据库
		Connection connection = JDBCUtils.getConnection();
		// 将参数传入数据库：userID,userAccount,userName,userPwd
		String sql = "select * from user where userName = ? and userPwd = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int paramsCount = preparedStatement.getParameterMetaData().getParameterCount();
		for (int i = 0; i < paramsCount; i++) {
			preparedStatement.setObject(i + 1, params[i]);
		}
		// 拿到mySQL的User对象
		ResultSet rSet = preparedStatement.executeQuery();
		// 转换为Java的User对象
		List<User> userList = this.userLoginHandler(rSet);
		// 返回结果值
		if(userList.size()<=0) {
			return null;
		}
		return userList.get(0);
	}

	/**
	 * 重写数据层的resultSetHandler接口，一个将表参数转换为所需要对象列表的方法
	 */
	@Override
	public List<User> userLoginHandler(ResultSet rSet) throws SQLException {
		// 创建一个客户List
		List<User> userList = new ArrayList<>();
		// 将表中的数据按字段名一个一个取出来
		while (rSet.next()) {
			User user = new User();
			user.setUserName(rSet.getString("用户名"));
			user.setUserPwd(rSet.getString("密码"));
		}
		return userList;
	}

}
