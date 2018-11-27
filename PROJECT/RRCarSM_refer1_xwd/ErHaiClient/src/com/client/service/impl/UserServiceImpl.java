package com.client.service.impl;

import java.io.IOException;
import com.client.bean.User;
import com.client.service.UserService;
import com.client.util.ClientSocket;
import com.client.util.JSONUtils;

public class UserServiceImpl implements UserService {
	
	/**
	 * `客户登录
	 * @throws ClassNotFoundException 
	 */
	@Override
	public User login(String userName, String passWord)  {
		String str = "UserService#" + "login#" +userName+"#"+ passWord;
		try {
			String response = ClientSocket.getResponse(str);
			User responses =JSONUtils.JSONStringToObject(response, User.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * `用户注册
	 */
	@Override
	public User register(User user) {
		String str = "UserService#" + "register#" + JSONUtils.objectToJSONString(user);
		try {
			String response = ClientSocket.getResponse(str);
			User responses = JSONUtils.JSONStringToObject(response, User.class);
			return responses;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
