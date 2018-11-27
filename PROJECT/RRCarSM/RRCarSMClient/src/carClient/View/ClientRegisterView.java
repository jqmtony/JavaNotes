package carClient.View;

import java.io.IOException;
import java.net.UnknownHostException;

import carClient.Entity.User;
import carClient.Test.regexTest;
import carClient.Utils.InputUtils;
import carClient.Utils.JSONUtils;
import carClient.Utils.RegexUtils;
import carClient.Utils.getServerResponse;

/**
 * ע��ҳ�棬����ע��ɹ�>>��¼ҳ�� or ע��ʧ�� >>����ע��
 * 
 * @author ���ľ�
 *
 */
public class ClientRegisterView extends ClientView {
	RegexUtils regexUtils;

	public ClientRegisterView() throws UnknownHostException, IOException {
		super("ע��ҳ��");
		regexUtils = new RegexUtils();
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		User user = new User();
		System.out.println("�Ƿ�ص���ӭҳ�棬����Y���أ�");
		if (inputUtils.myInputString().equalsIgnoreCase("Y")) {
			nextView = new ClientWelcomeView();
		} else {
			// ��ȡע����Ϣ
			user.setUserName(regexUtils.getUserName());
			user.setPassWord(regexUtils.getUserPwd());
			System.out.println("�������Ա�");
			user.setSex(inputUtils.myInputString());
			System.out.println("�������û����루���⣩��");
			user.setUserIdNumber(inputUtils.myInputString());
			System.out.println("��������ϵ��ʽ��");
			user.setTel(inputUtils.myInputString());
			System.out.println("�������ַ��");
			user.setAddr(inputUtils.myInputString());
			// ��������
			String userStr = JSONUtils.objectToJSONString(user);
			String request = "User#Register#" + userStr;
			// ��ȡ��Ӧ
			String response = getServerResponse.getResponse(request);
			// ��תҳ��
			if (response.equals("��ӳɹ�")) {
				System.out.println(response);
				nextView = new ClientLoginView();
			} else {
				System.out.println(response);
				nextView = new ClientRegisterView();
			}
		}
		return nextView;
	}

}
