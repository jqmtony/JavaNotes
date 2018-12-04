package com.hwua.dao.impl;

import com.hwua.bean.User;
import com.hwua.dao.UserDao;
import com.hwua.exception.ErrorPwdException;
import com.hwua.exception.NoUserException;
import com.hwua.util.DataSet;

public class UserDaoImpl implements UserDao {

	/**
	 * 该方法内部可能会产生2个异常.这里不处理.交给上层Service层来处理
	 */
	@Override
	public User getUser(String userAccount, String userPasswd) throws NoUserException, ErrorPwdException {
		User u = null;
		// -- 到数据库中查询就可以了
		for (int i = 0; i < DataSet.userList.size(); i++) {
			u = DataSet.userList.get(i);
			if (u == null) {
				continue;
			}

			if (u.getUserAccount().equals(userAccount) && u.getUserPwd().equals(userPasswd)) {
				return u;
			} else if (u.getUserAccount().equals(userAccount) && !u.getUserPwd().equals(userPasswd)) {
				throw new ErrorPwdException();
			}
		}
		throw new NoUserException();
	}

	/**
	 * 把Service传递过来的字段封装成User对象并插入到数据库中
	 */
	@Override
	public boolean insertUser(String userAccount, String userNickName, String userPasswd) {
		// -- 1.封装User 对象
		User u = new User(userAccount, userNickName, userPasswd);
		// -- 2.把对象放到数据库中
		return DataSet.userList.add(u);
	}

}
