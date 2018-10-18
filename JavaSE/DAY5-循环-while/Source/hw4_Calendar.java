import java.util.Scanner;

/* �ȳ�����һ��� */

class calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1. ������ݺ��·�
		System.out.print("��������ݣ�");
		int year = scan.nextInt();
		System.out.print("�������·ݣ�");
		int month = scan.nextInt();
		
		// 2.�ж����Ƿ�������
		boolean irRn;
		if(year%400==0 || (year%100!=0 && year%4==0)) {
			irRn = true;
		}else{
			irRn = false;
		}
		if(irRn) {
			System.out.println(year+"�����);
		}else{
			System.out.println(year+"��ƽ��);
		}
		// 3.�����¶�Ӧ��������if��switch���ɷ�
		int monthDays =0;
		switch(month) {
			case 2:
				if(irRn==true) {
					monthDays=29;
				}else{
					monthDays=28;
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				monthDays=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				monthDays=30;
				break;
			default:
				System.out.println("���������);
				break;
		}
		System.out.println(year+"��+month+"�µ�"+"����Ϊ��"+monthDays);
		
		// 4.������·ݾ�1900-1-1������
		int total_days = 0;
		int weekday = 0;
		// 4-1.��������������������������������������
		for(int i=1900;i<year;i++) {
			if(i%400==0 || (i%100!=0 && i%4==0)) {
				total_days+=366;
			}else{
				total_days+=365;
			}
		}
		// 4-2.�����·�����Ӧ���씼
		for(int i=1; i<month;i++) {
			switch(i) {
				case 2:
					if(irRn==true) {
						monthDays=29;
					}else{
						monthDays=28;
					}
					break;
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					monthDays=31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					monthDays=30;
					break;
				default:
					System.out.println("���������);
					break;
			}
			// �ۼ���ͣ�����ط��ص������䣡����
			if(i!=month) {
				total_days+=monthDays;
			}

			// 5.��һ�����ܼ��Ĺ�ʽ������x = 1 + ������% 7
			weekday = 1 + total_days % 7;
			if(weekday==7){
				// weekday��ֵΪ0�������գ�����Ҫ\t�ո�
				weekday=0;
			}
		}
		
		// 6.��ʽ�����xx��x��������һ�Ƹ����M���У�
		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������\t");
		// ���ܼ��ʹ�ӡ�����ո�,i=0��ʾ���գ��ɹ�������ܼ�����ǰ���ӡ���Ֆ�
		for(int i=0;i<weekday;i++){
			System.out.print("\t");
		}
		// ��ʼ���ÿ�´�1~31���Ֆc
		for(int i=1; i<monthDays; i++) {
			System.out.print(i+"\t");
			
			// �ѵ�2��weekday+i��������1������һ���ǁv+1����7ʹ�ߺ������գ���0+7=7/7ʹ������
			if((weekday+i)%7== 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		
	}
}
	
	