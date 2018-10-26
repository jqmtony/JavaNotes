package com.hwua.dao;

import com.hwua.bean.User;

/**
 * 里面放置所有对用户表的操作
 * @author Administrator
 *
 */
public interface UserDao {

	/**
	 * 接口是对外的.里面的所有内容默认就是public且不可以是private
	 * 根据用户名在数据库中查找用户.
	 * @param userName
	 * @return
	 */
	public User getUser(String userName);
	
	/**
	 * 把用户添加到数据源中
	 * @param user
	 * @return
	 */
	public boolean saveUser(User user);
	
}










