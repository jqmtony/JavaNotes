package ManagerSystem.Utils;
/**
 * 工具类，提供Scanner，调用就可以直接输入值，不用一直新创建，比较清晰和方便
 * @author Administrator
 *
 */

import java.util.Scanner;

public class getInput {
	private static Scanner mScanner;

	/**
	 * 获取int类型的输入
	 * @return
	 */
	public static int nextInt() {
		int num = mScanner.nextInt();
		return num;
	}
/**
 * 获取String类型的输入
 * @return
 */
	public static String nextStr() {
		String str = mScanner.nextLine();
		return str;
	}
	/**
	 * 获取User的用户名
	 */
	public static String getUserName() {
		System.out.println("请输入用户名：");
		String userName = getInput.nextStr();
		return userName;
	}
	/**
	 * 获取User的密码
	 */
	public static int getUserPwd() {
		System.out.println("请输入密码：");
		int pwd = getInput.nextInt();
		return pwd;
	}
}
