package com.hwua.demo02;

public class ATest {

	public static void main(String[] args) {
		//-- JDK1.7֮��β���ǲ����ټӷ��͵�.
		// A<String> a = new A<>();		
		method1(new A<Number>());			//--  ����Number����
		method1(new A<Integer>());			//--  ����Number����
		//method1(new A<Object>());			//--  ����Number����	
		
		method2(new A<Number>());			//--  ����Number����
		//method2(new A<Integer>());			//--  ����Number����
		method2(new A<Object>());			//--  ����Number����		
	}	
	/**
	 * ? extends A  ����?������A��A����������,A�ĸ��಻����   ��������
	 * @param a
	 */
	public static void method1(A<? extends Number> a) {
		
	}
	
	/**
	 *  ? super A ����? ������A��A�ĸ���,A�����಻����          ��������
	 * @param a
	 */
	public static void method2(A<? super Number> a) {
		
	}
}
