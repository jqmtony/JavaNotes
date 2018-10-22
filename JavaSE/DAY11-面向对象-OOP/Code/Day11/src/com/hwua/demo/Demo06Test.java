package com.hwua.demo;

public class Demo06Test {

	public static void main(String[] args) {
		Demo06 d = new Demo06();
		System.out.println(d.i);
		//The field Demo06.j is not visible
		int j = d.getJ();
		System.out.println(j);
		j = j + 10;
		d.setJ(j);
		j = d.getJ();
		System.out.println(j);
		System.out.println(d.k);
		System.out.println(d.l);
	}
}
