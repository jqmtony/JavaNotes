import java.util.Scanner;

// ��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����

public class Demo04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter:\t");
		//-- ��Ҫ�����ո�Ҫʹ��nextLine
		//-- next �����ո�س�.���Զ�����¼��
		String temp = scan.nextLine();
		//-- ���ַ���ת����ַ�����
		char[] chars = temp.toCharArray();
	
		//-- Ӣ����ĸ
		int abcCount = 0;
		//-- �ո�
		int spaceCount = 0;
		//-- ����
		int numCount = 0;
		//-- �����ַ�
		int otherCount = 0;
		
		
		//-- ������������
		for (int i = 0; i < chars.length; i++) {
			 //-- Character.isLetter()  �ж��Ƿ�����ĸ
			if (Character.isLetter(chars[i])) {
				abcCount ++;
			}else if(Character.isDigit(chars[i])) {
				//-- Character ��char��������������
				//-- �ж��ǲ�������
				numCount ++;
			}else if (Character.isWhitespace(chars[i])) {
				spaceCount ++;
			}else {
				otherCount ++;
			}
		}
		
		System.out.println("��ĸ����:\t" + abcCount);
		System.out.println("���ָ���:\t" + numCount);
		System.out.println("�ո����:\t" + spaceCount);
		System.out.println("��������:\t" + otherCount);
		// Ctrl + D ɾ��һ��
		// Ctrl + Alt + Down ����һ��
		
		scan.close();
	}
}











