/*
 * �������50��10~50��������ͳ��ÿ�����ָ����ּ���
 * ����0�����ֲ���ӡ
 */

import java.util.Arrays;
import java.util.Random;

public class arrayStatic {
	public static void main(String[] args) {
		
		int num = 0; 
		Random random = new Random();
		int[] array = new int[10]; // ��������
//		
		for(int i=0;i<array.length;i++) {
//			num = (int)(Math.random()*10+5); // �������Ԫ��
			num = random.nextInt(5)+1;
			array[i] = num;
//			System.out.println("����ĵ�"+index+"��Ԫ��Ϊ��"+i);
//			System.out.println(Arrays.toString(array));
		}

		System.out.println("ԭʼ����"+Arrays.toString(array));
		
		// ����:1. ���� 2.�Ƚ�j��j+1,count++����������������Բ������break;�Ϳ�����
		int temp = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp; // ���ֵ�����ţ�С��ֵ��ǰ��
				}
			}
		}
	
		System.out.println("�ڶ������򣨴�С���󣩣�"+Arrays.toString(array));
		
		// ͳ�Ƴ��ֵĴ���
		int count = 1;
		for(int i=0;i<=array.length+1;i++) {
			if(array[i]==array[i+1]) { // ���ǰ��һ��ֵ���ں���һ��ֵ
				count = count + 1; 
				System.out.println("ֵ��"+array[i]+"�����ֵĴ���һ��Ϊ��"+count);
			}else {
				count = 1;
			}
		}
	}
}

















