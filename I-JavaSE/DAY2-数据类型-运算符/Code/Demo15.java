//-- Ŀ�ľ��Ǹ��ߵ�ǰ��.���»�ʹ��һ�����ֽ���Scanner����.
//-- ���õ�ǰ��(Demo15)֪��������ȥ�����Scanner.
import java.util.Scanner;
class Demo15{
	public static void main(String[] args){
		//System.in �Ǳ�׼����.����ȡ����¼�������
		Scanner scan = new Scanner(System.in);
		//-- ����һ������.���ڱ������¼�������
		System.out.println("����������1:");
		int num1 = scan.nextInt();
		System.out.println("����������2:");
		int num2 = scan.nextInt();
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
	}
}