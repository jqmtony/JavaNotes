package com.hvua.domain.D13_polym2;

public class School {
	private String name;
	private Print print;
	private Student student;

	public School(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrint(Print print) {
		this.print = print;
	}

	public void operate(Student student) {
		System.out.println("\n [ " + getName() + " ] 中心选择正在打印学生信息……"); // 某某中心，打印，某某学生
		print.printStu(student);
	}
}
