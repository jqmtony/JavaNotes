/*
	java.util��·��.��Ӧ��Window���ļ��о�����
	����Ƕ�׵��ļ���
	�ļ���java�����ļ���util
	
	Scanner.����ĸ��д.������Java�л�����ĸ��дֻ��
	�������
	1.����
		ֻҪ������ĸ��д��һ��������
	2.����
		������������һ��.������Ҫȫ��д
		
	����Scanner ��һ���������.һ�������һ����ͻ���һ��Դ�ļ�
	������Դ�ļ�Scanner.java
 */
import java.util.Scanner;

public class Ex01{
	public static void main(String[] args){
		/*
			������һ�������������ͱ���.������������
			Scanner����. ����������scan.�������ʼֵ
			�ѵȺ��ұ����忴��һ��ֵ.
			��ֵ��Scanner���͵�.(���ԭ����ת��.��ScannerС������Ҳ����)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("����Scanner��ԭ���������͵�֧��");
		
		System.out.println("��������");
		int i = scan.nextInt();
		System.out.println("�����ֽ�");
		byte by = scan.nextByte();
		System.out.println("���ն�����");
		short s = scan.nextShort();
		System.out.println("���ճ�����");
		long l = scan.nextLong();
		System.out.println("���յ����ȸ���");
		float f = scan.nextFloat();
		System.out.println("����˫���ȸ���");
		double d = scan.nextDouble();
		System.out.println("���ղ���ֵ");
		boolean b = scan.nextBoolean();
		System.out.println("�����ַ���");
		String str = scan.next();
		System.out.println("str:\t" +str);
		System.out.println("�����ַ�");
		
		//-- ͨ��charAt(index)��ȡindex����Ӧ���ַ�.
		char c = scan.next().charAt(0);	
		System.out.println("c:\t" + c);
		
		System.out.println("��������ַ���ʮ����ֵ");
		char c1 = (char)(scan.nextInt());
		System.out.println("c1:\t" + c1);
	}
}











