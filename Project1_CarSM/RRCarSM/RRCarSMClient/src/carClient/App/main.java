package carClient.App;

import java.io.IOException;

import carClient.View.ClientView;
import carClient.View.ClientWelcomeView;

/**
 * �ͻ��˵�����class������View��ÿ��View����Ϊһ���߳̽��������
 * @author ���ľ�
 *
 */


public class main {
	public static void main(String[] args) throws IOException {
		ClientView cView = new ClientWelcomeView();
		while(cView!=null) {
			cView = cView.showCurrentView();
		}
	}
}
