package com.hwua.demo04;

public class A {

	public void show(A a) {
		System.out.println("This is A and a");
	}
	
	public void show(D d) {
		System.out.println("This is A and d");
	}
}

class B extends A{
	public void show(A a) {
		System.out.println("This is B and a");
	}
	
	public void show(B b) {
		System.out.println("This is B and b");
	}
}
 
class C extends B{}

class D extends B{}