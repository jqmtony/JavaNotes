package com.hvua.domain.DAY15_implements.serviceImpl;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import com.hvua.domain.DAY15_implements.bean.User;
import com.hvua.domain.DAY15_implements.dao.UserDao;
import com.hvua.domain.DAY15_implements.daoImpl.UserDaoImpl;
import com.hvua.domain.DAY15_implements.service.UserService;

public class UserServiceImpl implements UserService {
	/**
	 * 每一次都需要去dao里面看一下，所以干脆new一个dao的对象方便用 UserDao ud = new UserDaoImpl();
	 * 如同View父类一开始就使用无参构造实例化了Scanner控制台输入对象
	 */
	private UserDao ud;

	public UserServiceImpl() {
		ud = new UserDaoImpl();
	}

	@Override
	public int userLogin(String name, String psw) {
		// -- 1.是否存在用户名
		// 请求DaoImpl查询是否存在用户名
		User u = ud.getUser(name);
		// -- 2.存在>>验证密码
		// -- 3.不存在，返回erro_nouser
		if (u == null) {
			return UserService.LOGIN_ERRO_NOUSER;
		}
		// -- 2.1密码正确，返回success
		if (u.getUserPsw().equals(psw)) {
			return UserService.LOGIN_SUCCESS;
		} else {
			// -- 2.2密码不正确，返回erro_psw
			return UserService.LOGIN_ERRO_PSW;
		}

	}

	@Override
	public Boolean checkNameExist(String name) {
		return ud.getUser(name) == null;
	}

	@Override
	public Boolean registerUser(String name, String psw) {
		// 利用User有参构造实例化对象
		User user = new User(createUserID(), name, psw);
		// 将User存入数据库
		return ud.saveUser(user);
	}

	@Override
	public int createUserID() {
		// ID是唯一值，等于最大ID值+1
		int userID = ud.findLastID()+1;
		return userID;
	}

}
