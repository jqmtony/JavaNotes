package carClient.Service;

import java.sql.SQLException;

import carClient.Entity.User;


/**
 * 用户业务层，提供getUser和addUser方法，即验证和添加用户的方法，用于注册和登录页面（功能）
 * @author Administrator
 *
 */
public interface UserService {
	// TODO getResposne
	User loginUser(String userName, String userPwd) throws SQLException;

	
}
