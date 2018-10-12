import java.util.Scanner;
import java.util.Date; beginDate;
import java.util.Date; endDate;
import java.text.SimpleDateFormat; format = new java.text.SimpleDateFormat("yyyy-MM");

/* 先尝试做一年的 */

class calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 输入年份和月份
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		
		// 2. 年份和月份对应表
		int lunar = 0;
		int month_days = 0;
		int past_days = 0;
		int count =0;
	
		int total_days = 0;
		String weekday = "";
		
		// 2.1 判断是否为闰年
		if(year%400==0 || year%100!=0 && year%4==0) {
			lunar = year;
		}
		  
        beginDate = format.parse("1900-01");
        endDate= format.parse("1900-03");    
        day=(endDate.getTime()-beginDate.getTime())/(24*60*60*1000);    
        System.out.println("相隔的天数="+day);   
		
		if(total_days%7==1) {
			weekday = "周一";
		}else if(total_days%7==2) {
			weekday = "周二";
		}else if(total_days%7==3) {
			weekday = "周三";
		}else if(total_days%7==4) {
			weekday = "周四";
		}else if(total_days%7==5) {
			weekday = "周五";
		}else if(total_days%7==6) {
			weekday = "周六";
		}else if(total_days%7==0) {
			weekday = "周日";
		}
		
		// 3. 输出日历
		System.out.println("年份：\t"+year+"月份：\t"+month+"天数：\t"+month_days);
		System.out.println(weekday);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}