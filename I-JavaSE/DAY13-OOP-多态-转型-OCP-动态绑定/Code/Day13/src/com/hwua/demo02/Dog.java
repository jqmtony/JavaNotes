package com.hwua.demo02;

public class Dog extends Pet{

	public Dog() {
		super("����");
	}
	
	@Override
	public void eat(Food food) {
		super.eat(food);
		if (food.getClass() == Bone.class) {
			System.out.println(getName() + "***�ڳ�***" + food.getName());
		}else {
			System.out.println(getName() + "***����***" + food.getName());
		}
	}

}
