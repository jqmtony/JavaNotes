package com.hwua.view;

import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImp;
import com.hwua.util.InputTools;

public class RegisterView extends View{

	public RegisterView() {
		super("注册页面");
	}
	
	@Override
	public View showView() {		
		
		//-- 1.获取录入的信息
		System.out.println("请输入登录账号");
		String userAccount = InputTools.next();
		System.out.println("请输入昵称");
		String userNickName = InputTools.next();
		System.out.println("请输入密码");
		String userPasswd = InputTools.next();
		
		//-- 2.找Service 执行Service中的注册业务
		UserService us = new UserServiceImp();
		
		//-- 3.调用注册业务
		boolean result = us.registerUser(userAccount,userNickName,userPasswd);
		
		//-- 4.根据结果判断注册是否成功
		if (result) {
			nextView = new LoginView();
		}else {
			nextView = this;
		}
		return nextView;
	}

	
}
