package ManagerSystem.View;

import ManagerSystem.Utils.InputUtils;

public class WelcomeView extends View {
	/**
	 * 创建页面肯定是无参构造，通过super赋值参数viewName
	 */
	public WelcomeView() {
		super("欢迎页面");
	}

	/**
	 * 实现欢迎页面的功能，并将数据传入Service 1. 登录，如果登录不成功，跳转注册，成功则跳转主界面
	 * 2.注册，如果注册成功，跳转登录，执行登录界面的逻辑
	 */
	@Override
	public View showView() {
		int chooseNum = 0;
		// 解决输入内容不符合要求的异常，避免程序中断
		while(true) {
			System.out.println("1.登录 2.注册");
			chooseNum = InputUtils.nextInt();
			switch (chooseNum) {
			case 1:
				nextView =new LoginView();
				break;
			case 2:
				nextView = new RegisterView();
				break;
			default:
				System.out.println("没有该选项，请重新输入！");
				continue;
			}
			break;
		}
		return nextView;
	}

}
