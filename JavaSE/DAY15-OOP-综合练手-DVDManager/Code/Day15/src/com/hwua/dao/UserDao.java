package com.hwua.dao;

import com.hwua.bean.User;

/**
 * ����������ж��û���Ĳ���
 * @author Administrator
 *
 */
public interface UserDao {

	/**
	 * �ӿ��Ƕ����.�������������Ĭ�Ͼ���public�Ҳ�������private
	 * �����û��������ݿ��в����û�.
	 * @param userName
	 * @return
	 */
	public User getUser(String userName);
	
	/**
	 * ���û���ӵ�����Դ��
	 * @param user
	 * @return
	 */
	public boolean saveUser(User user);
	
}










