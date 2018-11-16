package com.hwua.dao;

import java.sql.SQLException;

import com.hwua.domain.User;

public interface UserDao {

	/**
	 *  ' 从数据库中查找用户对象
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
	 * @return 返回受影响的行数
	 * @throws Exception 
	 * @throws SQLException 
	 */
	int addUser(String name, String pwd) throws SQLException, Exception;

}
