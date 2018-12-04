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
	 * �������������������ͱȽϴ�СȻ������ķ���.
	 * Ĭ�ϴ�С������.
	 */
	@Override
	public int compareTo(Student o) {
		/*
		 *  this.compareTo(other)
		 *  ͨ������ֵ��ȷ��this��other�Ĵ�С��ϵ.
		 *  ���� �������
		 *  0      �������
		 *  ���� ����С��
		 */
		return -(this.getStuScore() - o.getStuScore());
	}
	
}
