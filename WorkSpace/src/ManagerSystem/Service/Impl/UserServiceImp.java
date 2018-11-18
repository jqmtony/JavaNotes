package ManagerSystem.Service.Impl;

import java.sql.SQLException;

import ManagerSystem.Dao.UserDao;
import ManagerSystem.Domain.User;
import ManagerSystem.Service.UserService;

/**
 * 实现User业务层的具体方法和逻辑
 * 
 * @author Administrator
 *
 */
public class UserServiceImp implements UserService {
	private UserDao ud;

	/**
	 * LoginUser，用户登录业务层
	 * 将参数传入数据库，并拿到返回值，如果有用户，返回用户，如果没有用户，返回null
	 * @throws SQLException 
	 */
	@Override
	public User loginUser(String userName, String userPwd) throws SQLException {
		return ud.getUser(userName,userPwd);
	}

}
