package com.hwua.demo01;

public class Animal {

	private String name;
	private int age;
	
	public void showStyle() {
		System.out.println("这是动物");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Animal() {
		super();
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
}
