package com.hwua.demo02;

public class Pet {
	
	private String name;
	
	public Pet(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void eat(Food food) {
		System.out.println(getName() + "³Ô" + food.getName());
	}

}
