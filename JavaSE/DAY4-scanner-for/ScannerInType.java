/* ����ĸ��д��һ��������������Ҳ�ᣬ��������ȫ����д */

import java.util.Scanner;

public class ScannerInType{
	public static void main(String[] args){
		/* 
			������һ�������������ͱ�����������������Scanner���ͣ�
			����������scan���������ʼֵ��new.Scanner(System.in)��
			���ԭ����ת������ScannerС������Ҳ����
		*/
		Scanner scan = new Scanner(System.in);
		// int i = 0;
		// byte b = 0;
		// �� byte��ֵ��int��С�����Զ�ת��
		// i = b; 
		
		// ����Scanner���Խ��ܵ���������
		System.out.println("����Scanner��ԭ���������͵�֧�֣�");
		
		System.out.println("��������");
		int i = scan.nextInt();
		System.out.println("�����ֽ�");
		byte b = scan.nextByte();
		System.out.println("���ܶ�����");
		short s = scan.nextShort();
		System.out.println("���ܳ�����");
		long l = scan.nextLong();
		System.out.println("���ܵ����ȸ���");
		float f = scan.nextFloat();
		System.out.println("����˫���ȸ���");
		double db = scan.nextDouble();
		System.out.println("���ܲ���ֵ");
		boolean bl = scan.nextBoolean();
		System.out.println("�����ַ���");
		String str = scan.nextLine();
		System.out.println("�����ַ�");
		//-- ��֧��printchar�����Ի�ȡ��һ��Ԫ��
		char c = scan.next().charAt(0);
		System.out.println("c:"+c);
		
	}
}