package com.hwua.domain;

public class Cat {
	public String name;
	public int age;
	public String color; 
	// test �� class �ǿ���ģ�������Ҫ��publicʹ�������Է���
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���䣺" + age + "\n��ɫ��" + color + "\n���䣺age"+age;
	}
}