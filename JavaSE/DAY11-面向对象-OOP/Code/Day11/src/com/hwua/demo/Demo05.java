package com.hwua.demo;

public class Demo05 {
	public static void main(String[] args) {
		Student stu = new Student();				
	}
}
class Student{
	//--- ��̬��
	static {
		System.out.println("���Ǿ�̬��");
	}	
	public Student() {
		System.out.println("���ǹ��췽��");
	}
}
