package com.hwua.demo02;

public class Master {

	private String name;
	private Pet pet;

	public String getName() {
		return name;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Master(String name) {
		this.name = name;
	}
	
	public void feed(Food food) {
		System.out.print(getName() + "ÔÚÎ¹");
		pet.eat(food);
	}
	
	
	
}
