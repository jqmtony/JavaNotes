package com.hwua.demo04;

public class Test2 {

	public static void main(String[] args) {
		A a = new A();
		
		A a1 = new B();
		
		B b = new B();
		C c = new C();
		D d = new D();
		// b and a  a1的数据类型(运行时类型是A,但是对象本身是b的对象)
		// 当我们通过a1.方法()的时候执行的是 对象B中的方法.
		a1.show(a);
		// b and a
		a1.show(a1);
		// 虽然a1实际是B的对象.但是a1的数据类型是A.所以我们使用的是
		//-- B中有的且在A中声明过的.即B中所特有的方法是不可以使用的.
		// b and a
		a1.show(b);
		// b and a
		a1.show(c);
		// a and d
		a1.show(d);
		
		
		
		
		
		
		
		
		
		
		
	}
}
