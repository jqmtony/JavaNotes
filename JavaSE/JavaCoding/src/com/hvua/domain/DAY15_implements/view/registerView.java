package com.hvua.domain.DAY15_implements.view;

import com.hvua.domain.DAY15_implements.Tools.viewTools;
import com.hvua.domain.DAY15_implements.service.UserService;
import com.hvua.domain.DAY15_implements.serviceImpl.UserServiceImpl;

public class registerView extends View {

	@Override
	public View showView() {
		viewTools.showLine();
		System.out.println(">>>> ע��ҳ��");
		// -- 1.��ȡ�û���������
		System.out.println("�������û�����");
		String name = " ";
		UserService us = new UserServiceImpl();
		// -- 1.1�û�������>>>��������
		while (true) {
			name = scan.next();
			if (us.checkNameExist(name)) {
				break; // �����falseӦ�û��Զ�����whileѭ��
			}
			System.out.println("�û����Ѵ��ڣ����������룺");
		}
		// -- 1.2 �û������� >>> ��������
		System.out.println("���������룺");
		String psw = scan.next();
		// -- 2.�洢�û���Ϣ
		if (us.registerUser(name, psw)) {
			System.out.println("��ʾ������ע��ɹ�");
			// -- 3.��תҳ��>>>��ҳ��
			nextView = new mainView();
		}

		return nextView;
	}

}
