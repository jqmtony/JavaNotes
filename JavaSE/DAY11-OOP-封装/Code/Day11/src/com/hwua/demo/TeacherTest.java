package com.hwua.demo;

public class TeacherTest {

	public static void main(String[] args) {
		
		//-- �����޲ι���
		Teacher t1 = new Teacher();
		t1.name = "����";
		t1.age = 18;
		t1.gender = "��";
		t1.salary = 8000;
		
		//-- �����вι���
		Teacher t2 = new Teacher("����","Ů",17,8888);
		
		t1.addSalary(5000);
		t2.addSalary(5000);
		
		System.out.println(t1);
		System.out.println(t2);
		
		
	}
}
