import java.util.Scanner;
class Demo06{
	//	�Ӽ������������������մ�С�����˳���ӡ������
	public static void main(String[] args){
		//-- 1.����
		//-- 2.����Scanner����
		Scanner scan = new Scanner(System.in);
		//-- 3.¼��������
		System.out.print("����������1:\t");
		int num1 = scan.nextInt();
		System.out.print("����������2:\t");
		int num2 = scan.nextInt();
		//-- 4.���������ṹ�ж��������Ĵ�С.���մ�С����˳���ӡ
		//-- 4.1 ����˫��if�ж��������
		if(num1 < num2){
			System.out.println("��С��:\t" + num1 + "\t�ϴ��:\t" + num2);
		}else{
			System.out.println("��С��:\t" + num2 + "\t�ϴ��:\t" + num1);
			
		}
	}
	
}