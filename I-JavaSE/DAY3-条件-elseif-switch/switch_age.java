/*
	11.���������ж��˵������ڣ�
	60������---�����ˣ�40~60��---�����ˣ�
	20~40��---�����ˣ�10~20��---�����ꣻ
	10������---��ͯ��Ӧ��switch/case���ʵ��
*/
import java.util.Scanner;

class age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//-- ��������
		System.out.print("�������䣺");
		int age = scan.nextInt();
		//-- Ϊ�˼���case��������ȡ��ʮλ�����õ�0,1,2,3,4,5,6,7,8,9~
		int temp = age / 10;
		String str = "";
		switch(temp) {
			case 0: 
				str = "��ͯ";
				break;
			case 1: 
				str = "������";
				break;
			//-- ����������һ�£�����ʡ�Ե�һ��������˳��
			case 2: 
			case 3: 
				str = "������";
				break;
			case 4: 
			case 5: 
				str = "������";
				break;
			case 6: 
			default: 
				str = "������";
				break;
		}
		System.out.println(age+"��������Ϊ"+str);
	}
}