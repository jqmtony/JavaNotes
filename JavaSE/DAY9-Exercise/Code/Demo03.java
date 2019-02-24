import java.util.Scanner;

// ������
//-- ��ķ����ɭ���㹫ʽ

public class Demo03 {

	public static void main(String[] args) {
		//-- 1.�ṩScanner
		Scanner scan = new Scanner(System.in);
		//-- 2.��ȡ����
		System.out.println("������");
		int year = scan.nextInt();
		System.out.println("������");
		int month = scan.nextInt();
		//-- 3.�ṩ�����û���������
		int sum = 0;
		//-- 3.1 ���Ի�����(1900-������)
		for (int i = 1900 ; i < year; i++) {
			if (judegeYear(i)) {
				sum += 366;
			}else {
				sum += 365;
			}
		}
		//-- 3.2 ��λ�����(������1�µ�������-1�µ����һ��)
		for (int i = 1; i < month; i++) {
			if (i == 2) {
				if (judegeYear(year)) {
					sum += 29;
				}else {
					sum += 28;
				}
			}else if(i == 4 || i == 6 || i == 9 || i == 11) {
				sum += 30;
			}else {
				sum += 31;
			}
		}
		
		System.out.println("������:\t" + sum);
		
		sum = sum + 1;
		//-- �����Ƕ��پ������ڼ�.
		int weekDay = sum % 7;
		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		for (int i = 1; i <= weekDay; i++) {
			System.out.print("\t");
		}
		//-- �ṩ����temp ������ʾ��ǰ�µ�������
		int temp = 0;
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			temp = 30;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			temp = 31;
		}
		if (month == 2) {
			if(judegeYear(year)) {
				temp = 29;
			}else {
				temp = 28;
			}
		}
		
		//-- ѭ����ӡ���µ�����
		for (int i = 1; i <= temp ; i++) {
			if (sum % 7 == 6) {
				System.out.print(i+"\n");
			}else {
				System.out.print(i+"\t");
			}
			sum += 1;
		}	
		
		//-- �ر�
		scan.close();
		
	}
	
	public static boolean judegeYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
}
