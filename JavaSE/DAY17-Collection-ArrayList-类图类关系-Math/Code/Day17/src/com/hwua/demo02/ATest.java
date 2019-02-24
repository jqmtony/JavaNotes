package com.hwua.demo02;

public class ATest {

	public static void main(String[] args) {
		//-- JDK1.7之后尾巴是不用再加泛型的.
		// A<String> a = new A<>();		
		method1(new A<Number>());			//--  代表Number本身
		method1(new A<Integer>());			//--  代表Number子类
		//method1(new A<Object>());			//--  代表Number父类	
		
		method2(new A<Number>());			//--  代表Number本身
		//method2(new A<Integer>());			//--  代表Number子类
		method2(new A<Object>());			//--  代表Number父类		
	}	
	/**
	 * ? extends A  代表?可以是A和A的所有子类,A的父类不可以   这是上限
	 * @param a
	 */
	public static void method1(A<? extends Number> a) {
		
	}
	
	/**
	 *  ? super A 代表? 可以是A和A的父类,A的子类不可以          这是下限
	 * @param a
	 */
	public static void method2(A<? super Number> a) {
		
	}
}
