package com.hwua.view;

import com.hwua.utils.InputUtils;

public class WelcomeView extends View{

	public WelcomeView() {
		super("欢迎界面");
	}

	@Override
	public View showCurrentView() {
		showLine();
		System.out.println("\t1.登录");
		System.out.println("\t2.注册");
		showLine();
		
		System.out.println("请输入选择:\t");
		while (true) {
			//-- 1.录入
			int choose = InputUtils.nextInt();
			//-- 2.判断
			switch (choose) {
			case 1:
				//-- 3.给nextView赋值
				nextView = new LoginView();
				break;
			case 2:
				//-- 3.给nextView赋值
				nextView = new RegisterView();
				break;
			default:
				System.out.println("没有该选项,重新输入");
				continue;
			}
			break;
		}		
		//-- 4.返回
		return nextView;
	}
	

}
