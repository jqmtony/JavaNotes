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
		super("��¼����");
		regexUtils = new RegexUtils();
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		// ��ȡ����
		User user = new User();
		user.setUserName(regexUtils.getUserName());
		user.setPassWord(regexUtils.getUserPwd());
		// ��������
		String request = "User#Login#" + user.getUserName() + "#" + user.getPassWord();
		// ��ȡ��Ӧ
		String response = getServerResponse.getResponse(request);
		// �ж���ת
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