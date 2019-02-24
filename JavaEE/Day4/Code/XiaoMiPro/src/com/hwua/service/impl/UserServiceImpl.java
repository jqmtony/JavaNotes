package com.hwua.service.impl;

import java.sql.SQLException;

import com.hwua.bean.User;
import com.hwua.dao.UserDao;
import com.hwua.dao.impl.UserDaoImpl;
import com.hwua.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User userLogin(String name, String pwd) throws SQLException{
		//-- 1.��Dao
		UserDao ud = new UserDaoImpl();
		//-- 2.����Dao�еķ���
		User user = ud.getUser(name,pwd);
		//-- 3.���ؽ��
		return user;
	}

}
