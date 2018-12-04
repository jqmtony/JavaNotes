package com.hwua.view;

import java.util.Scanner;

import com.hwua.bean.User;

/**
 * 设计View作为界面类.
 * 	View 是所有界面的根类
 * 
 * View 只负责显示.基本不在View中做逻辑和业务相关的内容.
 * 
 * @author Administrator
 *
 */
public abstract class View {

	/**
	 * 保存下一个View对象
	 */
	protected View nextView;
	
	/**
	 * 当用户登录成功后保存用户对象.
	 */
	protected User currentUser;
	
	/**
	 * 因为在所有的界面中我们都需要使用Scanner来接收键盘录入.所以在父类中
	 * 声明好. 子类遵循继承就直接拥有了
	 */
	protected Scanner scan;
	
	public View() {
		scan = new Scanner(System.in);
	}
	
	
	/**
	 * 显示当前视图的界面内容
	 * @return
	 */
	public abstract View showView();
	
	
	
	
	
	
	
}




