package com.hvua.domain.Animal;

public class Rabbit extends Pet{
	public Rabbit(String type, int age, String color) {
		super(type,age,color);
	}

	public void animalVoice() {
		System.out.println("����һֻС����~ Ү��Ү��Ү��");
	}

	@Override
	public String toString() {
		return "Rabbit [getType()=" + getType() + ", getAge()=" + getAge() + ", getColor()=" + getColor() + "]";
	}

	
}
