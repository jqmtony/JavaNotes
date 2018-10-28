package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.bean.User;
import com.hvua.domain.DAY15_implements.dao.UserDao;
import com.hvua.domain.DAY15_implements.daoImpl.UserDaoImpl;
import com.hvua.domain.DAY15_implements.service.UserService;
import com.hvua.domain.DAY15_implements.serviceImpl.UserServiceImpl;

public class loginView extends View {

	@Override
	public View showView() {
		viewTools.showLine();
		System.out.println(" >>>> Login Page");
		// -- 1. �����û�����
		System.out.println("�������û�����");
		String name = scan.next();
		System.out.println("���������룺");
		String psw = scan.next();
		// -- 2. ��֤�û���Ϣ
		UserService us = new UserServiceImpl(); // ʵ��-ҵ��-����-��
		int result = us.userLogin(name, psw);
		// -- 3. �������ת
		switch (result) {
		// 3.1 ��֤�ɹ� >> �û�������
		case UserService.LOGIN_SUCCESS:
			System.out.println("��ʾ�����ѳɹ���½");
			nextView = new mainView();
			break;
		// 3.2 �û��������� >> ע��ҳ��
		case UserService.LOGIN_ERRO_NOUSER:
			System.out.println("��ʾ���û���������");
			nextView = new registerView();
			break;
		// 3.3 ������� >> 3�λ��ᣬ�޷���½
		case UserService.LOGIN_ERRO_PSW:
			System.out.println("��ʾ�����벻��ȷ");
			nextView = this;
			break;
		default:
			break;
		}
		// -- 4. ��תҳ��
		return nextView;
	}

}
