package com.server.service.impl;


import java.sql.SQLException;

import com.server.bean.User;
import com.server.dao.UserDao;
import com.server.dao.impl.UserDaoImpl;
import com.server.service.UserService;

public class UserServiceImpl implements UserService {
	
	UserDao ud;
	public UserServiceImpl() {
		ud = new UserDaoImpl();
	}
	
	@Override
	public User login(String userName, String passWord) {
		try {
			return ud.selectByUserNamePassWord(userName , passWord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
	}

	@Override
	public User register(User user) {
		User users;
		try {
			users = ud.selectByUserName(user.getUserName());
			if ( users != null) {
			ud.updateUser(users);
		}
		return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
