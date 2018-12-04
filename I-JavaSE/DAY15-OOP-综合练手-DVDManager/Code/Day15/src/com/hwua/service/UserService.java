package com.hwua.service;

public interface UserService {
	
	/**
	 * 登录成功
	 */
	public static final int LOGIN_SUCCESS = 0;
	/**
	 * 登录失败:用户不存在
	 */
	public static final int LOGIN_ERROR_NOUSER = 1;
	/**
	 * 登录失败:密码不正确
	 */
	public static final int LOGIN_ERROR_PWD = 2;
	
	
	/**
	 * 处理用户登录的地方
	 * @param userName
	 * @param userPwd
	 * @return 代表登录的结果
	 */
	public int userLogin(String userName,String userPwd);

	/**
	 * 检查用户名是否存在.
	 * @param name
	 * @return exists return true otherwise false
	 */
	public boolean checkNameExists(String name);


	/**
	 * 实现注册用户
	 * @param name
	 * @param pwd
	 * @return 注册是否成功.成功返回true.失败返回false
	 */
	public boolean registerUser(String name, String pwd);

}











