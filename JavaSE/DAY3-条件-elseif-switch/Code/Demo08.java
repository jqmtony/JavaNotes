import java.util.Scanner;
class Demo08 {
	public static void main(String[] args) {
		//�ڿ���̨����һ����ݣ��ж��Ƿ������ꡣ	
		Scanner scan = new Scanner(System.in);
		System.out.print("��������:\t");
		int year = scan.nextInt();
		//-- (����һ�� && ���겻��) || �İ�������
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("����");
		}else{
			System.out.println("ƽ��");
		}
	}
}