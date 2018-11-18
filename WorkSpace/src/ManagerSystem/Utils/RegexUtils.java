package ManagerSystem.Utils;

/**
 * 直接调用正则表达式的方法工具类实现用户的登录和注册
 */
public class RegexUtils {

	private static final String USER_PWD_REGEX = "[a-zA-Z0-9]{6,12}";
	protected static final String USER_NAME_REGEX = "[a-zA-Z0-9]{6,12}";
	/**
	 * 获取User的用户名
	 */
	public static String getUserName() {
		String userName = null;
		while (true) {
			System.out.println("请输入用户名：");
			userName = InputUtils.nextStr();
			// 如果不满足正则表达式，那么就继续输
			if (!userName.matches(USER_NAME_REGEX)) {
				System.out.println("用户名格式不对！");
				continue;
			}
			break;
		}
		return userName;
	}

	/**
	 * 获取User的密码
	 */
	public static String getUserPwd() {
		String userPwd = null;
		while (true) {
			System.out.println("请输入密码：");
			userPwd = InputUtils.nextStr();
			// 如果不满足正则表达式，那么就继续输
			if (!userPwd.matches(USER_PWD_REGEX)) {
				System.out.println("用户名密码不对！");
				continue;
			}
			break;
		}
		return userPwd;
	}
}
