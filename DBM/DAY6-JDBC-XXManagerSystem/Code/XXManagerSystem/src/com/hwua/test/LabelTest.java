package com.hwua.test;

public class LabelTest {

	public static void main(String[] args) {
		
		int i = 0;
		A:while (i < 10) {
			System.out.println("��ʼѭ��");
			B:while (i < 100) {
				continue B;
			}
			
		}
	}
}
