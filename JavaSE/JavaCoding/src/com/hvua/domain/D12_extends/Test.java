package com.hvua.domain.D12_extends;

public class Test {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("����", 22, "��", "ҵ��Ա");
		Employee e2 = new Employee("����", 29, "��", "�ܾ���");
		Employee e3 = new Employee("����", 30, "Ů", "�ͻ�����");
		
		// �Թ涨��ʽ���Employee����Ϣ
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3.toString()); // д��дtoString�����ԣ���������������������Customer����
		
		// �Ƚ�����employee��Ϣ�Ƿ���ȫ��ͬ
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		
	}
}
