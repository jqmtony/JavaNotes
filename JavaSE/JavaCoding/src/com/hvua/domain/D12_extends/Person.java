package com.hvua.domain.D12_extends;

public class Person {
	private String name;
	private int Age;
	private String gender;
	
	public void equals() {
		System.out.println("���ǣ�");
	}
	
	// �޲ι���
	public Person() {
		
	}
	// �вι���
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		Age = age;
		this.gender = gender;
	}
	
	// get��������setд����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", Age=" + Age + ", gender=" + gender + "]";
	}
	
	
}
