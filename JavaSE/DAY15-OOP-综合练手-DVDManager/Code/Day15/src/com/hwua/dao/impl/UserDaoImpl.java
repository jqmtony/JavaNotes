package com.hwua.dao.impl;

import com.hwua.bean.User;
import com.hwua.dao.UserDao;
import com.hwua.tools.DataSet;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUser(String userName) {
		//-- ��������Դ
		User[] array = DataSet.users; 
		//-- ������Դ���б���.��֤�û��Ƿ����
		for (User u : array) {
			if (u != null && u.getUserName().equals(userName) ) {
				return u;
			}
		}
				
		return null;
	}

	@Override
	public boolean saveUser(User user) {
		//-- ������Դ����.��һ��Ϊnull�����ݸ�ֵ��ȥ.
		//-- ��DataSet���ṩ����.��¼���µ��±�.
		for (int i = 0; i < DataSet.users.length; i++) {
			if (DataSet.users[i] == null) {
				DataSet.users[i] = user;
				//-- һ��Ҫbreak
				break;
			}
		}
		return true;
	}

}






