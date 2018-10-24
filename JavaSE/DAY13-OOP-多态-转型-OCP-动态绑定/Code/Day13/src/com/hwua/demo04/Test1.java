package com.hwua.demo04;

public class Test1 {

	public static void main(String[] args) {
		A a = new A();
		
		A a1 = new B();
		
		B b = new B();
		C c = new C();
		D d = new D();
		// A and a
		a.show(a);
		// A and a
		a.show(a1);
		// A and a A中没有参数为B的show方法.所有需要把参数的数据类型向父类进行转型.
		a.show(b);
		// a and a 同上.
		a.show(c);
		// a and d
		a.show(d);
		
		
		
		
		
		
		
		
		
		
		
	}
}
