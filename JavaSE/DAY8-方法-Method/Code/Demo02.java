import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("��ӭʹ��DIY������");
		System.out.println("�������һ����");
		int num1 = scan.nextInt();
		System.out.println("������ڶ�����");
		int num2 = scan.nextInt();
		System.out.println("��ѡ��Ҫִ�е�����:1.�ӷ�.2����.3.�˷�.4.����");
		int operator = 0;
		while(true) {
			 operator = scan.nextInt();
			if (operator < 1 || operator > 4) {
				System.out.println("û�и�Ԥ��");
				continue;
			}
			break;
		}
		
		double result = 0;
		switch (operator) {
		case 1:		
			//-- �Ⱥ����������������ͱ���ƥ��
			result = add(num1,num2);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
		System.out.println("������:\t" +result);

	}	
	
	public static double add(int num1,int num2) {
		//-- ����return �����ݷ��ظ����÷����ĵط�
		return num1 + num2;
	}

	
	
	
	
	
	
	
	
	
}
