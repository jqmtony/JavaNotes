package com.hwua.service;

public interface UserService {
	
	/**
	 * ��¼�ɹ�
	 */
	public static final int LOGIN_SUCCESS = 0;
	/**
	 * ��¼ʧ��:�û�������
	 */
	public static final int LOGIN_ERROR_NOUSER = 1;
	/**
	 * ��¼ʧ��:���벻��ȷ
	 */
	public static final int LOGIN_ERROR_PWD = 2;
	
	
	/**
	 * �����û���¼�ĵط�
	 * @param userName
	 * @param userPwd
	 * @return �����¼�Ľ��
	 */
	public int userLogin(String userName,String userPwd);

	/**
	 * ����û����Ƿ����.
	 * @param name
	 * @return exists return true otherwise false
	 */
	public boolean checkNameExists(String name);


	/**
	 * ʵ��ע���û�
	 * @param name
	 * @param pwd
	 * @return ע���Ƿ�ɹ�.�ɹ�����true.ʧ�ܷ���false
	 */
	public boolean registerUser(String name, String pwd);

}











