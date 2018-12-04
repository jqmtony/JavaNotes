package com.hvua.domain.DAY15_implements.view;

import java.util.InputMismatchException;

public class welcomeView extends View {

	private static final int VIEW_ITEM_REGISTER = 2;
	private static final int VIEW_ITEM_LOGIN = 1;

	@Override
	public View showView() {
		/**
		 * 欢迎页面
		 */
		System.out.println("请输入你的选择：");
		System.out.println("1.登陆");
		System.out.println("2.注册");
		int chooseNum = 0;
		/**
		 * 输入的异常处理
		 */
		while(true) {
			try {
				chooseNum = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("输入有误！请重新输入！"); // TODO 输入其他数字无法捕捉
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
