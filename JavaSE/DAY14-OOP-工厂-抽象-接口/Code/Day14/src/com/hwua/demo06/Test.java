package com.hwua.demo06;

public class Test {

	public static void main(String[] args) {
		Fly f1 = new MagPie();
		Fly f2 = new Boeing();
		
		Bird b1 = new MagPie();
		b1.eat();
		
		f1.fly();
		f2.fly();
		
	}
}
