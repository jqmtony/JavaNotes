package com.hwua.domain;

/**
 *   里面含有人的所有特征
 * @author Administrator
 *
 */
public class Person {
	/**
	 * 代表身高
	 */
	public int heght;
	/**
	 * 代表体重
	 */
	public double weight;
	/**
	 * 代表年龄
	 */
	public int age;
	/**
	 * 代表姓名.
	 */
	public String name;	
	/**
	 * 代表性别
	 */
	public String gender;	
	
	public void eat() {
		System.out.println("代表吃的行为");
	}
	
	public void sleep() {
		System.out.println("代表睡的行为");
	}
}
