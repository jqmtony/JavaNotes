package com.hwua.bean;

public class User {
	private String userName;
	private String userPwd;
	private String userId;
	private String userPhone;
	private String userEmail;
	private String userActiveCode;

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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserActiveCode() {
		return userActiveCode;
	}

	public void setUserActiveCode(String userActiveCode) {
		this.userActiveCode = userActiveCode;
	}

	public User(String userName, String userPwd, String userId, String userPhone, String userEmail,
			String userActiveCode) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.userId = userId;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userActiveCode = userActiveCode;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd + ", userId=" + userId + ", userPhone=" + userPhone
				+ ", userEmail=" + userEmail + ", userActiveCode=" + userActiveCode + "]";
	}
}
