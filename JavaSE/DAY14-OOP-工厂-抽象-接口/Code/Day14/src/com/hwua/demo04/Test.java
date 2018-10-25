package com.hwua.demo04;

public class Test {

	public static void main(String[] args) {
		Tractor t1 = (Tractor) CarFactory.createCar("tractor");
		Tractor t2 = (Tractor) CarFactory.createCar("tractor", false);
		
		System.out.println(t1 == t2);
		t1.run();
		
	}
}
