package carClient.View;

import java.io.IOException;
import java.net.UnknownHostException;
import carClient.Utils.InputUtils;

/**
 * �û����г������ʾҳ��
 * 
 * @author ���ľ�
 *
 */
public class ClientWelcomeView extends ClientView {
	public ClientWelcomeView() throws UnknownHostException, IOException {
		super("��ӭҳ��");
	}

	/**
	 * client��ӭҳ�棺��¼��ע�ᣬ�˳�
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	@Override
	public ClientView showCurrentView() throws UnknownHostException, IOException {
		// ѡ���½����Ա���û�
		System.out.println("===================\n1. ����Ա 2. �û�");
		int chooseAdmin = inputUtils.myInputInt();
		if(chooseAdmin==1) {
			nextView = new adminLoginView();
			return nextView;
		}
		// ��ʾ
		System.out.println("1. ��¼ 2.ע�� 3.�˳�");
		// ��ȡ��Ϣ
		int chooseNum =inputUtils.myInputInt();
		// ���������������Ϣ
		switch (chooseNum) {
		case 1:
			nextView = new ClientLoginView();
			break;
		case 2:
			nextView = new ClientRegisterView();
			break;
		case 3:
			nextView = new ClientWelcomeView();
			break;
		default:
			break;
		}
		// �õ�����������֪client
		return nextView;
	}

}
