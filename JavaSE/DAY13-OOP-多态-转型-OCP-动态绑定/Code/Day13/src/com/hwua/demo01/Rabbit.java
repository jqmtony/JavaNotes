package com.hwua.demo01;

public class Rabbit extends Animal{

	public Rabbit(String name) {
		//The constructor Animal() is undefined
		/*
		 *  .对于任何一个类,都会有默认的无参构造,且是隐藏的
		 *  .同时构造方法中的第一行代码一定是super()
		 *  .排除使用this()的情况.
		 *  .当父类没有无参构造时,子类的super()找不到父类的无参构造
		 *  .所以会报错.
		 */
		super(name);
	}
}
