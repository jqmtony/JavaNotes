package com.hwua.app;

import com.hwua.view.View;
import com.hwua.view.WelcomeView;

public class Main {

	/**
	 * 整个程序的入口.
	 * @param args
	 */
	public static void main(String[] args) {
		View view = new WelcomeView();
		while(view != null) {
			view = view.showCurrentView();
		}
	}
}
