package com.hwua.demo;

public class TeacherTest {

	public static void main(String[] args) {
		
		//-- 利用无参构建
		Teacher t1 = new Teacher();
		t1.name = "张三";
		t1.age = 18;
		t1.gender = "男";
		t1.salary = 8000;
		
		//-- 利用有参构建
		Teacher t2 = new Teacher("李四","女",17,8888);
		
		t1.addSalary(5000);
		t2.addSalary(5000);
		
		System.out.println(t1);
		System.out.println(t2);
		
		
	}
}
