package com.hwua.view;

import com.hwua.domain.User;
import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImpl;
import com.hwua.utils.UserUtils;

public class LoginView extends View {

	public LoginView() {
		super("��¼����");
	}

	@Override
	protected View showCurrentView() {
		showLine();
		String name = "";
		String pwd = "";
		
		//-- 1.��ȡ�û�������������
		name = UserUtils.regexName();
		pwd = UserUtils.regexPwd();
		
		//-- ���û��������뽻��Service
		UserService us = new UserServiceImpl();
		
		//-- ����Service�ķ��ؽ��
		User u = us.userLogin(name,pwd);
		
		//-- �Խ�������ж�
		if (u != null) {
			currentUser = u;
			nextView = new MainView();
		}else {
			nextView = new RegisterView();
		}
		//-- ��תҳ��
		return nextView;
	}

}
