import java.util.Arrays;
import java.util.Random;

/*
 * 	5.	���һ������.���ڰ�Сд����ĸת���ɴ�д.
 * 	��String s=str.toLowerCase();
 * String s=str.toUpperCase();
 * �����ַ��������ַ�����Сдת��
 */

public class D8_Ex6_toUpperCase {
	
	public static void main(String[] args) {
		 
		// ����String����
		String[] array = {"abcdefghijDEFGHklm","nopqrstuvwxyzABCIJKLM","NOPQRSTUVW","XYZ0123456789"};
		// TODO �������StringԪ��
		// ���÷���
		toUpperCase(array);
	}

	private static void toUpperCase(String[] array) {
		System.out.println("String1��"+Arrays.toString(array));
		for(int i=0;i<array.length;i++) {
//			String Upstr = str.toUpperCase();
			array[i] = array[i].toUpperCase();
		}
		System.out.println("String2��"+Arrays.toString(array));
	}
	
	
}











