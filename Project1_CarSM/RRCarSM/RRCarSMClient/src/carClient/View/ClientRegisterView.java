package carClient.View;

import java.io.IOException;

import carClient.Entity.User;
import carClient.Utils.InputUtils;
import carClient.Utils.JSONUtils;
import carClient.Utils.RegexUtils;
import carClient.Utils.getServerResponse;

/**
 * ע��ҳ�棬����ע��ɹ�>>��¼ҳ�� or ע��ʧ�� >>����ע��
 * @author ���ľ�
 *
 */
public class ClientRegisterView extends ClientView {

	public ClientRegisterView( ) {
		super("ע��ҳ��");
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		User user = new User();
		// ��ȡע����Ϣ
		user.setUserName(RegexUtils.getUserName());
		user.setPassWord(RegexUtils.getUserPwd());
		System.out.println("�������Ա�");
		user.setSex(InputUtils.myInputString());
		System.out.println("�������û����루���⣩��");
		user.setUserIdNumber(InputUtils.myInputString());
		System.out.println("��������ϵ��ʽ��");
		user.setTel(InputUtils.myInputString());
		System.out.println("�������ַ��");
		user.setAddr(InputUtils.myInputString());
		// ��������
		String userStr = JSONUtils.objectToJSONString(user);
		String request = "User#Register#"+userStr;
		// ��ȡ��Ӧ
		getServerResponse getServerResponse = new getServerResponse();
		String response = getServerResponse.getResponse(request);
		// ��תҳ��
		if(response.equals("��ӳɹ�")) {
			System.out.println(response);
			nextView = new ClientLoginView();
		}else {
			System.out.println(response);
			nextView = new ClientRegisterView();
		}
		return nextView;
	}

}
