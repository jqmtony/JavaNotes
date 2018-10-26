package com.hvua.domain.DAY15_implements.view;

import java.util.Scanner;

import com.hvua.domain.DAY15_implements.bean.User;

public abstract class View {
	protected View currentView;
	protected View nextView;
	protected User currentUser;

	protected Scanner scan; // ����View������ȥ��

	public View() {
		// ����View��ͬʱ������Scanner
		scan = new Scanner(System.in);
	}

	public abstract View showView();
}
