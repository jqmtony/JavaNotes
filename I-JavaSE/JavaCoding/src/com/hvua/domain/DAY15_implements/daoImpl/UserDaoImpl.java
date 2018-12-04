package com.hvua.domain.DAY15_implements.daoImpl;

import com.hvua.domain.DAY15_implements.Tools.DataSet;
import com.hvua.domain.DAY15_implements.bean.User;
import com.hvua.domain.DAY15_implements.dao.UserDao;

public class UserDaoImpl implements UserDao {
	// 申请User数据源，大家都需要，所以拿出来公用
	User[] array = DataSet.arrayUser;

	@Override
	public User getUser(String name) {
		// 寻找用户名
		for (User u : array) {
			// 找到>>返回用户名
			if (u != null && u.getUserName().equals(name)) {
				return u;
			}
		}
		// 没有找到>>返回空值
		return null;
	}

	@Override
	public int findLastID() {
		int index = 0;
		for (User u : array) {
			if (u == null) {
				break;
			}
			index = index + 1;
		}
		return index;
	}

	@Override
	public Boolean saveUser(User user) {
		array[findLastID()]=user;
		System.out.println(user);
		return true;
	}

}
