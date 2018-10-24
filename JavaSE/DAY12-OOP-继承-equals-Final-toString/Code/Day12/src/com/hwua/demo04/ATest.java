package com.hwua.demo04;

public class ATest {

	public static void main(String[] args) {
		//The constructor A() is not visible
		A a1 = A.getInstance();
		A a2 = a1;
		A a3 = a2;
		
		A a4 = A.getInstance();
		System.out.println(a1 == a2);
		System.out.println(a1 == a3);
		System.out.println(a2 == a3);
		
		System.out.println(a1 == a4);
		
		B b1 = B.getInstance();
		B b2 = B.getInstance();
		B b3 = B.getInstance();
		//Ctrl + D É¾³ýÒ»ÐÐ
		System.out.println(b1 == b2);
		System.out.println(b1 == b3);
		System.out.println(b3 == b2);
	}
}
