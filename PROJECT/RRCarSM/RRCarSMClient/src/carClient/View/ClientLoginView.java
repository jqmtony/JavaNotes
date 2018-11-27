package carClient.View;

import java.io.IOException;
import java.net.UnknownHostException;

import com.alibaba.fastjson.JSON;

import carClient.Entity.User;
import carClient.Utils.RegexUtils;
import carClient.Utils.getServerResponse;

public class ClientLoginView extends ClientView {
	RegexUtils regexUtils;

	public ClientLoginView() throws UnknownHostException, IOException {
		super("登录界面");
		regexUtils = new RegexUtils();
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		// 获取参数
		User user = new User();
		user.setUserName(regexUtils.getUserName());
		user.setPassWord(regexUtils.getUserPwd());
		// 发送请求
		String request = "User#Login#" + user.getUserName() + "#" + user.getPassWord();
		// 获取相应
		String response = getServerResponse.getResponse(request);
		// 判断跳转
		if (response.equals("SUCCESS")) {
			currentUser = user;
			System.out.println(response);
			nextView = new ClientViewCars();
		} else {
			System.out.println(response);
			nextView = new ClientRegisterView();
		}
		return nextView;
	}
}