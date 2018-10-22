package com.hwua.demo;

public class Demo03 {
	public String name;
	public int age;
	public int num;
	public Demo03() {
		//-- 问题:希望在调用无参时,age能有默认值
		//-- this的第二个用法:调用本类的其它构造方法
		//-- 具体哪一个由参数列表决定
		this(10);
	}	

	public Demo03(int age) {
		this.age = age;
	}	
	public Demo03(String name) {
		
	}
	public Demo03(int age , String name) {
		
	}
	
}
