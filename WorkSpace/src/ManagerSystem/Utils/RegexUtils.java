package ManagerSystem.Utils;

/**
 * ֱ�ӵ���������ʽ�ķ���������ʵ���û��ĵ�¼��ע��
 */
public class RegexUtils {

	private static final String USER_PWD_REGEX = "[a-zA-Z0-9]{6,12}";
	protected static final String USER_NAME_REGEX = "[a-zA-Z0-9]{6,12}";
	/**
	 * ��ȡUser���û���
	 */
	public static String getUserName() {
		String userName = null;
		while (true) {
			System.out.println("�������û�����");
			userName = InputUtils.nextStr();
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
	public static String getUserPwd() {
		String userPwd = null;
		while (true) {
			System.out.println("���������룺");
			userPwd = InputUtils.nextStr();
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
