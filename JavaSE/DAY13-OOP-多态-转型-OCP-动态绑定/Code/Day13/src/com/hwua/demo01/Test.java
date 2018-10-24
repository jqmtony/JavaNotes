package com.hwua.demo01;

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal("动物世界");
		//-- 我要一只猫
		Cat cat = new Cat("Tom");
		Dog dog = new Dog("史派克");
		Rabbit rabbit = new Rabbit("越狱兔");
		
		System.out.println("---------用多态会怎么写的");
		
		//-- 我要一只宠物
		Animal cat1 = new Cat("Tom");
		Animal dog1 = new Dog("八公");
		Animal rabbit1 = new Rabbit("公孙离");
	}
}
