import java.util.Random;
import java.util.Scanner;
class Ex01{
	public static void main(String[] args){
		/*
			1.������ܹ�����һ����Ʒ�ļ۸�
				Math.random
				Random
			2.���ظ�5��
			3.�����жϼ۸��Ƿ�ƥ��
		 */
		Random random = new Random(1);
		int target = random.nextInt(8001)+2000;
		System.out.println("��������۸�:\t" + target);
		
		for(int i = 5 ;i >= 1 ; i --){
			Scanner scan = new Scanner(System.in);
			System.out.print("������һ���۸�:\t");
			int userInput = scan.nextInt();
			
			if(target == userInput){
				System.out.println("��ϲ��¶���");
				//-- ʹ��break�뿪forѭ��
				//-- breakֻ���Գ����������һ��for
				//-- ��break��Ŀ��:��ֹѭ��
				//-- �ı�ѭ�������������������Ϳ�����ֹѭ��.
				break;
				//i = 0;
			}else if(target < userInput){
				System.out.println("��Сһ��");
			}else{
				System.out.println("�ٴ�һ��");
				//System.out.println("��ʣ��" + (i - 1) + "��");
			}
			/*
				i 5  4
				i 4  3
				i 3  2
				i 2  1
				i 1  0
			 */
			System.out.println("��ʣ��" + (i - 1) + "��");
			
		} 
	}
}