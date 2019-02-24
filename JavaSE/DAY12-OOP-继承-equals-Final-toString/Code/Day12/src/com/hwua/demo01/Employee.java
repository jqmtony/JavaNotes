package com.hwua.demo01;

public class Employee extends Person{
	private String position;
	
	

	public Employee() {
		//-- 这是默认拥有的.即我们什么都不写改行也默认存在.
		super();
	}

	public Employee(int age, char gender, String name,String position) {
		//-- 调用父类构造方法.
		//Constructor call must be the first statement in a constructor
		super(age, gender, name);
		// Alt + 上下箭头
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		//-- super 代表父类对象
		return "Employee [position=" + position + 
				", toString()=" + super.toString() + "]";
	}

	
	
	@Override
	public boolean equals(Object obj) {
		
		//-- 验证参数和类型
		/*
		 * 逻辑运算符有短路现象.可以提升代码的性能.
		 * 
		 */
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		
		//-- 转换类型
		Employee e = (Employee) obj;
		
		//-- 利用特征进行判断
		if (this.getAge() == e.getAge() && this.getGender() == e.getGender() && this.getName().equals(e.getName()) && this.getPosition().equals(e.getPosition())) {
			return true;
		}
		
		return false;
	}

	
	
	

}
