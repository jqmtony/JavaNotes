package com.hvua.domain.D13_polym;

public class Dog extends Pet{
	
	public Dog() {
		super("Íú²Æ");
	}
	
	public void eat(Food food) {
		super.eat(food);
		if(food.getClass()==Bone.class) {
			System.out.println(getName()+"*****ÔÚ³Ô*****"+food.getFoodName());
		}else {
			System.out.println(getName()+"*****²»³Ô*****"+food.getFoodName());
		}
	}
}
