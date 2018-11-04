package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Bean.User;
import D19_CustomerContactsUser.Service.UserService;
import D19_CustomerContactsUser.Service.Imp.UserServiceImp;

public class LoginView extends View {

	public LoginView() {
		super("登录页面");
	}

	@Override
	protected View showView() {
		// 输入登录信息，用户名是昵称，不用输入
		System.out.println("请输入账号：");
		String userAccount = scan.next();
		System.out.println("请输入密码：");
		String userPsw = scan.next();
		// 把账号信息传送给Service
		UserService userService = new UserServiceImp();
		User user = userService.loginUser(userAccount, userPsw);
		// 保存当前登录用户，使之后的所有View都可以拥有这个用户
		currentUser = user;
		// 用户是否成功登录
		if(user!=null) {
			System.out.println("提示：登录成功！");
			nextView = new MainView();
		}else {
			System.out.println("提示：请重新登录！");
			nextView = this;
		}
		return nextView;
	}

}
