package com.hwua.service;

import java.sql.SQLException;

import com.hwua.bean.User;

/**
 * ' �����û���Ϊ
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * ' �û���¼��Ϊ
	 * @param name ǰ�˴�����û���
	 * @param pwd  ǰ�˴��������
	 * @return   ��¼�ɹ����ض�Ӧ��User����.���򷵻�null.
	 * @throws SQLException 
	 */
	User userLogin(String name, String pwd) throws SQLException ;

}
