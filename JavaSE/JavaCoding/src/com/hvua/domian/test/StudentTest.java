package com.hvua.domian.test;

import com.hvua.domain.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		// ʹ�ù��췽��1��ʼ������
		Student s1 = new Student();
		s1.name = "�Ŵ��";
		s1.age = 20;
		
		// ʹ�ù��췽��2��ʼ������
		Student s2=new Student("������", 30,"Ů","iOS");
		
		// �ֱ���ý��ܷ���
		Student[] array = new Student[2];
		array[0] = s1;
		array[1] = s2;

		Student.intro(array);
	}
}
