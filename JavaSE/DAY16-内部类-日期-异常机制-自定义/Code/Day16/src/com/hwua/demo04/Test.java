package com.hwua.demo04;

public class Test {

	
	public void method() {
		try {
			method1();
		} catch (MyExceptionOne e) {
			System.out.println(e.getMessage());
		}
		
		method2();
	}
	
	
	public void method1() throws MyExceptionOne{
		
	}
	
	
	public void method2() throws MyExceptionTwo{
		
	}
	
}
