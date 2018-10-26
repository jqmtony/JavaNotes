package com.hwua.service.impl;

import com.hwua.bean.User;
import com.hwua.dao.UserDao;
import com.hwua.dao.impl.UserDaoImpl;
import com.hwua.service.UserService;

/**
 * Service ��ҵ�����˼.Ҳ��������biz
 * ҵ���ǲ���ֱ�Ӻ����ݿ���з���.ֻ������ҵ��.
 * @author Administrator
 *
 */
public class UserServiceImpl implements UserService {
	
	private UserDao ud;
	/**
	 * �����޲ι����������Ҫʹ�õ�Dao�����ʵ����
	 */
	public UserServiceImpl() {
		//-- 1.����ʵ���Ӧ��Dao
		ud = new UserDaoImpl();
	}

	@Override
	public int userLogin(String userName, String userPwd) {
		//-- 2.����Dao����ѯ����.�����û�������ѯ����(�޶��û�����Ψһ��)
		User u = ud.getUser(userName);
		if (u == null) {
			return UserService.LOGIN_ERROR_NOUSER;
		}
		//-- 3.�����������֤.
		if (u.getUserPwd().equals(userPwd)) {
			//-- 3.1 ���������֤�ǳɹ��ķ��ص�¼�ɹ���ʶ
			return UserService.LOGIN_SUCCESS;
		}

		//-- 3.2 �����治��ȷ��ʶ		
		return UserService.LOGIN_ERROR_PWD;
	}

	@Override
	public boolean checkNameExists(String name) {
		//-- 1.����Dao����.(���ù��췽���Ѿ����)
		//-- 2.����dao�����еķ���.����֤�û����Ƿ����
		return ud.getUser(name) == null;
	}

	/**
	 * ʵ���û�ע���ҵ��
	 */
	@Override
	public boolean registerUser(String name, String pwd) {
		//-- 1.����User����
		User u = new User(createUserId(), name, pwd);
		//-- 2.��ȡDao����(�Ѿ���ȡ)
		//-- 3.ͨ��Dao����ķ�����ʵ�ְ�������ӵ����ݿ�
		return ud.saveUser(u);
	}

	
	/**
	 * �����û�ID
	 * @return
	 */
	public int createUserId() {
		return 3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
