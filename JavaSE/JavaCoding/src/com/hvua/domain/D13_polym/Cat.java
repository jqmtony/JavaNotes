package com.hvua.domain.D13_polym;

public class Cat extends Pet {

	public Cat() {
		super("小花");
	}

	public void eat(Food food) {
		super.eat(food);
		if(food.getClass()==Fish.class) {
			System.out.println(getName()+"*****在吃*****"+food.getFoodName());
		}else {
			System.out.println(getName()+"*****不吃*****"+food.getFoodName());
		}
	}

}
