package com.hvua.domain.D13_polym2;

public class Student extends School{
	private String name;
	private String profession;
	private String grade;
	
	// �вι��죬newʱ��Ҫ������Щ��Ϣ
	public Student(String name, String profession, String grade) {
		super(name);
		this.name = name;
		this.profession = profession;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public String getProfession() {
		return profession;
	}
	public String getGrade() {
		return grade;
	}
	
	// ��ӡѧ����Ϣ
	@Override
	public String toString() {
		return "Student [name=" + name + ", profession=" + profession + ", grade=" + grade + "]";
	}
	
}
