/*
	5. ʵ�ִӼ�������һ����λ�����������������
*/

import java.util.Scanner;

public class hw5_sequence {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- ����һ����λ������
		System.out.println("����һ����λ������");
		int num1 = scan.nextInt();
		//-- �������
		int a = num1/100; //��λ
		int b = num1/10%10; //ʮλ
		int c = num1%10; //��λ
		int num2 = c*100 + b*10 + a; //����
		System.out.println(num2);
	}
}
