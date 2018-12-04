package com.hvua.domain.DAY15_implements.dao;

import com.hvua.domain.DAY15_implements.bean.User;

public interface UserDao {

	User getUser(String name);

	int findLastID();

	Boolean saveUser(User user);

}
