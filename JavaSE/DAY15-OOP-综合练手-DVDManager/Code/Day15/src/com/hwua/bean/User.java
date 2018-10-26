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
	 * ��֮��ר��!
	 * 0 ������ͨ�û�
	 * 1 �������Ա
	 */
	private int userAuthority;
	/**
	 * VIP�ȼ�.
	 * 	����Ҫд��ͬ�ȼ����в�ͬ���ۿ�
	 * 	����ģʽ
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
		//-- ���ÿͻ���Ĭ��VIP�ȼ�
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
	 * ���տͻ��ĵȼ���������.
	 * 	Ĭ�Ͻ���
	 */
	@Override
	public int compareTo(User o) {
		return -(this.getUserVipLevel() - o.getUserVipLevel());
	}

}
