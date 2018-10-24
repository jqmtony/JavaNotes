package com.hvua.domain.D12_extends;

public class Employee extends Person{
	
	private String position;

	// 无参构造
	public Employee() {
	}
	
	// 含有参数的构造方法
	public Employee(String name, int age, String gender, String position) {
		super(name, age, gender);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public boolean equals(Object obj) {
		/**
		 *  逻辑运算符有短路现象，可以提升代码的性能
		 *  在测试里面可以这样调用：System.out.println(e1.equals(e2));
		 *  若相等，结果为true，若不相等，结果为false
		 */
		if(obj==null || obj.getClass() != this.getClass()) {
			return false;
		}
		Employee e = (Employee) obj; // 转换类型
		
		if(this.getAge()==e.getAge() && this.getGender()==e.getGender() 
				&& this.getPosition()==e.getPosition() && this.getName()==e.getName()) {
			return true;
		}
		return false;
	}

	/**
	 * 重写toString，根据自己想要的输出格式进行输出
	 */
	public String toString() {
		return "职位：" + position + "\n姓名：" + getName() + "\n年龄：" + getAge()
				+ "\n性别：" + getGender() + "\n------------" ;
	}


}
