package carClient.View;

import java.io.IOException;

import com.alibaba.fastjson.JSON;

import carClient.Entity.User;
import carClient.Utils.RegexUtils;
import carClient.Utils.getServerResponse;

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
		String request = "User#Login#"+user.getUserName()+"#"+user.getPassWord();
		// ��ȡ��Ӧ
		getServerResponse getServerResponse = new getServerResponse();
		String response = getServerResponse.getResponse(request);
		// �ж���ת
		if(response.equals("��¼�ɹ�")) {
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