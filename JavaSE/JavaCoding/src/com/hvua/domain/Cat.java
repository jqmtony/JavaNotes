package com.hwua.domain;

public class Cat {
	public String name;
	public int age;
	public String color; 
	// test 和 class 是跨包的，所以需要加public使得他可以访问
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "年龄：" + age + "\n颜色：" + color + "\n年龄：age"+age;
	}
}