package com.hwua.demo05;

public abstract class A {
	//-- �ֶ�
	private int i;

	//-- get��set
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	//-- ���췽��
	public A() {
	}
	
	public A(int i) {
		this.i = i;
	}	
	//-- toString equals ��.	
	public static void main(String[] args) {
		System.out.println("���!");
		//Cannot instantiate the type A
		//-- �������ǲ����Ա�ʵ������.��Ϊһ���г��󷽷�.�÷���û�з�����.�޷�������.
		//A a = new A();
	}		
}









