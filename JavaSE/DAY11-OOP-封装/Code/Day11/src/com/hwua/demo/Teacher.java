package com.hwua.demo;

public class Teacher {

	public String name;
	public String gender;
	public int age;
	public double salary;
	
	public Teacher() {
	}

	public Teacher(String name,String gender,int age,double salary) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	/**
	 * ÕÇÐ½
	 * @param increment
	 */
	public void addSalary(double increment) {
		salary = salary + increment;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
