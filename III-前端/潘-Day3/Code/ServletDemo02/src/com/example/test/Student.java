package com.example.test;

public class Student {
	private int stuId;
	private String stuName;

	public int getStuId() {
		return stuId;
	}

	@ABC
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Student(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + "]";
	}

	public void method() {
		System.out.println("≤‚ ‘∑Ω∑®");
	}

}
