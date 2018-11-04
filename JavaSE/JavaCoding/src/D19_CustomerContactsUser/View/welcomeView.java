package D19_CustomerContactsUser.View;

import java.util.InputMismatchException;

public class welcomeView extends View {

	public welcomeView() {
		super("欢迎界面");
	}

	@Override
	protected View showView() {
		System.out.println("1.登录\n2.注册");
		// 1.输入选择
		int chooseNum = scan.nextInt();
		// 2.进入对应页面
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
				System.out.println("请重新输入：");
			}
			// 3.判断、输出
			return nextView;
		}
		
	}

}
