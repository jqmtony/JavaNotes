package com.hwua.demo02;

public class Cat extends Pet{

	public Cat() {
		super("小花");
	}
	
	@Override
	public void eat(Food food) {
		super.eat(food);
		if (food.getClass() == Fish.class) {
			System.out.println(getName() + "***在吃***" + food.getName());
		}else {
			System.out.println(getName() + "***不吃***" + food.getName());
		}
	}

}
