package com.hvua.domain.D13_polym2;

public class School {
	private String name;
	private Print print;
	
	public School(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrint(Print print) {
		this.print = print;
	}
	
	public void operate(Student student) {
		System.out.println("\n ["+getName()+"]����ѡ��["+print.getType()+"]��ӡѧ����Ϣ"); // ĳĳ���ģ���ӡ��ĳĳѧ��
		print.printStu(student);
	}
}
