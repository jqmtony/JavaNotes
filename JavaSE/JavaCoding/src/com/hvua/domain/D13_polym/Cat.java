package com.hvua.domain.D13_polym;

public class Cat extends Pet {

	public Cat() {
		super("С��");
	}

	public void eat(Food food) {
		super.eat(food);
		if(food.getClass()==Fish.class) {
			System.out.println(getName()+"*****�ڳ�*****"+food.getFoodName());
		}else {
			System.out.println(getName()+"*****����*****"+food.getFoodName());
		}
	}

}
