package com.hwua.demo;

/**
 * 学生类
 * @author Administrator
 *
 */
public class Stu {
	//-- 非静态的内容是每个对象所私有的.一个对象的改变 不会对其它对象造成影响
	public int stuID;
	public String stuName;
	public int account;
	//-- 静态的内容是该类的所有对象共有的一个资源.一个对象的改变.其它对象受影响
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
