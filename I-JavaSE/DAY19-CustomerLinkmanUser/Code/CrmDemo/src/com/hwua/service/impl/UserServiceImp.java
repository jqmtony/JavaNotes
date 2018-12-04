package com.hwua.service.impl;

import com.hwua.bean.User;
import com.hwua.dao.UserDao;
import com.hwua.dao.impl.UserDaoImpl;
import com.hwua.exception.ErrorPwdException;
import com.hwua.exception.NoUserException;
import com.hwua.service.UserService;

public class UserServiceImp implements UserService {
	private UserDao ud;
	
	public UserServiceImp() {
		ud = new UserDaoImpl();
	}

	/**
	 * 把数据传递给Dao.由Dao到数据库中查找用户名和面是否正确
	 */
	@Override
	public User userLogin(String userAccount, String userPasswd) {
		//-- 提供局部变量保存Dao返回的数据
		User user = null;
		try {
			//-- 调用dao中的方法
			user = ud.getUser(userAccount,userPasswd);
		} catch (NoUserException e) {
			System.out.println(e.getMessage());
		}catch (ErrorPwdException  e) {
			System.out.println(e.getMessage());
		}
		//-- 返回所获取的用户对象
		return user;
	}

	@Override
	public boolean registerUser(String userAccount, String userNickName, String userPasswd) {
		
		return ud.insertUser(userAccount,userNickName,userPasswd);
	}

}
