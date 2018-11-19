package com.server.service;


import com.server.bean.User;

public interface UserService {

	public User login(String userName, String passWord) ;

	public User register(User user) ;
	
}
