package com.hwua.demo07;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Student[] array = new Student[10];
		
		Student s1 = new Student(1, "��һ", 70);
		Student s2 = new Student(2, "�¶�", 60);
		Student s3 = new Student(3, "����", 50);
		Student s4 = new Student(4, "����", 80);
		Student s5 = new Student(5, "����", 90);
		Student s6 = new Student(6, "����", 30);
		Student s7 = new Student(7, "����", 20);
		Student s8 = new Student(8, "�ܰ�", 100);
		Student s9 = new Student(9, "���", 40);
		Student s10 = new Student(10, "֣ʮ", 110);
		
		
		array[0] = s1;
		array[1] = s2;
		array[2] = s3;
		array[3] = s4;
		array[4] = s5;
		array[5] = s6;
		array[6] = s7;
		array[7] = s8;
		array[8] = s9;
		array[9] = s10;
		
		Arrays.sort(array);
		for (Student student : array) {
			//-- NullPointException. ��ָ��.���ñ���û��ָ�����ʱ����ָ��.
			System.out.println(student.toString());
		}
	}
}
