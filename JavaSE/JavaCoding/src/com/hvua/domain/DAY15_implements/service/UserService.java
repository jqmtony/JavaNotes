package com.hvua.domain.DAY15_implements.service;

public interface UserService {

	int LOGIN_SUCCESS = 0;
	int LOGIN_ERRO_NOUSER = 1;
	int LOGIN_ERRO_PSW = 2;

	int userLogin(String name, String psw);

	Boolean checkNameExist(String name);

	Boolean registerUser(String name, String psw);

	int createUserID();
}
