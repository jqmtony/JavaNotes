package com.hvua.domain.D16_Exception.hw2_judgeName;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws NameException {
		Scanner scan = new Scanner(System.in);

		Student student = new Student();
		while (true) {
			System.out.println("输入名字");
			String name = scan.next();
			System.out.println("输入年龄");
			int age = scan.nextInt();
			try {
				if (student.setName(name)) {
					student.setAge(age);
					System.out.println(student);
					break;
				} else {
					throw new NameException();
				}
			} catch (Exception e) {
				System.out.println("名字要大于2个字符：");
			}
		}
	}
}
