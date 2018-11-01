package com.hwua.bean;

import java.io.Serializable;

import com.hwua.util.DataSet;

public class User implements Serializable, Comparable<User> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5563903754491139598L;
	private int userId;
	private String userAccount;
	private String userNickName;
	private String userPwd;
	/**
	 * 用户状态 true 可用 false 不可用
	 */
	private boolean userState;

	public int getUserId() {
		return userId;
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

	public boolean isUserState() {
		return userState;
	}

	public void setUserState(boolean userState) {
		this.userState = userState;
	}

	public User(String userAccount, String userNickName, String userPwd) {
		this.userId = DataSet.getLastUserId();
		this.userAccount = userAccount;
		this.userNickName = userNickName;
		this.userPwd = userPwd;
		this.userState = true;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userAccount=" + userAccount + ", userNickName=" + userNickName
				+ ", userPwd=" + userPwd + ", userState=" + userState + "]";
	}

	@Override
	public int compareTo(User o) {
		return this.getUserId() - o.getUserId();
	}

}
