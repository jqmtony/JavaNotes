package carClient.View;

import java.io.IOException;

import com.alibaba.fastjson.JSON;

import carClient.Entity.User;
import carClient.Utils.RegexUtils;
import carClient.Utils.getServerResponse;

public class ClientLoginView extends ClientView {

	public ClientLoginView() {
		super("登录界面");
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		// 获取参数
		User user = new User();
		user.setUserName(RegexUtils.getUserName());
		user.setPassWord(RegexUtils.getUserPwd());
		// 发送请求
		String request = "User#Login#"+user.getUserName()+"#"+user.getPassWord();
		// 获取相应
		getServerResponse getServerResponse = new getServerResponse();
		String response = getServerResponse.getResponse(request);
		// 判断跳转
		if(response.equals("登录成功")) {
			currentUser = user;
			System.out.println(response);
			nextView = new ClientViewCars();
		}else {
			System.out.println(response);
			nextView = new ClientRegisterView();
		}
		return nextView;
	}
}