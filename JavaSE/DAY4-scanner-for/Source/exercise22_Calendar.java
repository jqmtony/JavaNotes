import java.util.Scanner;

/* 
	22.	������(ʵ�ִӼ�������1900��֮���
	�����ĳ�ꡢĳ�£�������µ�����) 
	- ��������ݣ�>=1900��: 2015
	- �������·�[1-12]: 2
	�� 	һ 	�� 	�� 	�� 	�� 	��
	1 	2	3	4	5	6	7
	����
	����
*/

class Calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 
			1. ��Ҫ�����������������1900��1��~2019��1��
			2. ƥ����һ~����
			3. ƥ���·ݡ���ݡ��ж�����
		*/
		
		// 1900��1��1��~2018��12��31�գ���1990��~2018�������·ݶ����Բ�
		int total_days = 43100;
		int total_weeks = total_days / 7;
		/* 
			�ж����꣺��4������ ���ܱ�100����
			ƽ����365�죬������366��
			����һ�򣬰��겻���İ�������
		*/
		System.out.print("��������ݣ�>=1900����");
		int year = scan.nextInt();
		System.out.print("�������·ݣ�1~12����");
		int month = scan.nextInt();
		
		// �ж�����Ƿ�Ϊ����
		/* 
		for(int i=1;i<1020;i++) {
			if( year%4==0 && year%100!=0){
				System.out.println("��ݣ�\t"+year+"\t������");
			}else{
				System.out.println("��ݣ�\t"+year+"\t��������");
			}
		} */
		// ������
		for(i=1; i<= total_day) {
			
		}
		
		int year0 = 1900;
		if(year%4==0 && year%100!=0) {
			int total_day = 366;
			// switch case �ж����ĸ��µ�
			int which_day = (year-1900)
		} else {
			int total_day = 365;
		}

		// ���·�
		int total_week = 43100 / 7;
		int month_days = 0;
		switch(month) {
			// ����2��29�죬ƽ������28��
			case 2: 
				if( year%4==0 && year%100!=0){
					month_days = 29;
					System.out.println(year+"�����꣬�����ǣ�"+month_days);
				}else{
					month_days = 28;
					System.out.println(year+"�������꣬�����ǣ�"+month_days);
				}
				break;
			// ��31���7����
			case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: 
				month_days = 31;
				System.out.println("�������31��");
				break;
			// ��30���4����
			case 4:
			case 6: 
			case 9: 
			case 11: 
				System.out.println("�������30��");
				break;
			// �����ֵ����1~12�ķ�Χ��
			default:
				System.out.println("�����ڴ��·ݣ����������� ^_^");
				break;
		}
	}
}