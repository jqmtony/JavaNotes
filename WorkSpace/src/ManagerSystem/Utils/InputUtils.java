package ManagerSystem.Utils;
/**
 * �����࣬�ṩScanner�����þͿ���ֱ������ֵ������һֱ�´������Ƚ������ͷ���
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
	 * ��ȡint���͵�����
	 * 
	 * @return
	 */
	public static int nextInt() {
		return mScanner.nextInt();
	}

	/**
	 * ��ȡString���͵�����
	 * 
	 * @return
	 */
	public static String nextStr() {
		return mScanner.next();
	}

}
