package com.hwua.demo;

public class Demo02 {

	public static void main(String[] args) {
		
		int i = 100;
		while (true) {
			if (i++ > 100) {
				System.out.println("1");
				//-- ���ҽ��� if����for����while��.��ֻ��1�����ʱ,����ʡ�Դ�����
				break;
			}
			System.out.println(i);
			
		}
		
	}
}
