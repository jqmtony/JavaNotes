package com.hwua.demo04;

public class Tractor extends Car {
	private static Tractor instance;
	
	private Tractor() {
	}

	public static Tractor getInstance() {
		if (instance == null) {
			instance = new Tractor();
		}
		return instance;
	} 
	
	public static Tractor getInstance(boolean singleton) {
		
		return  singleton? getInstance() : new Tractor();
	}
	
	@Override
	public void run() {
		System.out.println("拖拉机跑的行为!");
	}

}
