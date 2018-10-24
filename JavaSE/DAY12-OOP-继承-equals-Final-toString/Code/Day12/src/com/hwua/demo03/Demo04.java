package com.hwua.demo03;

public class Demo04 {
	public static void main(String[] args) {
		
		Demo04 d = new Demo04();
		/*
		 * 这个d到底是怎么被输出的?
		 */
		System.out.println(d);
		System.out.println(d.toString());
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "diy";
	}

	
	public void method1() {
		this.method2();
	}
	public void method2() {
		this.method3();
		//-- 这里的this是可以省略的.
		method3();
	}
	public void method3() {
		
	}
}
