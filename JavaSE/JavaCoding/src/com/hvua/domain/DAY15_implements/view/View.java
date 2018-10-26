package com.hvua.domain.DAY15_implements.view;

import java.util.Scanner;

import com.hvua.domain.DAY15_implements.bean.User;

public abstract class View {
	protected View currentView;
	protected View nextView;
	protected User currentUser;

	protected Scanner scan; // 方便View的子类去用

	public View() {
		// 创建View的同时创建了Scanner
		scan = new Scanner(System.in);
	}

	public abstract View showView();
}
