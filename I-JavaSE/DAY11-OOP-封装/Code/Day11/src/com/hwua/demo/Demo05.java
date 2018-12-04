package com.hwua.demo;

public class Demo05 {
	public static void main(String[] args) {
		Student stu = new Student();				
	}
}
class Student{
	//--- 静态域
	static {
		System.out.println("这是静态域");
	}	
	public Student() {
		System.out.println("这是构造方法");
	}
}
