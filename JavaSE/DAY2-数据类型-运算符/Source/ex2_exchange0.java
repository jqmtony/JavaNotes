/*
	2.	ʵ������int���ͱ���ֵ�Ľ�����Ҫ��ʹ���м����
*/

import java.util.Scanner;

public class ex2_exchange0 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- ��������int����ֵ
		System.out.println("��������int����ֵ��");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("����ǰ��");
		System.out.println("num1="+num1+"\t num2="+num2);
		//-- ��������intֵ
		num1 = num1 + num2; // 4+6
		num2 = num1 - num2; // 4+6-6
		num1 = num1 - num2; // 4+6-4
		System.out.println("������");
		System.out.println("num1="+num1+"\t num2="+num2);
	}
}