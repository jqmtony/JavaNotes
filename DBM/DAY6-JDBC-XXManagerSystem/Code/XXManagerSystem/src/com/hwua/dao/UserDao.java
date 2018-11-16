package com.hwua.dao;

import java.sql.SQLException;

import com.hwua.domain.User;

public interface UserDao {

	/**
	 *  ' �����ݿ��в����û�����
	 * @param name
	 * @param pwd
	 * @return
	 * @throws Exception 
	 * @throws SQLException 
	 */
	User getUser(String... params) throws SQLException, Exception;

	/**
	 * 
	 * @param name
	 * @param pwd
	 * @return ������Ӱ�������
	 * @throws Exception 
	 * @throws SQLException 
	 */
	int addUser(String name, String pwd) throws SQLException, Exception;

}
