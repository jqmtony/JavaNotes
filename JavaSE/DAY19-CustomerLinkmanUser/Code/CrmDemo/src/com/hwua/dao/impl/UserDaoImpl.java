package com.hwua.dao.impl;

import com.hwua.bean.User;
import com.hwua.dao.UserDao;
import com.hwua.exception.ErrorPwdException;
import com.hwua.exception.NoUserException;
import com.hwua.util.DataSet;

public class UserDaoImpl implements UserDao {

	/**
	 * �÷����ڲ����ܻ����2���쳣.���ﲻ����.�����ϲ�Service��������
	 */
	@Override
	public User getUser(String userAccount, String userPasswd) throws NoUserException, ErrorPwdException {
		User u = null;
		// -- �����ݿ��в�ѯ�Ϳ�����
		for (int i = 0; i < DataSet.userList.size(); i++) {
			u = DataSet.userList.get(i);
			if (u == null) {
				continue;
			}

			if (u.getUserAccount().equals(userAccount) && u.getUserPwd().equals(userPasswd)) {
				return u;
			} else if (u.getUserAccount().equals(userAccount) && !u.getUserPwd().equals(userPasswd)) {
				throw new ErrorPwdException();
			}
		}
		throw new NoUserException();
	}

	/**
	 * ��Service���ݹ������ֶη�װ��User���󲢲��뵽���ݿ���
	 */
	@Override
	public boolean insertUser(String userAccount, String userNickName, String userPasswd) {
		// -- 1.��װUser ����
		User u = new User(userAccount, userNickName, userPasswd);
		// -- 2.�Ѷ���ŵ����ݿ���
		return DataSet.userList.add(u);
	}

}
