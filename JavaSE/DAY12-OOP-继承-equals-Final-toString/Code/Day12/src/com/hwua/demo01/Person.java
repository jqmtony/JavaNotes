package com.hwua.demo01;


public class Person{

	private int age;
	private char gender;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int age, char gender, String name) {
		this.age = age;
		this.gender = gender;
		this.name = name;
	}
	public Person() {
		System.out.println("这是父类的无参构造.");
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", gender=" + gender + ", name=" + name + "]";
	}
}
