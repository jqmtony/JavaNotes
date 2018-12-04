package com.hvua.domain.D13_polym;

public class Master {
	private String name; // 主人名字
	private Pet pet; // 养的宠物
	
	public Master(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	public void feed(Food food) {
		System.out.print(getName()+"在喂"+pet.getName());
		pet.eat(food);
	}
}
