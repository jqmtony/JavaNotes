package com.hvua.domain.D13_polym2;

public class Test {
	public static void main(String[] args) {
		Student stu1 = new Student("��1", "��е����", "85��");
		Student stu2 = new Student("��2", "��е����", "85��");
		School sch1 = new School("���ӷ�У");
		Print black = new printBlck();
		Print color = new printColor();
		
//		prn1.printStu(stu1);
		sch1.setPrint(black);
		sch1.operate(stu1);
		sch1.setPrint(color);
		sch1.operate(stu2);
	}

}
