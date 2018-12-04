package com.hwua.view;

import java.util.Scanner;

import com.hwua.bean.User;
import com.hwua.util.ViewUtils;

/**
 * 使用代码来模拟一个界面层次出来
 * 
 * 	View 是所有视图层的父类.所有视图需要使用的资源.我们可以在
 *  父类中声明好.遵守继承,子类就直接拥有了
 * @author Administrator
 *
 */
public abstract class View {
	/**
	 * 保存下一个界面是谁
	 */
	protected View nextView;
	protected String viewName;
	/**
	 * 当前登录的用户
	 */
	protected User currUser;
	
	protected Scanner scan;
	
	private View() {
		scan = new Scanner(System.in);
	}
	
	public View(String viewName) {
		this();
		this.viewName = viewName;
	}
	
	protected abstract View showView();
	
	/**
	 * 模板模式
	 * 	规定好内部的算法逻辑.
	 * 
	 */
	
	public final View showCurrentView() {
		ViewUtils.showHeadLine(viewName);
		return showView();
	}
}
