package carServer.Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import carServer.Dao.UserDao;
import carServer.Entity.User;
import carServer.Utils.JDBCUtils;

/**
 * 使用JDBC建立Java项目至mySQL数据库的连接
 * 
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao, resultSetHandler {

	/**
	 * 用户登录功能，获取User并返回给Service层，要么是User要么是null，需要访问数据库
	 * 
	 * @throws SQLException
	 */
	@Override
	public User getUser(String... params) throws SQLException {
		Connection connection = JDBCUtils.getConnection();
		String sql = "select * from user where userName = ? and passWord = ? ; ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int paramsCount = preparedStatement.getParameterMetaData().getParameterCount();
		for (int i = 0; i < paramsCount; i++) {
			preparedStatement.setObject(i + 1, params[i]);
		}
		ResultSet rSet = preparedStatement.executeQuery();
		List<User> userList = this.userLoginHandler(rSet);
		if (userList.size() <= 0) {
			return null;
		}
		// 关闭结果集，关闭预处理
		 JDBCUtils.closeResultSet(rSet);
		 JDBCUtils.closePreparedStatement(preparedStatement);
		return userList.get(0);
	}

	/**
	 * 重写数据层的resultSetHandler接口，一个将表参数转换为所需要对象列表的方法
	 */
	@Override
	public List<User> userLoginHandler(ResultSet rSet) throws SQLException {
		List<User> userList = new ArrayList<>();
		while (rSet.next()) {
			User user = new User(rSet.getShort("userID"), rSet.getString("userName"), rSet.getString("passWord"),
					rSet.getString("sex"), rSet.getString("userIdNumber"), rSet.getString("tel"),
					rSet.getString("addr"), rSet.getShort("type"));
			userList.add(user);
		}
		return userList;
	}

	/**
	 * 登录service >> 添加用户
	 * @throws SQLException 
	 */
	@Override
	public Boolean addUser(User user) throws SQLException {
		Connection connection = JDBCUtils.getConnection();
		String sql = "insert into user(userId,userName,passWord,sex,userIdNumber,tel,addr,type) values(?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// 赋值占位符
		System.out.println("[UserDaoImpl，user]"+user);
		preparedStatement.setObject(1, user.getUserId());
		preparedStatement.setObject(2, user.getUserName());
		preparedStatement.setObject(3, user.getPassWord());
		preparedStatement.setObject(4, user.getSex());
		preparedStatement.setObject(5, user.getUserIdNumber());
		preparedStatement.setObject(6, user.getTel());
		preparedStatement.setObject(7, user.getAddr());
		preparedStatement.setObject(8, user.getType());
		// 执行添加，返回受影响的行数
		int rSet = preparedStatement.executeUpdate();
		return rSet==1;
	}

}
