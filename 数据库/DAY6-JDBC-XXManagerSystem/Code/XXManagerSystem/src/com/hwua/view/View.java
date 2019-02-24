package com.hwua.view;

import com.hwua.domain.User;

public abstract class View {
	/**
	 *  '��һ��ҳ��
	 */
	protected View nextView;
	protected User currentUser;
	/**
	 *  '����ǰ����һ��ҳ��
	 */
	private String viewName;
	
	public View(String viewName) {
		this.viewName = viewName;
	}
	
	protected abstract View showCurrentView();
	
	/**
	 * ' ģ�巽�����ģʽ.������װ�㷨
	 * ' ��final���εķ�������÷��������Ա���д
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
