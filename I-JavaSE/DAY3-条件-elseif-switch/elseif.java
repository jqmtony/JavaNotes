/*
	12.��ҵ���ŵĽ������������ɡ�
	a ����(I)���ڻ����10��Ԫʱ���������10%��
	b �������10��Ԫ������20��Ԫʱ��
	����10��Ԫ�Ĳ��ְ�10%��ɣ�
	����10��Ԫ�Ĳ��֣��ɿ����7.5%��
	c 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
	d 40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
	e 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%��
	f ����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
	�Ӽ������뵱������I����Ӧ���Ž���������
*/
import java.util.Scanner;

public class elseif {
	public static void main(String[] args) {
		//-- ����Scanner
		Scanner scan = new Scanner(System.in);
		//-- ������ҵ����
		System.out.print("��ҵ����Ϊ��");
		double i = scan.nextInt();
		//-- �������Ĺ���
		double a = i * 0.1;
		double b = 10 * 0.1 + (i - 10) * 0.75;
		double c = 10 * 0.1 + 10 * 0.75 + (i-20) * 0.05;
		double d = 10 * 0.1 + 10 * 0.75 + 20 * 0.5 + (i - 40) * 0.03;
		double e = 10 * 0.1 + 10 * 0.75 + 20 * 0.5 + 20 * 0.03 + (i - 60) * 0.015;
		double f = 10 * 0.1 + 10 * 0.75 + 20 * 0.5 + 20 * 0.03 + 20 * 0.015 + (i - 100) * 0.01;
		
		double extra = 0.0;
		//-- �����������
		if(i <= 10) {
			System.out.println(a);
		}else if(i < 20) {
			System.out.println(b);
		}else if(i < 40) {
			System.out.println(c);
		}else if(i < 60) {
			System.out.println(d);
		}else if(i < 100) {
			System.out.println(e);
		}else {
			System.out.println(f);
		}
	}
}