import java.util.Random;
import java.util.Arrays;


/*
 * Ŀ�꣺
 * ʵ��һ�����飬����Ϊ10�������Ԫ��ȡֵ�����1-10��û���ظ�
 */

public class tryArray2 {
	public static void main(String[] args) {
		boolean isSame = false;
		//-- 1.�ṩrandom
		Random random = new Random();
		//-- 2.�ṩ��������
		int[] array = new int[7];
		//-- 3.����ѭ���������е�Ԫ�ؽ��и�ֵ����
		for(int i=0;i<array.length;i++) {
			//-- Ŀ�ģ���������ŵ�����array�е�i��λ����
			array[i]=random.nextInt(10)+1;
			//-- Ŀ�ģ�ȡ��0~iλ���ϵ�Ԫ�غ͵�iλ���ϵ�Ԫ�ؽ��бȽ�
			for(int j=0;j<i;j++) {
				if(array[i]==array[j]) { // ֵ��ͬ
					i=i-1;
					isSame = true;
//					System.out.println("------------"+i+isSame);
					break;
				}else {
					isSame = false; // ֵ��ͬ
//					System.out.println("////////////"+i+isSame);
				}
//				System.out.println("33333333333"+i+isSame); 
			}
			if (!isSame) { 
				System.out.println("��" + (i) + "λ���ϵ�Ԫ����:" + array[i]);
				System.out.println(isSame); 
//			}
		}
	}
}

