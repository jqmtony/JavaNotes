package com.hvua.domain;

import javax.sql.rowset.serial.SerialArray;

public class Teacher {
		// ��������
		public String name;
		public String gender;
		public int age;
		public double salary;
		
		// �����޲ι��췽��
		public Teacher() {
			
		}
		// �����вι��췽��
		public Teacher(String name, String gender, int age, double salary) {
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.salary = salary;
		}
		
		// ����һ���вη���������һ�������������޲Σ��������ڽ�ʦԭ��нˮ������5000
		public void addSalary(double increment) { // increment�������ӵĽ������Զ�
			this.salary = salary + increment;
		}
		
		// ���������String toString��test������������ʱ�򣬷��ع�ϣֵ�������������
		@Override
		public String toString() {
			return "Teacher [name=" + name + ", gender=" + gender + ", "
					+ "age=" + age + ", salary=" + salary + "]";
		}
		
		
		
}
