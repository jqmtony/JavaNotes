package com.hwua.view;

import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImpl;
import com.hwua.tools.ViewTools;

public class RegisterView extends View {

	@Override
	public View showView() {
		System.out.println(">>>>>>ע��ҳ��");
		ViewTools.showLine();
		//-- ��ȡ����¼����û���
		System.out.println("�������û���:");
		String name = "";
		UserService us = new UserServiceImpl();
		while(true) {
			name = scan.next();
			//-- ��֤�û����Ƿ���� 
			if(us.checkNameExists(name)) {
				break;
			}
			System.out.println("�û����Ѿ���������������!");
		}
		System.out.println("����������:");
		String pwd = scan.next();
		//-- ����ע��ҵ��
		if(us.registerUser(name,pwd)) {
			//-- ע��ɹ�
			nextView = new LoginView();
		}else {
			nextView = this;
		}
		
		return nextView;
	}

}
