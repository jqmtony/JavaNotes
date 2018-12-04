package com.hvua.domain.D13_polym2;

public class Test {
	public static void main(String[] args) {
		Student stu1 = new Student("李1", "机械工程", "85分");
		Student stu2 = new Student("李2", "机械工程", "85分");
		School sch1 = new School("普陀分校");
		Print black = new printBlck();
		Print color = new printColor();
		
//		prn1.printStu(stu1);
		sch1.setPrint(black);
		sch1.operate(stu1);
		sch1.setPrint(color);
		sch1.operate(stu2);
	}

}
