package com.hwua.view;

import com.hwua.domain.User;

public abstract class View {
	/**
	 *  '下一个页面
	 */
	protected View nextView;
	protected User currentUser;
	/**
	 *  '代表当前是哪一个页面
	 */
	private String viewName;
	
	public View(String viewName) {
		this.viewName = viewName;
	}
	
	protected abstract View showCurrentView();
	
	/**
	 * ' 模板方法设计模式.用来封装算法
	 * ' 被final修饰的方法代表该方法不可以被重写
	 */
	public final View showView() {
		showHeader();
		return showCurrentView();
	}
	
	private final void showHeader() {
		System.out.println(">>>>>>>>>>" + viewName);
	}
	
	protected final void showLine() {
		System.out.println("\n********************\n");
	}
	
	
	
	
	
	
	
	
	
}
