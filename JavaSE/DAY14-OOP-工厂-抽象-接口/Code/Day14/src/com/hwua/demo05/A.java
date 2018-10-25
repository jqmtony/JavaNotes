package com.hwua.demo05;

public abstract class A {
	//-- 字段
	private int i;

	//-- get和set
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	//-- 构造方法
	public A() {
	}
	
	public A(int i) {
		this.i = i;
	}	
	//-- toString equals 等.	
	public static void main(String[] args) {
		System.out.println("你猜!");
		//Cannot instantiate the type A
		//-- 抽象类是不可以被实例化的.因为一旦有抽象方法.该方法没有方法体.无法被调用.
		//A a = new A();
	}		
}









