package com.hwua.util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 装饰模式 对Scanner进行装饰.得到一个全新的Scanner功能
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
	 * 重新封装Scanner的nextInt
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
				System.out.println("输入类型不匹配,请重新输入");
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
	
	//-- 利用接口回调来关闭Scanner.

}
