package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.bean.User;
import com.hvua.domain.DAY15_implements.dao.UserDao;
import com.hvua.domain.DAY15_implements.daoImpl.UserDaoImpl;
import com.hvua.domain.DAY15_implements.service.UserService;
import com.hvua.domain.DAY15_implements.serviceImpl.UserServiceImpl;

public class loginView extends View {

	@Override
	public View showView() {
		viewTools.showLine();
		System.out.println(" >>>> Login Page");
		// -- 1. 输入用户密码
		System.out.println("请输入用户名：");
		String name = scan.next();
		System.out.println("请输入密码：");
		String psw = scan.next();
		// -- 2. 验证用户信息
		UserService us = new UserServiceImpl(); // 实体-业务-数据-库
		int result = us.userLogin(name, psw);
		// -- 3. 处理和跳转
		switch (result) {
		// 3.1 验证成功 >> 用户主界面
		case UserService.LOGIN_SUCCESS:
			System.out.println("提示：您已成功登陆");
			nextView = new mainView();
			break;
		// 3.2 用户名不存在 >> 注册页面
		case UserService.LOGIN_ERRO_NOUSER:
			System.out.println("提示：用户名不存在");
			nextView = new registerView();
			break;
		// 3.3 密码错误 >> 3次机会，无法登陆
		case UserService.LOGIN_ERRO_PSW:
			System.out.println("提示：密码不正确");
			nextView = this;
			break;
		default:
			break;
		}
		// -- 4. 跳转页面
		return nextView;
	}

}
