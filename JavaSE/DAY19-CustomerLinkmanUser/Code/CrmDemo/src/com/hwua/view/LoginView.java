package com.hwua.view;


import com.hwua.bean.User;
import com.hwua.service.UserService;
import com.hwua.service.impl.UserServiceImp;
import com.hwua.util.InputTools;

public class LoginView extends View{
	private int loginCount;

	public LoginView() {
		super("��¼ҳ��");
	}
	
	@Override
	public View showView() {

		//-- 1.��ȡ�û��˺ź�����
		System.out.println("�������û��˺�:\t");
		String userAccount = InputTools.next();
		System.out.println("�������û�����:\t");
		String userPasswd = InputTools.next();
		//-- 2.���˺ź��洫�ݸ�Service
		UserService us = new UserServiceImp();
		User user = us.userLogin(userAccount,userPasswd);
		//-- 3.���浱ǰ��¼���û�.�������ÿ��View�о�ֱ��ӵ���˵�ǰ��¼�û�.
		currUser = user;
		//-- 4.�жϵõ����û������Ƿ�Ϊnull.�����ݽ�����ж��¸�ҳ��.
		if (user == null) {
			nextView = this;
			loginCount ++;
			System.out.println("loginCount:\t" + loginCount);
			if (loginCount == 3) {
				System.out.println("�������̫��,����ע��ҳ��");
				nextView = new RegisterView();
			}
		}else {
			nextView = new MainView();
		}		
		return nextView;
	}	
}
