package carClient.View;

import carClient.Utils.InputUtils;

/**
 * �û����г������ʾҳ��
 * 
 * @author ���ľ�
 *
 */
public class ClientWelcomeView extends ClientView {

	public ClientWelcomeView() {
		super("��ӭҳ��");
	}

	/**
	 * client��ӭҳ�棺��¼��ע�ᣬ�˳�
	 */
	@Override
	public ClientView showCurrentView() {
		// ��ʾ
		System.out.println("1. ��¼ 2.ע�� 3.�˳�");
		// ��ȡ��Ϣ
		int chooseNum =InputUtils.myInputInt();
		// ���������������Ϣ
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
		// �õ�����������֪client
		return nextView;
	}

}
