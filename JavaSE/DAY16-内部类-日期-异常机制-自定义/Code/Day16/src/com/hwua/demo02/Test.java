package com.hwua.demo02;

public class Test {

	public static void main(String[] args) {
		//-- �ӿ��ǲ����Դ��������
		//Cannot instantiate the type Anonymous
		/*
		 * �����Ŵ���һ���������.�����û������.���б�����������.
		 * ����Ϊ��д���ڲ����о��������ڲ���
		 * �����ͽӿڵĹ�ϵ:���û�����ֵ���ʵ����Anonymous�ӿ�.
		 */
		Anonymous a = new Anonymous() {
			@Override
			public void method() {
				System.out.println("������!");
			}
		};
		//- a ָ��ĵ�����˭? ָ����Anonymous��ʵ����Ķ���.
		a.method();	
	}
}
