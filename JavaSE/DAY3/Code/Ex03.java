import java.util.Scanner;
/*
	�����ε������ʽ:
		S = 1/2 a(��)h(��)
 */
class Ex03{
	public static void main(String[] args){
		//-- 1.����
		//-- 2.���ṩScanner
		Scanner scan = new Scanner(System.in);
		//-- 3.��¼��׺͸�
		System.out.println("���������εĵ�");
		int i = scan.nextInt();
		System.out.println("���������εĸ�");
		int j = scan.nextInt();
		//-- 4.ʹ�������������ʽ������
		int area = i*j*1/2;
		//double area = i*j*0.5;
		//-- 5.������		
		System.out.println("Area:\t" + area);
	}

}