package com.hwua.app;

import com.hwua.view.View;
import com.hwua.view.WelcomeView;

public class Main {

	public static void main(String[] args) {
		//-- 所有代码从这里开始!
		View view = new WelcomeView();
		
		while(view != null) {
			view = view.showView();
		}
		
		System.out.println("欢迎再次光临!");
	}
}
