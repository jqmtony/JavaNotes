package com.client.service;

import com.client.bean.User;

public interface UserService {
	/**
	 * `�û���¼
	 * @param userName
	 * @param passWord
	 * @return ����ֵΪ��,�����¼ʧ��
	 */
	public User login(String userName, String passWord);
	/**
	 * `�û�ע��
	 * @param user
	 * @return ����ֵΪ��,����ע��ʧ��
	 */
	public User register(User user);
	
}
