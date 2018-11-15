package com.hwua.service;

import com.hwua.domain.User;

public interface UserService {

	/**
	 * ' 接受前台传递过来的用户名和密码进行用户登录.
	 * @param name
	 * @param pwd
	 * @return 登录成功的用户对象
	 */
	User userLogin(String name, String pwd);

	/**
	 * ' 用户注册
	 * @param name
	 * @param pwd
	 * @return
	 */
	boolean registerUser(String name, String pwd);

}
