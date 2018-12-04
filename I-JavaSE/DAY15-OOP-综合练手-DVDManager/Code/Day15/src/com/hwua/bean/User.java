package com.hwua.bean;

/**
 * 
 * @author Administrator
 *
 */
public class User implements Comparable<User>{
	
	private int userId;
	private String userName;
	private String userPwd;
	/*
	 * 王之豪专用!
	 * 0 代表普通用户
	 * 1 代表管理员
	 */
	private int userAuthority;
	/**
	 * VIP等级.
	 * 	后期要写不同等级进行不同的折扣
	 * 	策略模式
	 */
	private int userVipLevel;
	
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
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getUserVipLevel() {
		return userVipLevel;
	}
	public void setUserVipLevel(int userVipLevel) {
		this.userVipLevel = userVipLevel;
	}
	public User(int userId, String userName, String userPwd) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		//-- 设置客户的默认VIP等级
		this.userVipLevel = 1;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userVipLevel="
				+ userVipLevel + "]";
	}
	
	/**
	 * 按照客户的等级进行排序.
	 * 	默认降序
	 */
	@Override
	public int compareTo(User o) {
		return -(this.getUserVipLevel() - o.getUserVipLevel());
	}

}
