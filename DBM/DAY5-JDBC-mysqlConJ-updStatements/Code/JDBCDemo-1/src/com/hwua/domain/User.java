package com.hwua.domain;

public class User {

	private int userId;
	private String userName;
	private boolean userSex;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean getUserSex() {
		return userSex;
	}
	public void setUserSex(boolean userSex) {
		this.userSex = userSex;
	}
	public User(int userId, String userName, boolean userSex) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSex = userSex;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userSex=" + userSex + "]";
	}
	
}
