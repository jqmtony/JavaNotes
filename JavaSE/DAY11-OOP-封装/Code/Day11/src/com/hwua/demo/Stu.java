package com.hwua.demo;

/**
 * ѧ����
 * @author Administrator
 *
 */
public class Stu {
	//-- �Ǿ�̬��������ÿ��������˽�е�.һ������ĸı� ����������������Ӱ��
	public int stuID;
	public String stuName;
	public int account;
	//-- ��̬�������Ǹ�������ж����е�һ����Դ.һ������ĸı�.����������Ӱ��
	public static int account2;
	
	public Stu(int stuID, String stuName, int account) {
		this.stuID = stuID;
		this.stuName = stuName;
		this.account = account;
	}
	@Override
	public String toString() {
		return "Stu [stuID=" + stuID + ", stuName=" + stuName + ", account=" + account + "]";
	}
	
	

}
