package ManagerSystem.View;

import java.sql.SQLException;

import ManagerSystem.Domain.User;
import ManagerSystem.Service.UserService;
import ManagerSystem.Service.Impl.UserServiceImp;
import ManagerSystem.Utils.InputUtils;
import ManagerSystem.Utils.RegexUtils;

/**
 * 1. 登录，如果登录不成功，跳转注册，成功则跳转主界面
 * @author Administrator
 *
 */
public class LoginView extends View {

	public LoginView() {
		super("登录页面");
	}

	@Override
	public View showView() throws SQLException {
		// 获取登录信息，里面会验证是否符合正则表达式
		String userName = RegexUtils.getUserName();
		String userPwd = RegexUtils.getUserPwd();
		System.out.println("userName: "+userName+"userPwd: "+userPwd);
		// 将获取信息传给Service
		UserService us=new UserServiceImp();
		User user = us.loginUser(userName,userPwd);
		// 是否存在User，存在就进主页面，不存在就进注册页面
		if(user!=null) {
			currentUser = user;
			nextView = new MainView();
		}else {
			nextView = new RegisterView();
		}
		return nextView;
	}

}
