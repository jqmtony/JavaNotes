package carClient.Service.Impl;

import carClient.Entity.User;
import carClient.Service.UserService;

/**
 * 实现User业务层的具体方法和逻辑
 * 
 * @author Administrator
 *
 */
public class UserServiceImp implements UserService {
	
	/**
	 * LoginUser，用户登录业务层
	 * 将参数传入数据库，并拿到返回值，如果有用户，返回用户，如果没有用户，返回null
	 * @throws SQLException 
	 */
	@Override
	public User loginUser(String userName, String userPwd)  {
		User user = null;
		// TODO socket.getresponse
		return user;
	}

}
