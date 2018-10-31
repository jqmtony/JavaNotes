package com.hvua.domain.D16_Exception.hw2_judgeName;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		Test test = new Test();
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("输入名字");
		String name = scan.next();
		System.out.println("输入年龄");
		int age = scan.nextInt();
		
		try {
			if(!student.setName(name)) {
				throw new NameException();
			}
		} catch (NameException e) {
			System.out.println(e.getMessage());
		}
	}

}
