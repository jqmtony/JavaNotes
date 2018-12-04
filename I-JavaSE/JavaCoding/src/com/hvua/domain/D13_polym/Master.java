package com.hvua.domain.D13_polym;

public class Master {
	private String name; // ��������
	private Pet pet; // ���ĳ���
	
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
		System.out.print(getName()+"��ι"+pet.getName());
		pet.eat(food);
	}
}
