package com.hvua.domian.test;

import com.hvua.domain.Teacher;

public class TecherTest {
	public static void main(String[] args) {
		
		// 创建一个对象，利用无参构造方法
		Teacher t1 = new Teacher();
		t1.name = "王老师";
		t1.gender= "男";
		t1.salary = 8000;
		t1.age = 30;
		
		// 创建一个对象，利用有参构造方法
		Teacher t2 = new Teacher("张老师", "女", 28, 5000);
		
		// 调用教师增加薪水的方法，并将增加薪水后的教师信息输出
		t1.addSalary(5000);
		t2.addSalary(5000);
		
		System.out.println(t1);
		System.out.println(t2);
		
	}
	
	
}
