/*
	6. ĳ����˾���ù��õ绰�������ݣ�
	��������λ���������ڴ��ݹ������Ǽ��ܵģ�
	���ܹ������£�ÿλ���ֶ�����5,Ȼ�����10��������������֣�
	�ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
	������λ���룬����ܺ�ĺ���Ϊ���٣�
*/


import java.util.Scanner;

public class hw6_secret {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- ����һ����λ����
		System.out.println("����һ����λ����");
		int num1 = scan.nextInt();
		//-- ÿλ���ֶ�����5
		int a1 = num1/1000+5; //ǧλ
		int b1 = num1/100%10+5; //��λ 1450/100=14%10=4
		int c1 = num1/10%10+5; //ʮλ 1450/10=145%10=5
		int d1 = num1%10+5; //��λ 1455%10=5
		System.out.println("ÿλ���ּ�5��"+a1+","+b1+","+c1+","+d1);
		//-- ����10���������������
		int a2 = a1 % 10;
		int b2 = b1 % 10;
		int c2 = c1 % 10;
		int d2 = d1 % 10;
		System.out.println("����10��������"+a2+","+b2+","+c2+","+d2);
		//-- ����һλ�͵���λ�������ڶ�λ�͵���λ����
		int num2 = d2*1000 + c2*100 + b2*10 + a2;
		//-- ������ܺ�����ݣ�˳��d2-c2-b2-a2
		System.out.println("�����������Ϊ��"+num1);
		System.out.println("���ܺ������Ϊ��"+num2);
	}
}
