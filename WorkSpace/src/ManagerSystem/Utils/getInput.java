package ManagerSystem.Utils;
/**
 * �����࣬�ṩScanner�����þͿ���ֱ������ֵ������һֱ�´������Ƚ������ͷ���
 * @author Administrator
 *
 */

import java.util.Scanner;

public class getInput {
	private static Scanner mScanner;

	/**
	 * ��ȡint���͵�����
	 * @return
	 */
	public static int nextInt() {
		int num = mScanner.nextInt();
		return num;
	}
/**
 * ��ȡString���͵�����
 * @return
 */
	public static String nextStr() {
		String str = mScanner.nextLine();
		return str;
	}
	/**
	 * ��ȡUser���û���
	 */
	public static String getUserName() {
		System.out.println("�������û�����");
		String userName = getInput.nextStr();
		return userName;
	}
	/**
	 * ��ȡUser������
	 */
	public static int getUserPwd() {
		System.out.println("���������룺");
		int pwd = getInput.nextInt();
		return pwd;
	}
}
