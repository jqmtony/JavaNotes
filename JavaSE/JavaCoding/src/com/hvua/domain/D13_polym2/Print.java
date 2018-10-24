package com.hvua.domain.D13_polym2;

public class Print extends School{
	private String type;
	
	public Print(String type) {  // 打印是黑白的还是彩色的
		super(type);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void printStu(Student student) {
//		System.out.println("*****请注意，你选择的打印类型为："+getType());
		if(student.getClass()==Student.class) {
			System.out.println(student.toString());
		}else {
			System.out.println("打印对象出错！");
		}
	}

}
