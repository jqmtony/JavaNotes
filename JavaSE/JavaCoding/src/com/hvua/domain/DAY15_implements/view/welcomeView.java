package com.hvua.domain.DAY15_implements.view;

import java.util.InputMismatchException;

public class welcomeView extends View {

	private static final int VIEW_ITEM_REGISTER = 2;
	private static final int VIEW_ITEM_LOGIN = 1;

	@Override
	public View showView() {
		/**
		 * ��ӭҳ��
		 */
		System.out.println("���������ѡ��");
		System.out.println("1.��½");
		System.out.println("2.ע��");
		int chooseNum = 0;
		/**
		 * ������쳣����
		 */
		while(true) {
			try {
				chooseNum = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�����������������룡"); // TODO �������������޷���׽
			}
			switch (chooseNum) {
			case VIEW_ITEM_LOGIN:
				currentView = this;
				nextView = new loginView();
				break;
			case VIEW_ITEM_REGISTER:
				currentView = this;
				nextView = new registerView();
				break;
			default:
				break;
			}
			return nextView;
		}
	}

}
