package com.hvua.domain.D16_Exception.hw2_judgeName;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws NameException {
		Scanner scan = new Scanner(System.in);

		System.out.println("��������");
		String name = scan.next();
		System.out.println("��������");
		int age = scan.nextInt();

		Student student = new Student();

		if (student.setName(name)) {
			student.setAge(age);
			System.out.println(student);
		} else {
			throw new NameException();
		}

	}
}
