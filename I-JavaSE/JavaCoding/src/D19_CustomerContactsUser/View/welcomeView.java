package D19_CustomerContactsUser.View;

import java.util.InputMismatchException;

public class welcomeView extends View {

	public welcomeView() {
		super("��ӭ����");
	}

	@Override
	protected View showView() {
		System.out.println("1.��¼\n2.ע��");
		// 1.����ѡ��
		int chooseNum = scan.nextInt();
		// 2.�����Ӧҳ��
		while (true) {
			try {
				switch (chooseNum) {
				case 1:
					nextView = new LoginView();
					break;
				case 2:
					nextView = new RegisterView();
					break;
				default:
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("���������룺");
			}
			// 3.�жϡ����
			return nextView;
		}
		
	}

}
