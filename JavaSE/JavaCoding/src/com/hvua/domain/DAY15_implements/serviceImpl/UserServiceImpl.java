package com.hvua.domain.DAY15_implements.serviceImpl;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import com.hvua.domain.DAY15_implements.bean.User;
import com.hvua.domain.DAY15_implements.dao.UserDao;
import com.hvua.domain.DAY15_implements.daoImpl.UserDaoImpl;
import com.hvua.domain.DAY15_implements.service.UserService;

public class UserServiceImpl implements UserService {
	/**
	 * ÿһ�ζ���Ҫȥdao���濴һ�£����Ըɴ�newһ��dao�Ķ��󷽱��� UserDao ud = new UserDaoImpl();
	 * ��ͬView����һ��ʼ��ʹ���޲ι���ʵ������Scanner����̨�������
	 */
	private UserDao ud;

	public UserServiceImpl() {
		ud = new UserDaoImpl();
	}

	@Override
	public int userLogin(String name, String psw) {
		// -- 1.�Ƿ�����û���
		// ����DaoImpl��ѯ�Ƿ�����û���
		User u = ud.getUser(name);
		// -- 2.����>>��֤����
		// -- 3.�����ڣ�����erro_nouser
		if (u == null) {
			return UserService.LOGIN_ERRO_NOUSER;
		}
		// -- 2.1������ȷ������success
		if (u.getUserPsw().equals(psw)) {
			return UserService.LOGIN_SUCCESS;
		} else {
			// -- 2.2���벻��ȷ������erro_psw
			return UserService.LOGIN_ERRO_PSW;
		}

	}

	@Override
	public Boolean checkNameExist(String name) {
		return ud.getUser(name) == null;
	}

	@Override
	public Boolean registerUser(String name, String psw) {
		// ����User�вι���ʵ��������
		User user = new User(createUserID(), name, psw);
		// ��User�������ݿ�
		return ud.saveUser(user);
	}

	@Override
	public int createUserID() {
		// ID��Ψһֵ���������IDֵ+1
		int userID = ud.findLastID()+1;
		return userID;
	}

}
