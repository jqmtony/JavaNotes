import java.util.Scanner;

/*
	1.	ʹ�������ṹ�Ӽ�������һ���·ݣ�
	��ӡ�����Ӧ�ļ��ڣ������ġ������
	��3��4��5��Ϊ������
	6��7��8��Ϊ�ļ���
	9��10��11��Ϊ�＾��
	12��1��2��Ϊ����
*/

//-- ��ifʵ��
class season1 {
	public static void main(String[] args) {
		// 1.����
		// 2.����Scanner
		Scanner scan = new Scanner(System.in);
		// 3.��ʾ������һ���·�
		System.out.print("������һ���·ݣ�1~12��:");
		int month = scan.nextInt();
		// 4.ʹ��if����жϼ���
		String str = "";
		if( month >= 3 && month <= 5) {
			str = "����";
		}else if( month >= 6 && month <= 8) {
			str = "�ļ�";
		}else if( month >= 9 && month <= 11) {
			str = "�＾";
		}else if( month == 12 || (month <= 2 && month >= 1)) {
			str = "����";
			// = �Ǹ�ֵ�� ==���ǹ�ϵ���㣬����õ��Ǹ�ֵ���ᱨ��int����ת��Ϊboolean
		}else{
			str = "�·ݲ�����Ŷ~ ���������� ^_^";
		}
		// 5.�����Ӧ����
		System.out.println(str);
	}
}

//-- ��switch/caseʵ��
class season2 {
	public static void main(String[] args) {
		// 1.����
		// 2.����Scanner
		Scanner scan = new Scanner(System.in);
		// 3.��ʾ������һ���·�
		System.out.print("������һ���·ݣ�1~12��:");
		int month = scan.nextInt();
		// 4.ʹ��switch/case����жϼ���
		String str = "";
		switch(month) {
			case 3: 
			case 4: 
			case 5:
				str = "����";
				break;
			case 6: 
			case 7: 
			case 8: 
				str = "�ļ�";
				break;
			case 9: 
			case 10: 
			case 11:  
				str = "�＾";
				break;
			case 12: 
			case 1: 
			case 2: 
				str = "����";
				break;
			default:
				str = "�·ݲ�����Ŷ~ ���������� ^_^";
				break;
		}
		// 5.�����Ӧ����
		System.out.println(str);
	}
	
}