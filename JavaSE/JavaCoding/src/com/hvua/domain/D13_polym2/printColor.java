package com.hvua.domain.D13_polym2;

public class printColor extends Print {

	public printColor() {
		super("彩色");
	}

	@Override
	public void printStu(Student student) {
		System.out.println("彩色打印****学生信息****");
		System.out.println(student);
	}

}
