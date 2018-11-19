package carClient.View;

import carClient.Utils.InputUtils;

/**
 * 用户运行程序的启示页面
 * 
 * @author 李文娟
 *
 */
public class ClientWelcomeView extends ClientView {

	public ClientWelcomeView() {
		super("欢迎页面");
	}

	/**
	 * client欢迎页面：登录，注册，退出
	 */
	@Override
	public ClientView showCurrentView() {
		// 提示
		System.out.println("1. 登录 2.注册 3.退出");
		// 获取信息
		int chooseNum =InputUtils.myInputInt();
		// 请求服务器处理信息
		switch (chooseNum) {
		case 1:
			nextView = new ClientLoginView();
			break;
		case 2:
			nextView = new ClientRegisterView();
			break;
		case 3:
			nextView = null;
			break;
		default:
			break;
		}
		// 拿到处理结果，告知client
		return nextView;
	}

}
