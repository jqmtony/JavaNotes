package com.server.dao;

import java.sql.SQLException;

import com.server.bean.User;

public interface UserDao {

	User selectByUserNamePassWord(String userName, String passWord) throws SQLException, Exception;

	User selectByUserName(String userName) throws SQLException, Exception;

	void updateUser(User user) throws SQLException, Exception;

	

}
