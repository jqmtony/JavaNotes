package com.hwua.view;

import com.hwua.utils.InputUtils;

public class WelcomeView extends View{

	public WelcomeView() {
		super("��ӭ����");
	}

	@Override
	public View showCurrentView() {
		showLine();
		System.out.println("\t1.��¼");
		System.out.println("\t2.ע��");
		showLine();
		
		System.out.println("������ѡ��:\t");
		while (true) {
			//-- 1.¼��
			int choose = InputUtils.nextInt();
			//-- 2.�ж�
			switch (choose) {
			case 1:
				//-- 3.��nextView��ֵ
				nextView = new LoginView();
				break;
			case 2:
				//-- 3.��nextView��ֵ
				nextView = new RegisterView();
				break;
			default:
				System.out.println("û�и�ѡ��,��������");
				continue;
			}
			break;
		}		
		//-- 4.����
		return nextView;
	}
	

}
