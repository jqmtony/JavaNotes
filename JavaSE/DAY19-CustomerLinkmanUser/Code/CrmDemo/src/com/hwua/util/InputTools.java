package com.hwua.util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * װ��ģʽ ��Scanner����װ��.�õ�һ��ȫ�µ�Scanner����
 * 
 * @author Administrator
 *
 */
public class InputTools {
	private final static Scanner scan;

	static {
		scan = new Scanner(System.in);
	}

	/**
	 * ���·�װScanner��nextInt
	 * 
	 * @return
	 */
	public static int nextInt() {
		int input = 0;
		while (true) {
			try {
				input = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("�������Ͳ�ƥ��,����������");
				scan.next();
			}
		}
		return input;
	}

	public static String next() {
		return scan.next();
	}

	public static String nextLine() {
		return scan.nextLine();
	}
	
	//-- ���ýӿڻص����ر�Scanner.

}
