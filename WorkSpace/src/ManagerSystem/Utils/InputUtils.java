package ManagerSystem.Utils;
/**
 * 工具类，提供Scanner，调用就可以直接输入值，不用一直新创建，比较清晰和方便
 * @author Administrator
 *
 */

import java.util.Scanner;

public class InputUtils {
	private static Scanner mScanner;
	static {
		mScanner = new Scanner(System.in);
	}

	/**
	 * 获取int类型的输入
	 * 
	 * @return
	 */
	public static int nextInt() {
		return mScanner.nextInt();
	}

	/**
	 * 获取String类型的输入
	 * 
	 * @return
	 */
	public static String nextStr() {
		return mScanner.next();
	}

}
