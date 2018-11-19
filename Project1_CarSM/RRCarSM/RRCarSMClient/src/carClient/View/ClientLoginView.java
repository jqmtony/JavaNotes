package carClient.View;

import carClient.Entity.User;
import carClient.Utils.RegexUtils;

public class ClientLoginView extends ClientView {

	public ClientLoginView() {
		super("登录界面");
	}

	@Override
	public ClientView showCurrentView() {
		// 获取参数
		User user = new User();
		user.setUserName(RegexUtils.getUserName());
		user.setUserPwd(RegexUtils.getUserPwd());
		// 发送请求
		String request = 
		// 是否存在User，存在就进主页面，不存在就进注册页面
		
		return nextView;
	}

}