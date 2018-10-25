package com.hwua.demo07;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Student[] array = new Student[10];
		
		Student s1 = new Student(1, "刘一", 70);
		Student s2 = new Student(2, "陈二", 60);
		Student s3 = new Student(3, "张三", 50);
		Student s4 = new Student(4, "李四", 80);
		Student s5 = new Student(5, "王五", 90);
		Student s6 = new Student(6, "赵六", 30);
		Student s7 = new Student(7, "孙七", 20);
		Student s8 = new Student(8, "周八", 100);
		Student s9 = new Student(9, "吴九", 40);
		Student s10 = new Student(10, "郑十", 110);
		
		
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
			//-- NullPointException. 空指针.引用变量没有指向对象时报空指针.
			System.out.println(student.toString());
		}
	}
}
