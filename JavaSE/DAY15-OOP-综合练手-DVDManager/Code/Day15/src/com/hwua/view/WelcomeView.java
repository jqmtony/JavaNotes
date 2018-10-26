package com.hwua.view;

import java.util.InputMismatchException;

import com.hwua.tools.ViewTools;

public class WelcomeView extends View {

	private static final int VIEW_ITEM_REGISTER = 2;
	private static final int VIEW_ITEM_LOGIN = 1;
	private int chooseNumber;

	@Override
	public View showView() {
		System.out.println("��ӭʹ������DVD������");
		ViewTools.showLine();
		System.out.println("\t1.  ��¼");
		System.out.println("\t2.  ע��");
		ViewTools.showLine();
		System.out.println("��ѡ��:\n");
		while(true) {
			try {
				chooseNumber = scan.nextInt();
				if (chooseNumber != VIEW_ITEM_LOGIN && chooseNumber != VIEW_ITEM_REGISTER) {
					System.out.println("û�и�ѡ��,����������");
					continue;
				}
				break;
			}catch (InputMismatchException e) {
				System.out.println("�������Ͳ�ƥ��,��������");
				//-- ����д.���������Ͳ�������ݴ�scan��ȡ����.
				scan.next();
			}
		}
		switch (chooseNumber) {
			case VIEW_ITEM_LOGIN:
				nextView = new LoginView();
				break;
			case VIEW_ITEM_REGISTER:
				nextView = new RegisterView();
				break;

			default:
				break;
		}
		//-- ������һ��ҳ��
		return nextView;
	}

}
