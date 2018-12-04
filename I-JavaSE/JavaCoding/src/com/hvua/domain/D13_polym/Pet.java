package com.hvua.domain.D13_polym;

public class Pet {
	private String name;

	public Pet() {
	}
	
	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void eat(Food food) {
		System.out.println("³Ô"+food.getFoodName());
	}
	
}
