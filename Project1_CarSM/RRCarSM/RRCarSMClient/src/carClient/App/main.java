package carClient.App;

import carClient.View.ClientView;
import carClient.View.ClientWelcomeView;

/**
 * �ͻ��˵�����class������View��ÿ��View����Ϊһ���߳̽��������
 * @author ���ľ�
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
