package com.hwua.demo03;

import java.util.Scanner;

public class Demo01 {
	//-- 这个时候的i会被赋予默认值 .0
	int i ;
	//The blank final field j may not have been initialized
	final int j = 10;
	final Scanner scan = new Scanner(System.in);
	public void mtehod() {
		// The final field Demo01.j cannot be assigned
		// j = 11;
		// The final field Demo01.scan cannot be assigned
		// scan = new Scanner(System.in);
	}
	

}
