package com.hvua.domain.D13_polym3;

public class Test {
	public static void main(String[] args) {
		
		Host host1 = new Host("¿Ó¥Û¥Û");
		Equipment tv = new equipTV();
		Equipment fan = new equipFan();
		Equipment light = new equipLight();
		
		host1.control(fan);
		fan.turnOn();
		host1.control(tv);
		tv.turnOn();
		host1.control(light);
		light.turnOff();
		
	}

}
