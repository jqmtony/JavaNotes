package D19_CustomerContactsUser.Bean;

import java.io.Serializable;

import D19_CustomerContactsUser.Util.DataSet;

public class User implements Serializable {
	// 反序列化
	private static final long serialVersionUID = 5563903754491139598L;
	// 属性
	private int userId;
	private String userAccount;
	private String userNickName;
	private String userPwd;
	/**
	 * get set
	 */
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 构造
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userAccount, String userNickName, String userPwd) {
		super();
		this.userId = DataSet.getLastUserID();
		this.userAccount = userAccount;
		this.userNickName = userNickName;
		this.userPwd = userPwd;
	}
	
}
