package com.hvua.domian.test;

import com.hvua.domain.Teacher;

public class TecherTest {
	public static void main(String[] args) {
		
		// ����һ�����������޲ι��췽��
		Teacher t1 = new Teacher();
		t1.name = "����ʦ";
		t1.gender= "��";
		t1.salary = 8000;
		t1.age = 30;
		
		// ����һ�����������вι��췽��
		Teacher t2 = new Teacher("����ʦ", "Ů", 28, 5000);
		
		// ���ý�ʦ����нˮ�ķ�������������нˮ��Ľ�ʦ��Ϣ���
		t1.addSalary(5000);
		t2.addSalary(5000);
		
		System.out.println(t1);
		System.out.println(t2);
		
	}
	
	
}
