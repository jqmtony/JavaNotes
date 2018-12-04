package com.hwua.view;

import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImpl;
import com.hwua.tools.ViewTools;

public class LoginView extends View {

	@Override
	public View showView() {
		System.out.println(">>>>>>登录页面");
		ViewTools.showLine();
		//-- 1.获取键盘录入的用户名和密码
		System.out.println("请输入用户名");
		String name = scan.next();
		System.out.println("请输入密码");
		String pwd = scan.next();
		//-- 2.把用户名和密码传递个Service
		UserService us = new UserServiceImpl();
		int result = us.userLogin(name, pwd);
		//-- 3.等待Service的返回结果.
		switch (result) {
		case UserService.LOGIN_SUCCESS:
			//-- 把当前登录成功的用户保存下来
			//-- 进入主界面
			nextView = new MainView();
			break;
		case UserService.LOGIN_ERROR_NOUSER:
			//-- 进入注册页面
			nextView = new RegisterView();
			break;
		case UserService.LOGIN_ERROR_PWD:
			//-- 重新录入.三次.找回密码
			nextView = this;
			break;
		default:
			break;
		}
		//-- 4.根据结果跳转到对应的View中
		return nextView;
	}

}
