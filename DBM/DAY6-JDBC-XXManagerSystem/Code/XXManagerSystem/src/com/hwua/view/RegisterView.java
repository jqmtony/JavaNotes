package com.hwua.view;

import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImpl;
import com.hwua.utils.UserUtils;

public class RegisterView extends View {

	public RegisterView() {
		super("ע��ҳ��");
	}

	@Override
	protected View showCurrentView() {
		showLine();
		//-- 1.��ȡ�û���������
		String name = UserUtils.regexName();
		String pwd = UserUtils.regexPwd();
		//-- 2.����Service
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
