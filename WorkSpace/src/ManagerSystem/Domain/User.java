package ManagerSystem.Domain;

/**
 * User�࣬��Ҫ���ڿͻ��ĵ�¼��ע�ᣬ�������ֶ�Ϊ����ʵҲ�������ݿ�����ֶΣ�
 * �˻������û��������롢id�����ݿ����Զ����ɣ���Ϊ�˱����û���Ϣ����������Ϊprivate
 * 
 * @author Administrator
 *
 */
public class User {
	/**
	 * �˻������û��������롢id�����ݿ����Զ����ɣ�
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
	 * @param �û���Ϣ���ֶ�
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
	 * �����ʽ
	 */
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userAccount=" + userAccount + ", userName=" + userName + ", userPwd="
				+ userPwd + "]";
	}

	/**
	 * �вι���
	 */
	public User(int userID, String userAccount, String userName, String userPwd) {
		this.userID = userID;
		this.userAccount = userAccount;
		this.userName = userName;
		this.userPwd = userPwd;
	}
}
