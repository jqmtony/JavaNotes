package com.hvua.domain.DAY15_implements.daoImpl;

import com.hvua.domain.DAY15_implements.Tools.DataSet;
import com.hvua.domain.DAY15_implements.bean.User;
import com.hvua.domain.DAY15_implements.dao.UserDao;

public class UserDaoImpl implements UserDao {
	// ����User����Դ����Ҷ���Ҫ�������ó�������
	User[] array = DataSet.arrayUser;

	@Override
	public User getUser(String name) {
		// Ѱ���û���
		for (User u : array) {
			// �ҵ�>>�����û���
			if (u != null && u.getUserName().equals(name)) {
				return u;
			}
		}
		// û���ҵ�>>���ؿ�ֵ
		return null;
	}

	@Override
	public int findLastID() {
		int index = 0;
		for (User u : array) {
			if (u == null) {
				break;
			}
			index = index + 1;
		}
		return index;
	}

	@Override
	public Boolean saveUser(User user) {
		array[findLastID()]=user;
		System.out.println(user);
		return true;
	}

}
