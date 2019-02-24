package com.hwua.demo;

public class StuTest {

	public static void main(String[] args) {
		Stu stu1 = new Stu(1,"张三",111);
		Stu stu2 = new Stu(2,"李四",111);
		Stu stu3 = new Stu(3,"王五",111);
		stu1.account = 222;
		System.out.println(stu2.account);
		stu2.account2 = 333;
		System.out.println(stu1.account2);
		stu3.account2 = 555;
		System.out.println(stu2.account2);
		
	}
}
