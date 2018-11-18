package ManagerSystem.Domain;

/**
 * User类，主要用于客户的登录和注册，包含的字段为，其实也就是数据库里的字段：
 * 账户名、用户名、密码、id（数据库中自动生成）；为了保护用户信息，必须设置为private
 * 
 * @author Administrator
 *
 */
public class User {
	/**
	 * 账户名、用户名、密码、id（数据库中自动生成）
	 */
	private int userID;
	private String userAccount;
	private String userName;
	private String userPwd;

	public int getUserID() {
		return userID;
	}

	/**
	 * get and set method
	 * 
	 * @param 用户信息的字段
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	/**
	 * 输出方式
	 */
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userAccount=" + userAccount + ", userName=" + userName + ", userPwd="
				+ userPwd + "]";
	}

	/**
	 * 有参构造
	 */
	public User(int userID, String userAccount, String userName, String userPwd) {
		this.userID = userID;
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPwd = userPwd;
	}
}
