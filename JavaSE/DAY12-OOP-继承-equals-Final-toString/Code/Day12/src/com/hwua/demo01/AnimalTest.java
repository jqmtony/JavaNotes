package com.hwua.demo01;

public class AnimalTest {

	public static void main(String[] args) {
		Dog dog1 = new Dog();//0x1
		Dog dog2 = new Dog();//0x2
		
		//-- 比较的是dog1和dog2中所保存的堆中的地址.
		//-- 因为是两块空间所以直接使用等等是肯定不相等的.
		System.out.println(dog1 == dog2);
		int i = 0;
		int j = 0;
		//-- 等等比较是比较值.
		System.out.println(i == j);
		//-- 有一个明确的目标要求: 判断两个对象是不是同一个对象.
		//-- 对象的比较相等实际上是根据对象的特征来进行判断.
		//-- 我们可以做的就是利用equals来比较特征.
		
		dog1.setAge(3);
		dog1.setName("旺财");
		dog1.setColor("黑色");
		
		dog2.setAge(4);
		dog2.setName("旺财");
		dog2.setColor("黑色");
		
		System.out.println(dog1.getAge());
		System.out.println(dog1.getColor());
		System.out.println(dog1.getName());
		System.out.println(dog2.getAge());
		System.out.println(dog2.getColor());
		System.out.println(dog2.getName());
		
		
		System.out.println(dog1 == dog2);
		System.out.println(dog1.equals(dog2));
		
		
		
		
		
		
		
		
	}
}
