package com.hvua.domain.D13_polym;

public class Dog extends Pet{
	
	public Dog() {
		super("����");
	}
	
	public void eat(Food food) {
		super.eat(food);
		if(food.getClass()==Bone.class) {
			System.out.println(getName()+"*****�ڳ�*****"+food.getFoodName());
		}else {
			System.out.println(getName()+"*****����*****"+food.getFoodName());
		}
	}
}
