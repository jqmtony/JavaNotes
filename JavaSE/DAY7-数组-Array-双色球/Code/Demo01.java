import java.util.Random;

/*
 * 
 * ͳ���������ظ���Ԫ��.
 * 
 */
public class Demo01 {

	public static void main(String[] args) {
		//-- 1.����Random
		Random random = new Random();
		//-- 2.�ṩ����
		int[] array = new int[50];
		//-- 3.�����������Ԫ�� Ԫ�ص�ȡֵ10-50
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(41) + 10;
		}
		//-- 4.Ԥ�������е�����
		for (int i : array) {
			System.out.print(i+" ");
		
		}
		//-- 5.��ʼͳ���������ظ���Ԫ��
		
		//-- 5.1����һ��������.����ĳ�����ȡֵ��Χ.�������ȡֵ��Ϊ��������±����
		int[] newArray = new int[41];
		//-- 5.2ѭ������ԭ����
		for (int i : array) {
			//-- ȡԭ�����е�ֵ��Ϊ��������±�..�±�����Ӧ�Ŀռ䱣����ֵĴ���
			newArray[i - 10] = newArray[i - 10] + 1; 
		}
		//-- 5.3 ��ӡ������
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] != 0) {
				System.out.println("\nԪ��:\t" + (i+ 10) + "\t���ִ���:\t" + newArray[i]);
			}
		}
		
	}
}











