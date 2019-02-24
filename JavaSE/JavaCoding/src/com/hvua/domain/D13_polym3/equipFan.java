package com.hvua.domain.D13_polym3;

public class equipFan extends Equipment {

	public equipFan() {
		super("电扇");
		// TODO Auto-generated constructor stub
	}
	public void turnOn() {
		System.out.println("已将"+getName()+"打开");
	}
	public void turnOff() {
		System.out.println("已将"+getName()+"关闭");
	}
}
