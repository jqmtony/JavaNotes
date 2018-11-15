package com.hwua.view;

import com.hwua.domain.User;
import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImpl;
import com.hwua.utils.UserUtils;

public class LoginView extends View {

	public LoginView() {
		super("登录界面");
	}

	@Override
	protected View showCurrentView() {
		showLine();
		String name = "";
		String pwd = "";
		
		//-- 1.获取用户名和密码输入
		name = UserUtils.regexName();
		pwd = UserUtils.regexPwd();
		
		//-- 把用户名和密码交给Service
		UserService us = new UserServiceImpl();
		
		//-- 接受Service的返回结果
		User u = us.userLogin(name,pwd);
		
		//-- 对结果进行判断
		if (u != null) {
			currentUser = u;
			nextView = new MainView();
		}else {
			nextView = new RegisterView();
		}
		//-- 跳转页面
		return nextView;
	}

}
