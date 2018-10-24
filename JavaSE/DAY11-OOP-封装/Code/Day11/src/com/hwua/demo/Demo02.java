package com.hwua.demo;

/**
 * Static
 * @author Administrator
 *
 */
public class Demo02 {
	//-- 定义成员变量
	int i;
	static int j;	
	public void method1() {
		System.out.println(i);
		//-- 静态的往往是斜体.
		System.out.println(j);
	}
	public static void method2() {
		//Cannot make a static reference to the non-static field i
		//-- 不可以在static中引用一个非static成员变量i
		//System.out.println(i);
		//-- 如果非要访问只能通过对象.变量来进行访问.
		//-- 静态的往往是斜体.
		System.out.println(j);
	}
	public static void main(String[] args) {
		//Cannot make a static reference to the non-static method method1() from the type Demo02
		//-- 非要在静态中访问非静态的内容只能通过对象.来访问
		Demo02 d = new Demo02();
		d.method1();
		//-- 静态只可以访问静态.而非静态可以访问全部.
		method2();
	}
}
