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
		// A and a A��û�в���ΪB��show����.������Ҫ�Ѳ��������������������ת��.
		a.show(b);
		// a and a ͬ��.
		a.show(c);
		// a and d
		a.show(d);
		
		
		
		
		
		
		
		
		
		
		
	}
}
