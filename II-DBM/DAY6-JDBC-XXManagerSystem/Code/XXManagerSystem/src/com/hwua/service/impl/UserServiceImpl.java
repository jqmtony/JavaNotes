package com.hwua.service.impl;

import com.hwua.dao.UserDao;
import com.hwua.dao.impl.UserDaoImpl;
import com.hwua.domain.User;
import com.hwua.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao mUserDao;
	public UserServiceImpl() {
		mUserDao = new UserDaoImpl();
	}
	@Override
	public User userLogin(String name, String pwd) {
		User u = null;
		try {
			u = mUserDao.getUser(name,pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	@Override
	public boolean registerUser(String name, String pwd) {
		int result = 0;
		try {
			result = mUserDao.addUser(name, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return result != 0;
	}

}
