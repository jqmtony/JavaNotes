package com.hvua.domain.D13_polym2;

public abstract class Print extends School{
	private String type;
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	
	public Print(String type) {  // 打印是黑白的还是彩色的
		super(type);
		this.type = type;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String getType() {
		return type;
	}

	public abstract void printStu(Student student);

}
