package com.hwua.demo02;

public class Cat extends Pet{

	public Cat() {
		super("С��");
	}
	
	@Override
	public void eat(Food food) {
		super.eat(food);
		if (food.getClass() == Fish.class) {
			System.out.println(getName() + "***�ڳ�***" + food.getName());
		}else {
			System.out.println(getName() + "***����***" + food.getName());
		}
	}

}
