package com.hwua.view;

import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImpl;
import com.hwua.tools.ViewTools;

public class LoginView extends View {

	@Override
	public View showView() {
		System.out.println(">>>>>>��¼ҳ��");
		ViewTools.showLine();
		//-- 1.��ȡ����¼����û���������
		System.out.println("�������û���");
		String name = scan.next();
		System.out.println("����������");
		String pwd = scan.next();
		//-- 2.���û��������봫�ݸ�Service
		UserService us = new UserServiceImpl();
		int result = us.userLogin(name, pwd);
		//-- 3.�ȴ�Service�ķ��ؽ��.
		switch (result) {
		case UserService.LOGIN_SUCCESS:
			//-- �ѵ�ǰ��¼�ɹ����û���������
			//-- ����������
			nextView = new MainView();
			break;
		case UserService.LOGIN_ERROR_NOUSER:
			//-- ����ע��ҳ��
			nextView = new RegisterView();
			break;
		case UserService.LOGIN_ERROR_PWD:
			//-- ����¼��.����.�һ�����
			nextView = this;
			break;
		default:
			break;
		}
		//-- 4.���ݽ����ת����Ӧ��View��
		return nextView;
	}

}
