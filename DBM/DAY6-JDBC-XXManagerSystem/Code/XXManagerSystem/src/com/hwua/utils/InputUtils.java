package com.hwua.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class InputUtils {
	private final static Scanner mScanner;

	static {
		mScanner = new Scanner(System.in);
	}	
	
	/**
	 * ' 获取整数类型
	 * @return
	 */
	public static int nextInt() {
		int result = 0;
		while (true) {
			try {
				result = mScanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("请输入数字:");
				mScanner.next();
			} 
		}
		return result;
	}

	/**
	 * ' 获取字符串类型
	 * @return
	 */
	public static String nextString() {
		return mScanner.next();
	}

}
