
import java.util.Scanner;

public class ex1_grade {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- ����ɼ�
		System.out.println("��������ѧ�ɼ���");
		int math = scan.nextInt();
		System.out.println("���������ĳɼ���");
		int chinese = scan.nextInt();
		System.out.println("������Ӣ��ɼ���");
		int english = scan.nextInt();
		//-- �ֺܷ�ƽ����
		int sum = math + chinese + english;
		int ave = sum / 3;
		System.out.println("�ܷ֣�"+sum+"\tƽ���֣�"+ave);
	}
}
