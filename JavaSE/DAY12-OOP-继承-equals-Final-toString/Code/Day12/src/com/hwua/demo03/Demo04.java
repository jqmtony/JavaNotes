package com.hwua.demo03;

public class Demo04 {
	public static void main(String[] args) {
		
		Demo04 d = new Demo04();
		/*
		 * ���d��������ô�������?
		 */
		System.out.println(d);
		System.out.println(d.toString());
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "diy";
	}

	
	public void method1() {
		this.method2();
	}
	public void method2() {
		this.method3();
		//-- �����this�ǿ���ʡ�Ե�.
		method3();
	}
	public void method3() {
		
	}
}
