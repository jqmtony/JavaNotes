package com.hwua.demo02;

public class Test {

	public static void main(String[] args) {
		//-- 接口是不可以创建对象的
		//Cannot instantiate the type Anonymous
		/*
		 * 大括号代表一个类的类体.这个类没有名字.所有被叫做匿名类.
		 * 又因为是写在内部所有就是匿名内部类
		 * 这个类和接口的关系:这个没有名字的类实现了Anonymous接口.
		 */
		Anonymous a = new Anonymous() {
			@Override
			public void method() {
				System.out.println("啦啦啦!");
			}
		};
		//- a 指向的到底是谁? 指向了Anonymous的实现类的对象.
		a.method();	
	}
}
