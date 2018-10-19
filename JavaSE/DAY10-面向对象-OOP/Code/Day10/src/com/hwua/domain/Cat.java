package com.hwua.domain;
/*
 * 1.	小红养了两只猫，一只叫小黑，今年2岁，
 * 黑色，另一只叫小白，今年5岁，白色。请编写
 * 一个程序，要求当用户输入小猫的名字时，
 * 就显示猫的名字、年龄和颜色。如果用户输入
 * 的小猫名字错误，则显示“小红没有养这只猫”。
 */
public class Cat {
	//-- 成员变量 Field
	public int age;
	public String color;
	public String name;
	
	/**
	 * 
	 * @param food 参数  Argument
	 */
	public void eat(Food food) {
		//-- 局部变量 Local Variable
		int i = 0;
	}
	
	@Override
	public String toString() {
		return "年龄:\t" + age + "\n颜色:\t" + color + "\n姓名:\t" + name;
	}
	
}
