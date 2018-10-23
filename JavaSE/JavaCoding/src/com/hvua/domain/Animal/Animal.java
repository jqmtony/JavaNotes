package com.hvua.domain.Animal;

public class Animal {
	// 属性
	private String type;
	private int age;
	private String color;

	// 构造
	public Animal() {

	}

	public Animal(String type, int age, String color) {
		super();
		this.type = type;
		this.age = age;
		this.color = color;
	}

	// 读写
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
	
	// 方法（动物叫声）
	public void animalVoice() {
		System.out.println("不同的动物叫声是怎么样的呢 n(*≧▽≦*)n");
	}
	
	// toString
	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", color=" + color + "]";
	}
	
	
}
