package com.hwua.domain.test;
import com.hwua.domain.Person;

public class PersonTest {

	public static void main(String[] args) {
		//-- ����һ��Person���͵�ʵ��:����.
		Person p = new Person();
		
		//-- ����������Խ���ʵ�ʵĸ�ֵ
		p.name = "½�³�";
		p.gender = "��";
		p.age = 25;
		p.weight = 140;
		p.heght = 170;
		
		System.out.println(p.name);
		
		Person p1 = new Person();
		p1.name = "�ڽ�";
		
	}
}
