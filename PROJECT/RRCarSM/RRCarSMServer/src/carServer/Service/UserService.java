package carServer.Service;

import java.sql.SQLException;
import java.util.List;

import carServer.Entity.User;


/**
 * 用户业务层，提供getUser和addUser方法，即验证和添加用户的方法，用于注册和登录页面（功能）
 * @author Administrator
 *
 */
public interface UserService {

	User loginUser(String userName, String userPwd) throws SQLException;

	Boolean registerUser(User user) throws SQLException;

	
}
