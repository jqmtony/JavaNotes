/*
	4. �Ӽ�������һ����λ�����������ֱ��ӡ����
	��λ��
	ʮλ��
	��λ��
	����λ������
*/

import java.util.Scanner;

public class hw4_printInt {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- ����һ����λ��������
		System.out.println("����һ����λ��������");
		int num = scan.nextInt();
		//-- ��ӡ��λ��ʮλ����λ
		System.out.println("��λ��"+(num/100)); //220/100=2
		System.out.println("ʮλ��"+(num/10%10)); //220/10=22%10=2
		System.out.println("��λ��"+(num%10)); //222%10=2 
	}
}
