package com.client.service;

import com.client.bean.User;

public interface UserService {
	/**
	 * `用户登录
	 * @param userName
	 * @param passWord
	 * @return 返回值为空,代表登录失败
	 */
	public User login(String userName, String passWord);
	/**
	 * `用户注册
	 * @param user
	 * @return 返回值为空,代表注册失败
	 */
	public User register(User user);
	
}
