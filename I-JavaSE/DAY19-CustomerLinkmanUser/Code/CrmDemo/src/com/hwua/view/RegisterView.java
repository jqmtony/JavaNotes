package com.hwua.view;

import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImp;
import com.hwua.util.InputTools;

public class RegisterView extends View{

	public RegisterView() {
		super("ע��ҳ��");
	}
	
	@Override
	public View showView() {		
		
		//-- 1.��ȡ¼�����Ϣ
		System.out.println("�������¼�˺�");
		String userAccount = InputTools.next();
		System.out.println("�������ǳ�");
		String userNickName = InputTools.next();
		System.out.println("����������");
		String userPasswd = InputTools.next();
		
		//-- 2.��Service ִ��Service�е�ע��ҵ��
		UserService us = new UserServiceImp();
		
		//-- 3.����ע��ҵ��
		boolean result = us.registerUser(userAccount,userNickName,userPasswd);
		
		//-- 4.���ݽ���ж�ע���Ƿ�ɹ�
		if (result) {
			nextView = new LoginView();
		}else {
			nextView = this;
		}
		return nextView;
	}

	
}
