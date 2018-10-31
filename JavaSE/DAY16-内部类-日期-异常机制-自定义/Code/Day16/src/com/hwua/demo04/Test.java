package com.hwua.demo04;

public class Test {

	public static void main(String[] args) {
		method();
	}

	public static void method() {
		try {
			method1();
		} catch (MyExceptionOne e) {
			System.out.println(e.getMessage());
		}

		method2();
	}

	public static void method1() throws MyExceptionOne {
		System.out.println("metho1");
	}

	public static void method2() throws MyExceptionTwo {
		System.out.println("method2");
	}

}
