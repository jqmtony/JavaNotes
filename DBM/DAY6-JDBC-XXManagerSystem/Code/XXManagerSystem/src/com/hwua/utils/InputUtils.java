package com.hwua.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class InputUtils {
	private final static Scanner mScanner;

	static {
		mScanner = new Scanner(System.in);
	}	
	
	/**
	 * ' ��ȡ��������
	 * @return
	 */
	public static int nextInt() {
		int result = 0;
		while (true) {
			try {
				result = mScanner.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("����������:");
				mScanner.next();
			} 
		}
		return result;
	}

	/**
	 * ' ��ȡ�ַ�������
	 * @return
	 */
	public static String nextString() {
		return mScanner.next();
	}

}
