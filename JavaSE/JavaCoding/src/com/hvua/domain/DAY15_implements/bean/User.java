package com.hvua.domain.DAY15_implements.bean;

public class User {
	/**
	 * ����
	 */
	private int userID;
	private String userName;
	private String userPsw;

	/**
	 * get & set
	 */
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPsw() {
		return userPsw;
	}

	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}

	/**
	 * ����
	 */
	public User() {

	}

	public User(int userID, String userName, String userPsw) {
		super();
		// TODO ����Ҫ����IDֵ����̨�Զ����
		this.userID = userID; 
		this.userName = userName;
		this.userPsw = userPsw;
	}
	/**
	 * ���
	 */

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userPsw=" + userPsw + "]";
	}
	

}
