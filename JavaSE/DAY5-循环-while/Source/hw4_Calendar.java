import java.util.Scanner;
import java.util.Date; beginDate;
import java.util.Date; endDate;
import java.text.SimpleDateFormat; format = new java.text.SimpleDateFormat("yyyy-MM");

/* �ȳ�����һ��� */

class calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. ������ݺ��·�
		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		System.out.println("�������·ݣ�");
		int month = scan.nextInt();
		
		// 2. ��ݺ��·ݶ�Ӧ��
		int lunar = 0;
		int month_days = 0;
		int past_days = 0;
		int count =0;
	
		int total_days = 0;
		String weekday = "";
		
		// 2.1 �ж��Ƿ�Ϊ����
		if(year%400==0 || year%100!=0 && year%4==0) {
			lunar = year;
		}
		  
        beginDate = format.parse("1900-01");
        endDate= format.parse("1900-03");    
        day=(endDate.getTime()-beginDate.getTime())/(24*60*60*1000);    
        System.out.println("���������="+day);   
		
		if(total_days%7==1) {
			weekday = "��һ";
		}else if(total_days%7==2) {
			weekday = "�ܶ�";
		}else if(total_days%7==3) {
			weekday = "����";
		}else if(total_days%7==4) {
			weekday = "����";
		}else if(total_days%7==5) {
			weekday = "����";
		}else if(total_days%7==6) {
			weekday = "����";
		}else if(total_days%7==0) {
			weekday = "����";
		}
		
		// 3. �������
		System.out.println("��ݣ�\t"+year+"�·ݣ�\t"+month+"������\t"+month_days);
		System.out.println(weekday);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}