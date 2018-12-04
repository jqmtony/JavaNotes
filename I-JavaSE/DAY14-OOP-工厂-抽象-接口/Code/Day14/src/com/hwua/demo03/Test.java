package com.hwua.demo03;

public class Test {

	public static void main(String[] args) {
		Solider so1 = new Cavalry();
		Solider so2 = new Infantryman();
		
		Officer officer = new Officer();
		
		officer.order(so1);
		Solider[] array = {so1,so2};
		officer.order(array);
				
	}
}
