package com.hwua.demo03;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	public Person(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public Person() {
		super();
	}
	@Override
	public int compareTo(Person o) {
		if (this.getAge() == o.getAge()) {
			//-- String 系统提供已经重写过了compareTo.默认自然序排列
			return this.getName().compareTo(o.getName());
		}else {
			return this.getAge() - o.getAge();
		}
		
	}
	
	
}
