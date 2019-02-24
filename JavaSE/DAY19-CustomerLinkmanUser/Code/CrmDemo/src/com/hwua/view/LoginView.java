package com.hwua.view;


import com.hwua.bean.User;
import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImp;
import com.hwua.util.InputTools;

public class LoginView extends View{
	private int loginCount;

	public LoginView() {
		super("登录页面");
	}
	
	@Override
	public View showView() {

		//-- 1.获取用户账号和密码
		System.out.println("请输入用户账号:\t");
		String userAccount = InputTools.next();
		System.out.println("请输入用户密码:\t");
		String userPasswd = InputTools.next();
		//-- 2.把账号和面传递给Service
		UserService us = new UserServiceImp();
		User user = us.userLogin(userAccount,userPasswd);
		//-- 3.保存当前登录的用户.在下面的每个View中就直接拥有了当前登录用户.
		currUser = user;
		//-- 4.判断得到的用户对象是否为null.并根据结果来判断下个页面.
		if (user == null) {
			nextView = this;
			loginCount ++;
			System.out.println("loginCount:\t" + loginCount);
			if (loginCount == 3) {
				System.out.println("错误次数太多,进入注册页面");
				nextView = new RegisterView();
			}
		}else {
			nextView = new MainView();
		}		
		return nextView;
	}	
}
