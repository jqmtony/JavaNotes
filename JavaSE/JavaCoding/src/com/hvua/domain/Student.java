package com.hvua.domain;

import java.util.Arrays;

public class Student {
	public String name;
	public int age;
	public String gender;
	public String profession;
	
	// 性别属性定为男，专业属性定为Android
	public Student() {
		this.gender = "男";
		this.profession = "Android";
	}
	
	// 属性值由参数给定
	public Student(String name, int age, String gender, String profession) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", profession=" + profession + "]";
	}

	//  输出自我介绍的方法
	public static void intro(Student[] array) {
		for(Student stu: array) {
			System.out.println(stu);
		}
	}
	
	
}

