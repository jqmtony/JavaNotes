import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		//-- ˼·:
		//-- ���ò�ͬ�ķ�����ӡ��ͬ��������
		//-- ��Ҫһ��ʲô���ķ���:������������ʾ������.
		//-- ʲôʱ����Ҫ����,ʲôʱ����Ҫ����ֵ.
		//-- ��������ִ������Ҫ������.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year:\t");
		int year = scan.nextInt();
		if (judegeYear(year)) {
			System.out.println("������");
		}else {
			System.out.println("��ƽ��");
		}
	}
	//-- ����add����ʱ��Ҫ�ṩ����int���͵Ĳ���.�вη���
	/*
	 * @return int �Ƿ���ֵ����.������ִ�н�����᷵��һ��int���͵�����
	 */
	public static int add(int num1,int num2) {
		return 0;
	}
	
	//-- ������޲�
	public static void showMessage() {
		System.out.println("HelloWorld!");
	}

	//-- �����в���
	public static void showMessage(String msg) {
		System.out.println(msg);
	}
	
	
	/**
	 * Ŀ��:ϣ����һ��������������Ƿ�Ϊ����
	 *
	 * @param year ��Ҫ���жϵ���
	 * @return boolean ���������껹�ǲ�������
	 */
	public static boolean judegeYear(int year) {
		//-- �в���ʱ,�ǵ�һ��Ҫ�Բ��������
		if (year < 0) {
			System.out.println("��������ȷ");
			return false;
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}
}
