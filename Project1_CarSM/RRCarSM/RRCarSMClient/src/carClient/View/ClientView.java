package carClient.View;

import java.io.IOException;

import carClient.Entity.User;
import carClient.Utils.ShowFormatUtils;
import carClient.Utils.getServerResponse;

/**
 * 定义View的共同属性，为了省事儿
 * 
 * @author 李文娟
 *
 */
public abstract class ClientView {
	protected String viewName;
	protected getServerResponse getServerResponse;
	/**
	 * 声明页面信息
	 */
	public ClientView(String viewName) {
		this.viewName = viewName;
		showHeader();
		ShowFormatUtils.showClientMenu();
	}

	public void showHeader() {
		System.out.println("======" + viewName + "======>>>>");
	}

	/**
	 * 展示当前页面并返回下一个页面
	 * @throws IOException 
	 */
	public abstract ClientView showCurrentView() throws IOException;

	public ClientView nextView;
	/**
	 * 用户一旦登录，所有页面可获得其信息并输出
	 */
	protected User currentUser;
	/**
	 * 声明Socket
	 */
	
}
