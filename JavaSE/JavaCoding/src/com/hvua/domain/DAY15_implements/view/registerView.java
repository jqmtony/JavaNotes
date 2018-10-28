package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.UserService;
import com.hvua.domain.DAY15_implements.serviceImpl.UserServiceImpl;

public class registerView extends View {

	@Override
	public View showView() {
		viewTools.showLine();
		System.out.println(">>>> 注册页面");
		// -- 1.获取用户名和密码
		System.out.println("请输入用户名：");
		String name = " ";
		UserService us = new UserServiceImpl();
		// -- 1.1用户名存在>>>重新输入
		while (true) {
			name = scan.next();
			if (us.checkNameExist(name)) {
				break; // 如果是false应该会自动跳出while循环
			}
			System.out.println("用户名已存在，请重新输入：");
		}
		// -- 1.2 用户名可用 >>> 输入密码
		System.out.println("请输入密码：");
		String psw = scan.next();
		// -- 2.存储用户信息
		if (us.registerUser(name, psw)) {
			System.out.println("提示：你已注册成功");
			// -- 3.跳转页面>>>主页面
			nextView = new mainView();
		}

		return nextView;
	}

}
