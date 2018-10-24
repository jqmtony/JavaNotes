package com.hwua.demo02;

public class Dog extends Pet{

	public Dog() {
		super("Íú²Æ");
	}
	
	@Override
	public void eat(Food food) {
		super.eat(food);
		if (food.getClass() == Bone.class) {
			System.out.println(getName() + "***ÔÚ³Ô***" + food.getName());
		}else {
			System.out.println(getName() + "***²»³Ô***" + food.getName());
		}
	}

}
