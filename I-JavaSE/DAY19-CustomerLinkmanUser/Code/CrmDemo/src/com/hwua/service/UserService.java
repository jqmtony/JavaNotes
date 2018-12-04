package com.hwua.service;

import com.hwua.bean.User;

public interface UserService {

	/**
	 * 用户登录行为.
	 * @param userAccount 用户账号
	 * @param userPasswd  用户密码
	 * @return  返回登录成功的用户对象
	 */
	User userLogin(String userAccount, String userPasswd);

	/**
	 * 用户注册行为
	 * @param userAccount
	 * @param userNickName
	 * @param userPasswd
	 * @return
	 */
	boolean registerUser(String userAccount, String userNickName, String userPasswd);

}
