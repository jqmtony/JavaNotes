package com.hwua.demo;

/**
 * Static
 * @author Administrator
 *
 */
public class Demo02 {
	//-- �����Ա����
	int i;
	static int j;	
	public void method1() {
		System.out.println(i);
		//-- ��̬��������б��.
		System.out.println(j);
	}
	public static void method2() {
		//Cannot make a static reference to the non-static field i
		//-- ��������static������һ����static��Ա����i
		//System.out.println(i);
		//-- �����Ҫ����ֻ��ͨ������.���������з���.
		//-- ��̬��������б��.
		System.out.println(j);
	}
	public static void main(String[] args) {
		//Cannot make a static reference to the non-static method method1() from the type Demo02
		//-- ��Ҫ�ھ�̬�з��ʷǾ�̬������ֻ��ͨ������.������
		Demo02 d = new Demo02();
		d.method1();
		//-- ��ֻ̬���Է��ʾ�̬.���Ǿ�̬���Է���ȫ��.
		method2();
	}
}
