package com.hvua.domain.D13_polym3;

public class Equipment {
	private String name;

	public Equipment(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void turnOn() {
		System.out.println("�ѽ�"+getName()+"��");
	}
	public void turnOff() {
		System.out.println("�ѽ�"+getName()+"�ر�");
	}

}
