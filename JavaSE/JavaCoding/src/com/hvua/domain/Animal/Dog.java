package com.hvua.domain.Animal;

public class Dog extends Pet {
	
	public Dog(String type, int age, String color) {
		super(type,age,color);
	}

	public void animalVoice() {
		System.out.println("����һֻ��~ ������������");
	}

	@Override
	public String toString() {
		return "Dog [getType()=" + getType() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + "]";
	}


}
