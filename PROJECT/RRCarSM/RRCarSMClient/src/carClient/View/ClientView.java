package carClient.View;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import carClient.Entity.User;
import carClient.Utils.InputUtils;
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
	protected InputUtils inputUtils;
	protected static getServerResponse getServerResponse;
	protected static Socket socket;
	static {
		try {
			socket = new Socket("127.0.0.1", 2222);
			getServerResponse = new getServerResponse(socket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 声明页面信息
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public ClientView(String viewName) throws UnknownHostException, IOException {
		this.viewName = viewName;
		showHeader();
		if(viewName.equals("管理页面")||viewName.equals("管理员登陆")){
			ShowFormatUtils.showAdminMenu();
		}else {
			ShowFormatUtils.showClientMenu();
		}
		inputUtils = new InputUtils();
	}

	public void showHeader() {
		System.out.println("\n****************************" + viewName + "****************************");
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
