package com.hwua.demo02;

public class Demo01 {
	
	int i = 0;
	/**
	 * j Ҳ�ǳ�Ա����.��static���ν�����̬��Ա����
	 * ��ƾ�̬����
	 */
	static int j = 0;
	
	public void method1() {
		System.out.println("method1");
	}
	
	public static void method2() {
		System.out.println("method2");
	}
	/**
	 * ��A���ǳ�Ա�ڲ���.
	 * @author Administrator
	 *
	 */
	static class A{
		/* The method main cannot be declared static; 
		 * static methods can only be declared in a static or 
		 * top level type
		 * 
		 */
		public static void main(String[] args) {}
		public void method1() {
//			System.out.println(i);
			System.out.println(j);
			Demo01 d = new Demo01();
			d.method1();
			Demo01.method2();
		}
	}

}
