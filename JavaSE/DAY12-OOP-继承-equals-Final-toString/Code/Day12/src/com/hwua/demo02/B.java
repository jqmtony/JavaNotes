package com.hwua.demo02;

public class B extends A{
	/**
	 * @Override 是注解表明该方法是重写的方法.
	 */
	@Override
	public void method() {
		//-- 第一行默认存在.通过super.来代表父类对象.通过该对象.调用父类的中该方法.
		// super.method();
		System.out.println("这是B重写过的方法.");
	}

}
