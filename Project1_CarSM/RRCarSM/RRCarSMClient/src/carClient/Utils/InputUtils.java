package carClient.Utils;
/**
 * �ṩScanner�������ṩ�쳣�����������ʾ��
 * @author ���ľ�
 *
 */

import java.util.Scanner;

public class InputUtils {
	protected static Scanner myInput;

	/**
	 * ��ȡ�ַ���
	 */
	public static String myInputString() {
		myInput = new Scanner(System.in);
		String result = myInput.next();
		return result;
	}
	/**
	 * ��ȡ����
	 */
	public static int myInputInt() {
		myInput = new Scanner(System.in);
		int result = myInput.nextInt();
		return result;
	}
	/**
	 * ��ȡ�û���
	 * @return 
	 */
	public static String inputUserName() {
		System.out.println("�������û�����");
		myInput = new Scanner(System.in);
		String result = myInput.next();
		return result;
	} 
	/**
	 * ��ȡ�û�����
	 * @return 
	 */
	public static String inputUserPwd() {
		System.out.println("���������룺");
		myInput = new Scanner(System.in);
		String result = myInput.next();
		return result;
	} 
}
