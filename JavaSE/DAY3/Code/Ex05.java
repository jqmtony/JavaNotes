import java.util.Scanner;
class Ex05{
	public static void main(String[] args){
		//-- 1.����
		//-- 2.�ṩScanner
		Scanner scan = new Scanner(System.in);
		//-- 3.¼��һ����λ����(�����ṹ����֤.��֤����λ����)
		System.out.println("������һ����λ��");
		int num = scan.nextInt();
		System.out.println("����ǰ:\t" + num);
		//-- 4.����
		//-- 4.1 ���ĸ�λ�ϵ���
		//-- ��λ
		int i = num % 10;
		//-- ʮλ
		int j = num % 100 / 10;
		//-- ��λ
		int k = num % 1000 / 100;
		//-- ǧλ
		int l = num / 1000;
		//-- 4.2 ÿ��λ�ϵ���+5%10������
		i = (i + 5) % 10;
		j = (j + 5) % 10;
		k = (k + 5) % 10;
		l = (l + 5) % 10;
		//-- 4.3 1��4λ����
		//-- �ṩ�м����
		int temp = 0;
		temp = i;
		i = l;
		l = temp;
		//-- 4.4 2��3λ����
		temp = j;
		j = k;
		k = temp;
		//-- 4.5���¹���һ����λ��
		num = l * 1000 + k * 100 + j * 10 + i;
		//-- 5.����µ���λ��
		System.out.println("���ܺ�:\t" + num);
		//-- ���ѧ���������������������ж��µ����ǳ����Ƕ��ٲ���4λ��0.
		System.out.println("���ܺ�:\t" + l + k + j + i);
		
	}
}