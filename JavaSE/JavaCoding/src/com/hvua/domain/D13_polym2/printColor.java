package com.hvua.domain.D13_polym2;

public class printColor extends Print {

	public printColor() {
		super("��ɫ");
	}

	@Override
	public void printStu(Student student) {
		System.out.println("��ɫ��ӡ****ѧ����Ϣ****");
		System.out.println(student);
	}

}
