package com.hwua.demo04;

public class A {
	//-- 因为instance被static修饰.所以它是唯一的.
	private static A instance;
	private A(){	
	}
	
	/* 为什么使用静态.
	 * 	因为对象的调用方式有两种:
	 * 	1.对象.方法
	 *  2.类名.方法
	 *   .我们为了获取对象.需要调用该方法..如果想要能够调用该方法
	 *   .又需要有一个对象.所以变成相互依赖的死循环.为了解决这个问题
	 *   .采用第二种调用方法的方式.通过类名.方法来调用.需要我们把方法
	 *   .设计成静态方法.
	 */
	public static A getInstance() {
		//-- 判断instance是否已经被实例化了.如果已经被实例化则直接返回
		//-- 如果没有这实例化
		if (instance == null) {
			instance =  new A();
		}
		return instance;
	}
}
