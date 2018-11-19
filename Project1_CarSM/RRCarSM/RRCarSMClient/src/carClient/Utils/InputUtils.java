package carClient.Utils;
/**
 * 提供Scanner容器并提供异常处理和输入提示语
 * @author 李文娟
 *
 */

import java.util.Scanner;

public class InputUtils {
	protected static Scanner myInput;

	/**
	 * 获取字符串
	 */
	public static String myInputString() {
		myInput = new Scanner(System.in);
		String result = myInput.next();
		return result;
	}
	/**
	 * 获取整型
	 */
	public static int myInputInt() {
		myInput = new Scanner(System.in);
		int result = myInput.nextInt();
		return result;
	}
	/**
	 * 获取用户名
	 * @return 
	 */
	public static String inputUserName() {
		System.out.println("请输入用户名：");
		myInput = new Scanner(System.in);
		String result = myInput.next();
		return result;
	} 
	/**
	 * 获取用户密码
	 * @return 
	 */
	public static String inputUserPwd() {
		System.out.println("请输入密码：");
		myInput = new Scanner(System.in);
		String result = myInput.next();
		return result;
	} 
}
