package com.hvua.domain.D13_polym3;

public class equipFan extends Equipment {

	public equipFan() {
		super("����");
		// TODO Auto-generated constructor stub
	}
	public void turnOn() {
		System.out.println("�ѽ�"+getName()+"��");
	}
	public void turnOff() {
		System.out.println("�ѽ�"+getName()+"�ر�");
	}
}
