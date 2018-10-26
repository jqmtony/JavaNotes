package com.hwua.dao.impl;

import com.hwua.bean.User;
import com.hwua.dao.UserDao;
import com.hwua.tools.DataSet;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUser(String userName) {
		//-- 请求数据源
		User[] array = DataSet.users; 
		//-- 对数据源进行遍历.验证用户是否存在
		for (User u : array) {
			if (u != null && u.getUserName().equals(userName) ) {
				return u;
			}
		}
				
		return null;
	}

	@Override
	public boolean saveUser(User user) {
		//-- 对数据源遍历.第一个为null把数据赋值进去.
		//-- 在DataSet中提供变量.记录最新的下标.
		for (int i = 0; i < DataSet.users.length; i++) {
			if (DataSet.users[i] == null) {
				DataSet.users[i] = user;
				//-- 一定要break
				break;
			}
		}
		return true;
	}

}






