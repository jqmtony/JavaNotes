package com.hwua.demo;

public class Demo03 {
	public String name;
	public int age;
	public int num;
	public Demo03() {
		//-- ����:ϣ���ڵ����޲�ʱ,age����Ĭ��ֵ
		//-- this�ĵڶ����÷�:���ñ�����������췽��
		//-- ������һ���ɲ����б����
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
