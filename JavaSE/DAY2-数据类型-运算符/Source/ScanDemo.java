import java.util.Scanner;

//-- һֱ��ʾû��scan�����.��ԭ����class������
//-- ����ΪScanner��������Ĺ����ظ������˱���Ϳ�����
class ScanDemo {
	public static void main(String[] args) {
		// System.in ��׼���룬����ȡ����¼�������
		Scanner scan = new Scanner(System.in);
		//-- ����һ�����������ڱ���¼������
		System.out.println("����������1��");
		int num1 = scan.nextInt();
		System.out.println("����������2��");
		int num2 = scan.nextInt();
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
	}
}