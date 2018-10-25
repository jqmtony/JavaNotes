package com.hvua.domain.D13_polym2;

public class printBlck extends Print {

	public printBlck() {
		super("黑白");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printStu(Student student) {
		System.out.println("彩色打印****学生信息****");
		System.out.println(student);
	}

}
