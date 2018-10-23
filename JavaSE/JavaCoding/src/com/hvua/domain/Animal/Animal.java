package com.hvua.domain.Animal;

public class Animal {
	// ����
	private String type;
	private int age;
	private String color;

	// ����
	public Animal() {

	}

	public Animal(String type, int age, String color) {
		super();
		this.type = type;
		this.age = age;
		this.color = color;
	}

	// ��д
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// ���������������
	public void animalVoice() {
		System.out.println("��ͬ�Ķ����������ô������ n(*�R���Q*)n");
	}
	
	// toString
	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", color=" + color + "]";
	}
	
	
}
