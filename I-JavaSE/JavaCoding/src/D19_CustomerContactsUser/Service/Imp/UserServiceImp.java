package D19_CustomerContactsUser.Service.Imp;

import D19_CustomerContactsUser.Bean.User;
import D19_CustomerContactsUser.Dao.UserDao;
import D19_CustomerContactsUser.Dao.Imp.UserDaoImp;
import D19_CustomerContactsUser.Service.UserService;

public class UserServiceImp implements UserService {
	private UserDao userDao;

	public UserServiceImp() {
		userDao = new UserDaoImp();
	}

	/**
	 * 登录功能，如果成功登录，返回用户信息，如果登录失败，返回null
	 */
	@Override
	public User loginUser(String userAccount, String userPsw) {
		User user = null;
		try {
			user = userDao.getUser(userAccount, userPsw);
		} catch (Exception e) {
			System.out.println("用户名或者密码不存在！");
		}
		return user;
	}



}
