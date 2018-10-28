package com.hvua.domain.DAY15_implements.bean;

public class User {
	/**
	 * 属性
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
	 * 构造
	 */
	public User() {

	}

	public User(int userID, String userName, String userPsw) {
		super();
		// TODO 不需要输入ID值，后台自动添加
		this.userID = userID; 
		this.userName = userName;
		this.userPsw = userPsw;
	}
	/**
	 * 输出
	 */

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userPsw=" + userPsw + "]";
	}
	

}
