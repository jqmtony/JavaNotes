package com.hwua.service;

import com.hwua.bean.User;

public interface UserService {

	/**
	 * �û���¼��Ϊ.
	 * @param userAccount �û��˺�
	 * @param userPasswd  �û�����
	 * @return  ���ص�¼�ɹ����û�����
	 */
	User userLogin(String userAccount, String userPasswd);

	/**
	 * �û�ע����Ϊ
	 * @param userAccount
	 * @param userNickName
	 * @param userPasswd
	 * @return
	 */
	boolean registerUser(String userAccount, String userNickName, String userPasswd);

}
