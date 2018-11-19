package carClient.Entity;

/**
 * 用户表内包含字段：userID（自动增长），userAccount, userName,userPwd
 * 
 * @author 李文娟
 *
 */
public class User {
	private String userID;
	private String userAccount;
	private String userName;
	private String userPwd;
	/**
	 * 构造
	 */
	public User() {
	}

	public User(String userID, String userAccount, String userName, String userPwd) {
		super();
		this.userID = userID;
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPwd = userPwd;
	}


	/**
	 * get 和 set 方法
	 */
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
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

}
