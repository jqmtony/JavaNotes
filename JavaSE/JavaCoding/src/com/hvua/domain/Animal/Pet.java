package com.hvua.domain.Animal;

public class Pet extends Animal{
	
	public Pet() {
		
	}
	
	public Pet(String type, int age, String color) {
		super(type,age,color);
	}
	
	public void animalVoice() {
		System.out.println("我的宠物会发出什么声音呢？");
	}

	@Override
	public String toString() {
		return "Pet [getType()=" + getType() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + "]";
	}
	
	
}
