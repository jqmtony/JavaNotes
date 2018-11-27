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
public class UserDaoImpl implements UserDao {
rSetUtils rSetUtils;
User addUser;
public UserDaoImpl() {
	rSetUtils = new rSetUtils();
	addUser = new User();
}
	/**
	 * 用户登录功能，获取User并返回给Service层，要么是User要么是null，需要访问数据库
	 * 
	 * @throws SQLException
	 */
	@Override
	public User getUser(String userName, String userPwd) throws SQLException {
		String sql = "select * from user where userName = ? and passWord = ? ; ";
		return rSetUtils.getUser(sql, userName,userPwd);
	}

	/**
	 * 登录service >> 添加用户
	 * @throws SQLException 
	 */
	@Override
	public Boolean addUser(User user) throws SQLException {
		// 判断用户是否存在
		String verify = "select * from user where userName = ? and passWord = ? ; ";
		if(rSetUtils.getUser(verify, user.getUserName(),user.getPassWord()).getUserName()==null) {
			String sql = "insert into user(userId,userName,passWord,sex,userIdNumber,tel,addr,type) values(?,?,?,?,?,?,?,?)";
			return rSetUtils.addUser(sql, user);
		}
		System.out.println("用户名验证失败");
		return false;
	}

}
