package com.hwua.dao;

import com.hwua.bean.User;
import com.hwua.exception.ErrorPwdException;
import com.hwua.exception.NoUserException;

public interface UserDao {

	/**
	 * �����ݿ��в�ѯ����
	 * @param userAccount
	 * @param userPasswd
	 * @return
	 */
	User getUser(String userAccount, String userPasswd) throws NoUserException,ErrorPwdException;

	/**
	 * �����ݿ��в�������
	 * @param userAccount
	 * @param userNickName
	 * @param userPasswd
	 * @return
	 */
	boolean insertUser(String userAccount, String userNickName, String userPasswd);

}
