/*
	7. �Ӽ�������һ��һλ��������a��1~9����
	��a+aa+aaa�ĺʹ�ӡ�����
	(��aΪ3������3+33+333�ĺ�)
	
*/

import java.util.Scanner;

public class hw7_sum {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- ����һ��һλ��������a��1~9��
		System.out.println("����һ��һλ��������a��1~9��:");
		int num1 = scan.nextInt();
		//-- a+aa+aaa�ĺ�
		int a = num1;
		int aa = a*10 + a; 
		int aaa = a*100 + aa;
		int sum = a + aa + aaa;
		System.out.println(a+"+"+aa+"+"+aaa+"="+"="+sum);
	}
}
