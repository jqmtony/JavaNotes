package com.hwua.dao;

import java.sql.SQLException;

import com.hwua.bean.User;

/**
 * ' 用户的数据库操作类
 * @author Administrator
 *
 */
public interface UserDao {

	/**
	 * ' 在数据库表中根据用户名和密码查找用户.
	 * @param name
	 * @param pwd
	 * @return
	 * @throws SQLException 
	 */
	User getUser(String name, String pwd) throws SQLException;

}
