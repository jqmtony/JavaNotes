//��Ŀ�� �ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
//      С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ�������
//      ��ÿ���µ���������Ϊ���٣�
public class Demo05 {

	public static void main(String[] args) {
		//-- �޶�������
		System.out.println("��һ�������Ӷ���:\t" + 1);
		System.out.println("�ڶ��������Ӷ���:\t" + 1);
		
		int numX = 0, num1 = 1, num2 = 1 , month = 24;
		for (int i = 3; i <= month; i++) {
			numX = num2;
			num2 = num1 + num2;
			num1 = numX;
			System.out.println("��" + i + "�������Ӷ���:\t" + num2);
		}
	}
	
}
