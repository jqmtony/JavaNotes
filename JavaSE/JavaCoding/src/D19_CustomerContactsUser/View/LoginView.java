package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Bean.User;
import D19_CustomerContactsUser.Service.UserService;
import D19_CustomerContactsUser.Service.Imp.UserServiceImp;

public class LoginView extends View {

	public LoginView() {
		super("��¼ҳ��");
	}

	@Override
	protected View showView() {
		// �����¼��Ϣ���û������ǳƣ���������
		System.out.println("�������˺ţ�");
		String userAccount = scan.next();
		System.out.println("���������룺");
		String userPsw = scan.next();
		// ���˺���Ϣ���͸�Service
		UserService userService = new UserServiceImp();
		User user = userService.loginUser(userAccount, userPsw);
		// ���浱ǰ��¼�û���ʹ֮�������View������ӵ������û�
		currentUser = user;
		// �û��Ƿ�ɹ���¼
		if(user!=null) {
			System.out.println("��ʾ����¼�ɹ���");
			nextView = new MainView();
		}else {
			System.out.println("��ʾ�������µ�¼��");
			nextView = this;
		}
		return nextView;
	}

}
