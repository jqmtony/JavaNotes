package carClient.View;

import carClient.Entity.User;
import carClient.Utils.RegexUtils;

public class ClientLoginView extends ClientView {

	public ClientLoginView() {
		super("��¼����");
	}

	@Override
	public ClientView showCurrentView() {
		// ��ȡ����
		User user = new User();
		user.setUserName(RegexUtils.getUserName());
		user.setUserPwd(RegexUtils.getUserPwd());
		// ��������
		String request = 
		// �Ƿ����User�����ھͽ���ҳ�棬�����ھͽ�ע��ҳ��
		
		return nextView;
	}

}