/* 
	3.	ʵ�ִӼ��������ꡢ�£�
	�жϸ��������껹��ƽ�꣬
	�ж϶�Ӧ���·�����
	���ж�������������ܱ�400�����������ܱ�4����ȴ���ܱ�100������ 
*/
import java.util.Scanner;

class Lunar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ��������
		System.out.println("������һ�����");
		int year = scan.nextInt();
		System.out.println("������һ���·�");
		int month = scan.nextInt();
		// �ж�����
		String resultYear = "";
		if((year%400==0) || (year%4==0 && year%100 != 0)){
			resultYear = "����";
		}else{
			resultYear = "ƽ��";
		}
		int resultMonth = 0;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				resultMonth = 31;
				break;
			case 2:
				if(resultYear=="����"){
					resultMonth = 29;
				}else{
					resultMonth = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				resultMonth = 30;
				break;
		}
		// ����������
		System.out.println(year+"��"+resultYear);
		// ����µ�����
		System.out.println(month+"��"+resultMonth+"��");
	}
}