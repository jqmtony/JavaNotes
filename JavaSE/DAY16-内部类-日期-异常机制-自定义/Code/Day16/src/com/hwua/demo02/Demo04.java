package com.hwua.demo02;

public class Demo04 {
	int i = 0 ;
	static int j = 0;
	public void method1() {
		System.out.println("method1");
	}
	public static void method2() {
		System.out.println("method2");
	}

	public void method3(int i) {
		int j = 10;
		/*
		 * 具备内部类
		 */
		class A{
			public void method() {
				System.out.println(i);
				System.out.println(j);
//				//Local variable i defined in an enclosing scope 
				//must be final or effectively final
				//i = 10;
				//j = 10;
				method1();
				method2();
			}
		}
	}
	
	
}
