package com.hvua.domain.Animal;

public class Cat extends Pet{
	
	public Cat(String type, int age, String color) {
		super(type,age,color);
	}

	public void animalVoice() {
		System.out.println("我是一只猫~ 喵！喵！喵！");
	}

	@Override
	public String toString() {
		return "Cat [getType()=" + getType() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + "]";
	}
	
}
