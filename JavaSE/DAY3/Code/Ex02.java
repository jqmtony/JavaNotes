/*
	���ǿ�����JDK��Ŀ¼���ҵ�src.zip Դ���ѹ���ļ���
	���������·�����ǿ����ҵ�Scanner����ļ�.
	·����: java�ļ�����/util�ļ����µ�/Scanner.java �ļ�
	
	import ��һ���ؼ��� keyword
	
 */
import java.util.Scanner;

class Ex02{
	/*
		ǧ��Ҫ����Ӳ��
	 */
	public static void main(String[] args){
		//-- 1.����
		//-- 2.�ṩScanner����.(�ȼ�סд��������˵��7��֮��)
		Scanner scan = new Scanner(System.in);
		//-- 3.��ȡ����¼�벢���浽����������
		System.out.println("����������1");
		int num1 = scan.nextInt();
		System.out.println("����������2");
		int num2 = scan.nextInt();
		System.out.println("����ǰ:");
		System.out.println("Num1:" + num1);
		System.out.println("Num2:" + num2);
		//-- 4.��������
		/*
			num1:1
			num2:2
				
			Ŀ��:
			num1:2  3-1   
			num2:1	3-2
			
			num1+num2 = 3
			
		 */
		 num2 = num1 + num2;
		 num1 = num2 - num1;
		 num2 = num2 - num1;
		//-- 5.��ӡ���
		System.out.println("������:");
		System.out.println("Num1:" + num1);
		System.out.println("Num2:" + num2);
	}
}








