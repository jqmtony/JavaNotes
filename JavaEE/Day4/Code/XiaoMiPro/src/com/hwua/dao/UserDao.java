package com.hwua.dao;

import java.sql.SQLException;

import com.hwua.bean.User;

/**
 * ' �û������ݿ������
 * @author Administrator
 *
 */
public interface UserDao {

	/**
	 * ' �����ݿ���и����û�������������û�.
	 * @param name
	 * @param pwd
	 * @return
	 * @throws SQLException 
	 */
	User getUser(String name, String pwd) throws SQLException;

}
