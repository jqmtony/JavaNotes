package com.hwua.demo02;

public class Test {

	public static void main(String[] args) {
		
		Master master = new Master("Œ¿π¨ ø¿…");
		
		Pet pet = new Dog();
		Food food = new Fish();
		
		Pet pet1 = new Cat();
		Food food1 = new Bone();
		
		master.setPet(pet1);
		
		master.feed(food);
		
	}
}
