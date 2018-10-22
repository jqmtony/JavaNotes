package com.hvua.domain;

import java.util.Arrays;

public class Student {
	public String name;
	public int age;
	public String gender;
	public String profession;
	
	// �Ա����Զ�Ϊ�У�רҵ���Զ�ΪAndroid
	public Student() {
		this.gender = "��";
		this.profession = "Android";
	}
	
	// ����ֵ�ɲ�������
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

	//  ������ҽ��ܵķ���
	public static void intro(Student[] array) {
		for(Student stu: array) {
			System.out.println(stu);
		}
	}
	
	
}

