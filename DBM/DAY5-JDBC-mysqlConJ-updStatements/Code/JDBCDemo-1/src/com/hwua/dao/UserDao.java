package com.hwua.dao;

import java.sql.SQLException;

import com.hwua.domain.User;

public interface UserDao {
	
	/**
	 * '�����ݿ�������û�
	 * @param u
	 * @return
	 * @throws SQLException 
	 */
	public boolean addUser(User u) throws SQLException;

}
