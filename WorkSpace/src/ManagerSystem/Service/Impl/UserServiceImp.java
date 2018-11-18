package ManagerSystem.Service.Impl;

import java.sql.SQLException;

import ManagerSystem.Dao.UserDao;
import ManagerSystem.Dao.Imp.UserDaoImpl;
import ManagerSystem.Domain.User;
import ManagerSystem.Service.UserService;

/**
 * 实现User业务层的具体方法和逻辑
 * 
 * @author Administrator
 *
 */
public class UserServiceImp implements UserService {
	UserDao ud;
	public UserServiceImp() {
		ud = new UserDaoImpl();
	}

	/**
	 * LoginUser，用户登录业务层
	 * 将参数传入数据库，并拿到返回值，如果有用户，返回用户，如果没有用户，返回null
	 * @throws SQLException 
	 */
	@Override
	public User loginUser(String userName, String userPwd)  {
		User user = null;
		try {
			user = ud.getUser(userName,userPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
