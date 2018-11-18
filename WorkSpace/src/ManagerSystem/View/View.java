package ManagerSystem.View;

import java.sql.SQLException;

import ManagerSystem.Domain.User;

public abstract class View {
	/**
	 * 有参构造，强制子类命名，并在初始化时输出当前页面名称
	 */
	private String viewName;

	public View(String viewName) {
		this.viewName = viewName;
		showHeader();
	}

	private void showHeader() {
		System.out.println(">>>>>>>>>>>>>>" + viewName);
	}

	/**
	 * 页面内容在showView里面执行
	 * @throws SQLException 
	 */
	public abstract View showView() throws SQLException;

	/**
	 * 跳转页面通过return nextView实现
	 */
	protected View nextView;
	/**
	 * 当前用户，之所以要提供是因为所有页面是通的，你登录了就可以访问所有的页面
	 *
	 */
	protected User currentUser;
}
