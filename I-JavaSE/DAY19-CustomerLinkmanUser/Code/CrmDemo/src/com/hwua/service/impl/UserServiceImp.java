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
	 * �����ݴ��ݸ�Dao.��Dao�����ݿ��в����û��������Ƿ���ȷ
	 */
	@Override
	public User userLogin(String userAccount, String userPasswd) {
		//-- �ṩ�ֲ���������Dao���ص�����
		User user = null;
		try {
			//-- ����dao�еķ���
			user = ud.getUser(userAccount,userPasswd);
		} catch (NoUserException e) {
			System.out.println(e.getMessage());
		}catch (ErrorPwdException  e) {
			System.out.println(e.getMessage());
		}
		//-- ��������ȡ���û�����
		return user;
	}

	@Override
	public boolean registerUser(String userAccount, String userNickName, String userPasswd) {
		
		return ud.insertUser(userAccount,userNickName,userPasswd);
	}

}
