package com.hwua.service;

import java.sql.SQLException;

import com.hwua.bean.User;

/**
 * ' 定义用户行为
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * ' 用户登录行为
	 * @param name 前端传入的用户名
	 * @param pwd  前端传入的密码
	 * @return   登录成功返回对应的User对象.否则返回null.
	 * @throws SQLException 
	 */
	User userLogin(String name, String pwd) throws SQLException ;

}
