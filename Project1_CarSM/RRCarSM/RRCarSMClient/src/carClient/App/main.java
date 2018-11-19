package carClient.App;

import carClient.View.ClientView;
import carClient.View.ClientWelcomeView;

/**
 * 客户端的启动class，进入View，每个View都作为一个线程进入服务器
 * @author 李文娟
 *
 */


public class main {
	public static void main(String[] args) {
		ClientView cView = new ClientWelcomeView();
		while(cView!=null) {
			cView = cView.showCurrentView();
		}
	}
}
