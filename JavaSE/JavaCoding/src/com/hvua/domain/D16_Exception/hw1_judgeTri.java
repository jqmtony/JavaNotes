package com.hvua.domain.D16_Exception;

import java.util.Scanner;

public class hw1_judgeTri {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// ���������ε������߳�������֮�ʹ��ڵ����������
		System.out.println("�����һ���ߵı߳�");
		int a = scanner.nextInt();
		System.out.println("����ڶ����ߵı߳�");
		int b = scanner.nextInt();
		System.out.println("����������ߵı߳�");
		int c = scanner.nextInt();

		judge(a, b, c);

	}

	private static void judge(int a, int b, int c) {
		if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
			throw new IllegalArgumentException(a+","+b+","+c+"���ܹ���������");
		}else {
			System.out.println(a+","+b+","+c+"���Թ���������");
		}
	}

}
