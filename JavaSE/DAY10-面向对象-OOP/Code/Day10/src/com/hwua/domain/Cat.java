package com.hwua.domain;
/*
 * 1.	С��������ֻè��һֻ��С�ڣ�����2�꣬
 * ��ɫ����һֻ��С�ף�����5�꣬��ɫ�����д
 * һ������Ҫ���û�����Сè������ʱ��
 * ����ʾè�����֡��������ɫ������û�����
 * ��Сè���ִ�������ʾ��С��û������ֻè����
 */
public class Cat {
	//-- ��Ա���� Field
	public int age;
	public String color;
	public String name;
	
	/**
	 * 
	 * @param food ����  Argument
	 */
	public void eat(Food food) {
		//-- �ֲ����� Local Variable
		int i = 0;
	}
	
	@Override
	public String toString() {
		return "����:\t" + age + "\n��ɫ:\t" + color + "\n����:\t" + name;
	}
	
}
