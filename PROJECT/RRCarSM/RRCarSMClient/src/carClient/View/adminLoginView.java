package carClient.View;

import java.io.IOException;
import java.net.UnknownHostException;
import carClient.Entity.User;
import carClient.Utils.RegexUtils;

/**
 * ʵ�ֹ���Ա��½
 * 
 * @author ���ľ�
 *
 */
public class adminLoginView extends ClientView {
	User user = new User();
	RegexUtils regexUtils = new RegexUtils();
	
	public adminLoginView() throws UnknownHostException, IOException {
		super("����Ա��½");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ClientView showCurrentView() throws IOException {
		// ��½input
		
		while(true) {
			System.out.println("1. ��½ 2. �˳�");
			int choose1 = inputUtils.myInputInt();
			// ��½
			if(choose1==1) {
				user.setUserName(regexUtils.getUserName());
				user.setPassWord(regexUtils.getUserPwd());
				// ��������
				String request = "User#adminLogin#" + user.getUserName() + "#" + user.getPassWord();
				// ��ȡ��Ӧ
				String response = getServerResponse.getResponse(request);
				// �жϹ���Ա���
				if (response.equals("����Ա��¼�ɹ�")) {
					currentUser = user;
					System.out.println(response);
					// �������ҳ��
					nextView = new adminViewCR();
					break;
				} else {
					System.out.println(response+"�����������룡");
				}
			}else if(choose1==2 ) {
				// �˳�
				nextView = new ClientWelcomeView();
				break;
			}
		}
		
		return nextView;
	}

}
