package com.hvua.domain.D16_Exception;

import java.util.Scanner;

public class hw1_judgeTri {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 输入三角形的三个边长，两边之和大于第三边则成立
		System.out.println("输入第一条边的边长");
		int a = scanner.nextInt();
		System.out.println("输入第二条边的边长");
		int b = scanner.nextInt();
		System.out.println("输入第三条边的边长");
		int c = scanner.nextInt();

		judge(a, b, c);

	}

	private static void judge(int a, int b, int c) {
		if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
			throw new IllegalArgumentException(a+","+b+","+c+"不能构成三角形");
		}else {
			System.out.println(a+","+b+","+c+"可以构成三角形");
		}
	}

}
