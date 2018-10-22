package com.hvua.domain;

import javax.sql.rowset.serial.SerialArray;

public class Teacher {
		// 创建对象
		public String name;
		public String gender;
		public int age;
		public double salary;
		
		// 定义无参构造方法
		public Teacher() {
			
		}
		// 定义有参构造方法
		public Teacher(String name, String gender, int age, double salary) {
			this.name = name;
			this.gender = gender;
			this.age = age;
			this.salary = salary;
		}
		
		// 定义一个有参方法（就是一个方法！不是无参），用于在教师原有薪水上增加5000
		public void addSalary(double increment) { // increment就是增加的金额，参数自定
			this.salary = salary + increment;
		}
		
		// 如果不加上String toString，test里面输出对象的时候，返回哈希值，不会遍历属性
		@Override
		public String toString() {
			return "Teacher [name=" + name + ", gender=" + gender + ", "
					+ "age=" + age + ", salary=" + salary + "]";
		}
		
		
		
}
