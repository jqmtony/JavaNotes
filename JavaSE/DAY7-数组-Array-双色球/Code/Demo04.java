import java.util.Arrays;
import java.util.Scanner;

/*
  * �������е�Ԫ�ؽ�����ɾ�Ĳ�
 */
public class Demo04 {

	public static void main(String[] args) {
		
		String[] array = {"A","B","C","D","E"};
		
		//-- 1.˳�����Ԫ��.��Ȼ�����ĩβ
		
		//-- 1.1 ���ݴ���.�ı�����Ĵ�С
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = "F";
		for (String str : array) {
			System.out.println(str);
		}
		
		//-- 2.�м�������. �������Z�ŵ�B��C���м�.
		array = Arrays.copyOf(array, array.length + 1);
		//-- array.length = 7
		for (int i = array.length - 1; i > 0 ; i--) {
			// A B C D E F
			// A B C D E F X
			// 
			array[i] = array[i-1];
			if (array[i].equals("C")) {
				array[i - 1] = "Z";
				break;
			}
			
		}		
		System.out.println(Arrays.toString(array));
		
		
		//-- 3.�����е�Ԫ���в���ָ��Ԫ���Ƿ����
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character:\t");
		String temp = scan.next();
		//-- �������б���.(���ֻ��Ҫ�����л���û��)
		for (String str : array) {
			if (temp.equals(str)) {
				System.out.println("�д�����ͬԪ��");
				break;
			}
		}
		
		
		System.out.println("ɾ��ǰԤ������:\t");
		System.out.println(Arrays.toString(array));
		// A B Z C D E F
		//-- 4.ɾ������Ԫ��
		//-- Ŀ��ɾ��ZԪ��
		//-- ˼·: ��Z��ʼ�Ѻ����Ԫ����ǰ����..����Arrasy.copyOf() �������һ���ռ�
		for (int i = 0; i < array.length - 1; i++) {
			// ��Z���������
			if (array[i].equals("Z")) {
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;		
			}			
		}
		array = Arrays.copyOf(array, array.length-1);
		System.out.println("ɾ����:\t");
		System.out.println(Arrays.toString(array));
	}
}
