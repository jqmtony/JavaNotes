package carClient.Entity;

/**
 * �û����ڰ����ֶΣ�userID���Զ���������userAccount, userName,userPwd
 * 
 * @author ���ľ�
 *
 */
public class User {
	private String userID;
	private String userAccount;
	private String userName;
	private String userPwd;
	/**
	 * ����
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
	 * get �� set ����
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
