package com.hvua.domain.D13_polym;

public class Test {
	public static void main(String[] args) {

		Master master = new Master("ะกร๗");
		
		Pet dog = new Dog();
		Pet cat = new Cat();
		Food bone = new Bone();
		Food fish = new Fish();
		
		master.setPet(dog);
		master.feed(bone);
		master.feed(fish);
		System.out.println("---------------------");
		master.setPet(cat);
		master.feed(bone);
		master.feed(fish);
	}
}
