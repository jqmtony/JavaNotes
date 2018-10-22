package com.hvua.domian.test;

import com.hvua.domain.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		// 使用构造方法1初始化对象
		Student s1 = new Student();
		s1.name = "张大大";
		s1.age = 20;
		
		// 使用构造方法2初始化对象
		Student s2=new Student("张晓晓", 30,"女","iOS");
		
		// 分别调用介绍方法
		Student[] array = new Student[2];
		array[0] = s1;
		array[1] = s2;

		Student.intro(array);
	}
}
