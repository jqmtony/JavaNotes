package ManagerSystem.Service;

import ManagerSystem.Domain.User;

/**
 * 用户业务层，提供getUser和addUser方法，即验证和添加用户的方法，用于注册和登录页面（功能）
 * @author Administrator
 *
 */
public interface UserService {

	User getUser(String userName, int userPwd);

	
}
