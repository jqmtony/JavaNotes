import java.util.Scanner;

class Demo13{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("����������:\t");
		int age = scan.nextInt();
		int temp = age / 10;
		String str = "";
		switch(temp){
			case 0:
				str = "��ͯ";
				//-- �뿪switch�Ĵ�����.��������switch�ṹ.
				//-- ִ��swith����Ĵ���
				break;	
			case 1:
				str = "������";
				break;
			case 2:	
			case 3:
				str = "����";
				break;
			case 4:
			case 5:
				str = "����";
				break;
			case 6:
			default:
				str = "������";
				break;
		}
		System.out.println(age+"��������:\t" + str);
		
	}
}