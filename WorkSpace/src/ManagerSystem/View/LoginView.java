package ManagerSystem.View;

import java.sql.SQLException;

import ManagerSystem.Domain.User;
import ManagerSystem.Service.UserService;
import ManagerSystem.Service.Impl.UserServiceImp;
import ManagerSystem.Utils.RegexUtils;

/**
 * 1. ��¼�������¼���ɹ�����תע�ᣬ�ɹ�����ת������
 * 
 * @author Administrator
 *
 */
public class LoginView extends View {

	public LoginView() {
		super("��¼ҳ��");
	}

	@Override
	public View showView() throws SQLException {
		// ��ȡ��¼��Ϣ���������֤�Ƿ����������ʽ
		String userName = " ";
		String userPwd = " ";
		userName = RegexUtils.getUserName();
		userPwd = RegexUtils.getUserPwd();
		// ����ȡ��Ϣ����Service
		UserService us = new UserServiceImp();
		User user = us.loginUser(userName, userPwd);
		// �Ƿ����User�����ھͽ���ҳ�棬�����ھͽ�ע��ҳ��
		if (user != null) {
			currentUser = user;
			nextView = new MainView();
		} else {
			nextView = new RegisterView();
		}
		return nextView;
	}

}
