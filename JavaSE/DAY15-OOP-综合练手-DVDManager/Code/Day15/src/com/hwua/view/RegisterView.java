package com.hwua.view;

import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImpl;
import com.hwua.tools.ViewTools;

public class RegisterView extends View {

	@Override
	public View showView() {
		System.out.println(">>>>>>注册页面");
		ViewTools.showLine();
		//-- 获取键盘录入的用户名
		System.out.println("请输入用户名:");
		String name = "";
		UserService us = new UserServiceImpl();
		while(true) {
			name = scan.next();
			//-- 验证用户名是否存在 
			if(us.checkNameExists(name)) {
				break;
			}
			System.out.println("用户名已经存在请重新输入!");
		}
		System.out.println("请输入密码:");
		String pwd = scan.next();
		//-- 进行注册业务
		if(us.registerUser(name,pwd)) {
			//-- 注册成功
			nextView = new LoginView();
		}else {
			nextView = this;
		}
		
		return nextView;
	}

}
