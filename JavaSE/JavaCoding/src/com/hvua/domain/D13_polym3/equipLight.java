package com.hvua.domain.D13_polym3;

public class equipLight extends Equipment {

	public equipLight() {
		super("电灯");
		// TODO Auto-generated constructor stub
	}

	public void turnOn() {
		System.out.println("已将" + getName() + "打开");
	}

	public void turnOff() {
		System.out.println("已将" + getName() + "关闭");
	}
}
