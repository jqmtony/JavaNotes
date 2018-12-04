package com.hwua.view;

import com.hwua.util.InputTools;

/**
 * 
 * @author Administrator
 *
 */
public class WelcomeView extends View{
	private static final int VIEW_ITEM_REGISTER = 2;
	private static final int VIEW_ITEM_LOGIN = 1;

	public WelcomeView() {
		super("��ӭҳ��");		
	}

	@Override
	public View showView() {
		System.out.println("1.��¼\n2.ע��");
		int itemChoose = InputTools.nextInt();
		switch (itemChoose) {
		case VIEW_ITEM_LOGIN:
			nextView = new LoginView();
			break;
		case VIEW_ITEM_REGISTER:
			nextView = new RegisterView();
			break;
		default:
			System.out.println("û�и�ѡ��");
			nextView = this;
			break;
		}	
				 
		return nextView;
	}

	
}
