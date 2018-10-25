package com.hwua.demo07;

public class Student implements Comparable<Student>{

	private int stuId;
	private String stuName;
	private int stuScore;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuScore() {
		return stuScore;
	}
	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}
	public Student(int stuId, String stuName, int stuScore) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuScore = stuScore;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuScore=" + stuScore + "]";
	}
	/**
	 * 用于两个引用数据类型比较大小然后排序的方法.
	 * 默认从小到大排.
	 */
	@Override
	public int compareTo(Student o) {
		/*
		 *  this.compareTo(other)
		 *  通过返回值来确定this和other的大小关系.
		 *  正数 代表大于
		 *  0      代表等于
		 *  负数 代表小于
		 */
		return -(this.getStuScore() - o.getStuScore());
	}
	
}
