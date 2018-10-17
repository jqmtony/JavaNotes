import java.util.Arrays;
import java.util.Scanner;

public class D8_Ex3_tryMethod {
	/*
	 *	�������е�Ԫ�ؽ�����ɾ�Ĳ�
	 */

		public static void main(String[] args) {
			// 1.��������
			int[] array = {0,1,2,3,4,5,6,7};
			
			// 2.�ƶ�ĳ��Ԫ�ؽ��в���
			System.out.println("Ԫ�س���Ϊ��"+array.length);
			System.out.println("��������Ҫ���в�����Ԫ���±꣺");
			Scanner scan=new Scanner(System.in);
			int p = 0;
			while(true) {
				p = scan.nextInt();
				if(p<0 || p>array.length-1){
					System.out.println("������±곬����Χ�����������룺");
					continue;
				}
				break;
			}
			System.out.println("ArrayΪ��"+Arrays.toString(array)+"���±꣺"+p+"��ֵ��"+array[p]);
			
			// 3.���÷������в���
			System.out.println("��������Ҫ���еĲ�����1.��� 2.ɾ�� 3.�滻 4.��ѯ");
			int operator = scan.nextInt();
			int[] result = new int[array.length+1];
			switch(operator){
				case 1:
					result = addEle(array,p);
					System.out.println("������Ϊ"+Arrays.toString(result)+"���±꣺"+p+"��ֵ��"+array[p]);
					break;
				case 2:
					result = delEle(array,p);
					System.out.println("������Ϊ"+Arrays.toString(result)+"���±꣺"+p+"��ֵ��"+array[p]);
					break;
				case 3:
					result = changeEle(array,p);
					System.out.println("������Ϊ"+Arrays.toString(result)+"���±꣺"+p+"��ֵ��"+array[p]);
					break;
				case 4:
					result = findEle(array,p);
					System.out.println("������Ϊ"+Arrays.toString(result)+"���±꣺"+p+"��ֵ��"+array[p]);
					break;
				default:
					;
					break;
			}

			
		}  
		// ������main����
		
		// 4.����
		// 4.1 ����Ԫ��
		public static int[] addEle(int[] array, int p){
			array = Arrays.copyOf(array, array.length+1);
			array[array.length-1] = array[p];
			return array;
		}
		// 4.2 ɾ��Ԫ��
		public static int[] delEle(int[] array, int p){
			for(int i=p;i<array.length-1;i++) { // �����ֵͳһǰ��
				// 0 1 2 3 (4) 5 6 7 8��
				// 0 1 2 3 5 6 7 8
				int temp = array[i];	// ��p��ֵ��ʼ��pΪp+1��ֵ
				array[i]=array[i+1];
				array[i+1]=temp;
			}
			array = Arrays.copyOf(array, array.length-1);
			return array;
		}
		// 4.3 �ı�Ԫ��
		public static int[] changeEle(int[] array, int p){
			for(int i=0;i<array.length-1;i++) {
				if(array[i]==array[p]) {
					array[i] = 123;
				}
			}
			return array;
		}
		// 4.4 ��ѯԪ��
		public static int[] findEle(int[] array, int p){
			for(int i=0;i<array.length-1;i++) {
				if(array[i]==array[p]) {
					System.out.print(array[p]);
				}
			}
			return array;
		}
	

}
