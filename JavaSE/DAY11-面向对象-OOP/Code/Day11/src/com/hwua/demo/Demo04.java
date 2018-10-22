package com.hwua.demo;


class Demo04 {
	public static void main(String[] args) {
		//-- 目的是访问OtherClass中的内容
		// i cannot be resolved to a variable
		// System.out.println(i);
		System.out.println(OtherClass.i);
		//Cannot make a static reference to the non-static field OtherClass.j
		//System.out.println(OtherClass.j);
		OtherClass oc = new OtherClass();
		System.out.println(oc.j);
	}
	
}

class OtherClass {
	static int i;
	int j;

	public static void method1() {

	}

	public void method2() {

	}
}