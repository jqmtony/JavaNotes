package com.hwua.dao;

import com.hwua.bean.User;
import com.hwua.exception.ErrorPwdException;
import com.hwua.exception.NoUserException;

public interface UserDao {

	/**
	 * 从数据库中查询数据
	 * @param userAccount
	 * @param userPasswd
	 * @return
	 */
	User getUser(String userAccount, String userPasswd) throws NoUserException,ErrorPwdException;

	/**
	 * 向数据库中插入数据
	 * @param userAccount
	 * @param userNickName
	 * @param userPasswd
	 * @return
	 */
	boolean insertUser(String userAccount, String userNickName, String userPasswd);

}
