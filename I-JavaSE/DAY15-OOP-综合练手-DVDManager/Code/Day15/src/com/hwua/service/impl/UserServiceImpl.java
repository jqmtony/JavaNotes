package com.hwua.service.impl;

import com.hwua.bean.User;
import com.hwua.dao.UserDao;
import com.hwua.dao.impl.UserDaoImpl;
import com.hwua.service.UserService;

/**
 * Service 是业务的意思.也会有人用biz
 * 业务是不会直接和数据库进行访问.只负责处理业务.
 * @author Administrator
 *
 */
public class UserServiceImpl implements UserService {
	
	private UserDao ud;
	/**
	 * 利用无参构造完成所需要使用的Dao对象的实例化
	 */
	public UserServiceImpl() {
		//-- 1.请求实体对应的Dao
		ud = new UserDaoImpl();
	}

	@Override
	public int userLogin(String userName, String userPwd) {
		//-- 2.请求Dao做查询操作.根据用户名做查询操作(限定用户名是唯一的)
		User u = ud.getUser(userName);
		if (u == null) {
			return UserService.LOGIN_ERROR_NOUSER;
		}
		//-- 3.对密码进行验证.
		if (u.getUserPwd().equals(userPwd)) {
			//-- 3.1 如果密码验证是成功的返回登录成功标识
			return UserService.LOGIN_SUCCESS;
		}

		//-- 3.2 返回面不正确标识		
		return UserService.LOGIN_ERROR_PWD;
	}

	@Override
	public boolean checkNameExists(String name) {
		//-- 1.构建Dao对象.(利用构造方法已经完成)
		//-- 2.调用dao对象中的方法.来验证用户名是否存在
		return ud.getUser(name) == null;
	}

	/**
	 * 实现用户注册的业务
	 */
	@Override
	public boolean registerUser(String name, String pwd) {
		//-- 1.构成User对象
		User u = new User(createUserId(), name, pwd);
		//-- 2.获取Dao对象(已经获取)
		//-- 3.通过Dao对象的方法来实现把数据添加到数据库
		return ud.saveUser(u);
	}

	
	/**
	 * 生成用户ID
	 * @return
	 */
	public int createUserId() {
		return 3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
