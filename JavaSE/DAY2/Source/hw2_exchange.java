/*
	2. �Ӽ������������������浽���������У���������������ֵ������
	����ӡ���ÿ��������ֵ����ʽ���£�
	num1 = **
	num2 = **

*/
import java.util.Scanner;

public class hw2_exchange {
	public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	//-- ��������ֵ
	System.out.println("�����1�����֣�");
	int num1 = num.nextInt();
	System.out.println("�����2�����֣�");
	int num2 = num.nextInt();
	System.out.println("�����������ֵΪ��"+num1+","+num2);
	//-- ��������������ֵ
	num1 = num2;
	num2 = num1;
	System.out.println("������������ֵΪ��"+num1+","+num2);
	}
}