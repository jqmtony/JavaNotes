package carClient.Utils;

import carClient.Entity.insertCar;

/**
 * ֱ�ӵ���������ʽ�ķ���������ʵ���û��ĵ�¼��ע��
 */
public class RegexUtils {
	private static final String USER_PWD_REGEX = "[a-zA-Z0-9]{6,12}";
	protected static final String USER_NAME_REGEX = "[a-zA-Z0-9]{6,12}";
	/**
	 * ��ȡUser���û���
	 */
	public String getUserName() {
		InputUtils inputUtils = new InputUtils();
		String userName = null;
		while (true) {
			System.out.println("�������û�����");
			userName  = inputUtils.myInputString();
			// ���������������ʽ����ô�ͼ�����
			if (!userName.matches(USER_NAME_REGEX)) {
				System.out.println("�û�����ʽ���ԣ�");
				continue;
			}
			break;
		}
		return userName;
	}

	/**
	 * ��ȡUser������
	 */
	public String getUserPwd() {
		String userPwd = null;
		InputUtils inputUtils = new InputUtils();
		while (true) {
			System.out.println("���������룺");
			userPwd = inputUtils.myInputString();
			// ���������������ʽ����ô�ͼ�����
			if (!userPwd.matches(USER_PWD_REGEX)) {
				System.out.println("�û������벻�ԣ�");
				continue;
			}
			break;
		}
		return userPwd;
	}
}
