package com.hwua.demo04;

public class Test2 {

	public static void main(String[] args) {
		A a = new A();
		
		A a1 = new B();
		
		B b = new B();
		C c = new C();
		D d = new D();
		// b and a  a1����������(����ʱ������A,���Ƕ�������b�Ķ���)
		// ������ͨ��a1.����()��ʱ��ִ�е��� ����B�еķ���.
		a1.show(a);
		// b and a
		a1.show(a1);
		// ��Ȼa1ʵ����B�Ķ���.����a1������������A.��������ʹ�õ���
		//-- B���е�����A����������.��B�������еķ����ǲ�����ʹ�õ�.
		// b and a
		a1.show(b);
		// b and a
		a1.show(c);
		// a and d
		a1.show(d);
		
		
		
		
		
		
		
		
		
		
		
	}
}
