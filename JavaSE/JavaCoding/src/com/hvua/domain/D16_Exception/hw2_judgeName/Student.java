package com.hvua.domain.D16_Exception.hw2_judgeName;

public class Student {
	private String name;
	private int age;

	/**
	 * get and set
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		if (name.length() > 2) {
			this.name = name;
			return true;
		}
		return false;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "学生信息：name=" + name + ", age=" + age;
	}

}
