package com.hwua.service;

import com.hwua.domain.User;

public interface UserService {

	/**
	 * ' ����ǰ̨���ݹ������û�������������û���¼.
	 * @param name
	 * @param pwd
	 * @return ��¼�ɹ����û�����
	 */
	User userLogin(String name, String pwd);

	/**
	 * ' �û�ע��
	 * @param name
	 * @param pwd
	 * @return
	 */
	boolean registerUser(String name, String pwd);

}
