package com.hwua.demo01;

public class Test {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Cat c = null;
		Dog d = null;
		if (dog instanceof Cat) {
			c = (Cat) dog;
			System.out.println(1);
		}
		if (dog instanceof Dog) {
			d = (Dog) dog;
			System.out.println(2);
		}
		System.out.println(dog instanceof Cat);
		System.out.println(dog instanceof Dog);
		System.out.println(dog instanceof Animal);
	}
}
