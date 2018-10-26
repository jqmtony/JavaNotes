package com.hwua.view;

import java.util.InputMismatchException;

import com.hwua.tools.ViewTools;

public class WelcomeView extends View {

	private static final int VIEW_ITEM_REGISTER = 2;
	private static final int VIEW_ITEM_LOGIN = 1;
	private int chooseNumber;

	@Override
	public View showView() {
		System.out.println("欢迎使用迷你DVD管理器");
		ViewTools.showLine();
		System.out.println("\t1.  登录");
		System.out.println("\t2.  注册");
		ViewTools.showLine();
		System.out.println("请选择:\n");
		while(true) {
			try {
				chooseNumber = scan.nextInt();
				if (chooseNumber != VIEW_ITEM_LOGIN && chooseNumber != VIEW_ITEM_REGISTER) {
					System.out.println("没有该选项,请重新输入");
					continue;
				}
				break;
			}catch (InputMismatchException e) {
				System.out.println("输入类型不匹配,重新输入");
				//-- 必须写.把上面类型不配的数据从scan中取出来.
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
		//-- 返回下一个页面
		return nextView;
	}

}
