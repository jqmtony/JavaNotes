package carClient.View;

import java.io.IOException;

import com.alibaba.fastjson.JSON;

import carClient.Entity.User;
import carClient.Utils.RegexUtils;

public class ClientLoginView extends ClientView {

	public ClientLoginView() {
		super("��¼����");
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		// ��ȡ����
		User user = new User();
		user.setUserName(RegexUtils.getUserName());
		user.setPassWord(RegexUtils.getUserPwd());
		// ��������
		String request = "Login#"+user.getUserName()+"#"+user.getPassWord();
		// ��ȡ��Ӧ
		String response = getServerResponse.getResponse(request);
		// �ж���ת
		if(response.equals("success")) {
			currentUser = user;
			nextView = new ClientViewCars();
		}else {
			nextView = new ClientRegisterView();
		}
		return nextView;
	}

}