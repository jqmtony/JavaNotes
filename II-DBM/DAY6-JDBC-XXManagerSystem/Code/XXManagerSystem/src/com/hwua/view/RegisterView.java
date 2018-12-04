package com.hwua.view;

import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImpl;
import com.hwua.utils.UserUtils;

public class RegisterView extends View {

	public RegisterView() {
		super("注册页面");
	}

	@Override
	protected View showCurrentView() {
		showLine();
		//-- 1.获取用户名和密码
		String name = UserUtils.regexName();
		String pwd = UserUtils.regexPwd();
		//-- 2.交给Service
		UserService us = new UserServiceImpl();
		boolean result = us.registerUser(name,pwd);
		if (result) {
			nextView = new LoginView();
		}else {
			nextView = this;
		}
		return nextView;
	}

}
