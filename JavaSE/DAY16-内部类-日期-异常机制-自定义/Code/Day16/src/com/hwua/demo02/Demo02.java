package com.hwua.demo02;

public class Demo02 {


	public static void main(String[] args) {
		//-- 想要在静态中访问非静态内容.必须通过对象.来进行访问.
		A a = new Demo02().new A();
	}
	
	public void method() {
		A a = new A();
	}
	class A{		
	}
}
