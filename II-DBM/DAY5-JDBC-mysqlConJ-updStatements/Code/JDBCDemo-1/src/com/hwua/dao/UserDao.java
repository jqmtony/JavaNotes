package com.hwua.dao;

import java.sql.SQLException;

import com.hwua.domain.User;

public interface UserDao {
	
	/**
	 * '向数据库中添加用户
	 * @param u
	 * @return
	 * @throws SQLException 
	 */
	public boolean addUser(User u) throws SQLException;

}
