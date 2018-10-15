import java.util.Scanner;

/* 先尝试做一年的 */

class calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1. 输入年份和月�?
		System.out.print("请输入年份：");
		int year = scan.nextInt();
		System.out.print("请输入月份：");
		int month = scan.nextInt();
		
		// 2.判断年是否是闰年
		boolean irRn;
		if(year%400==0 || (year%100!=0 && year%4==0)) {
			irRn = true;
		}else{
			irRn = false;
		}
		if(irRn) {
			System.out.println(year+"是闰�?);
		}else{
			System.out.println(year+"是平�?);
		}
		// 3.计算月对应的天数，if和switch都可�?
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
				System.out.println("输入有误�?);
				break;
		}
		System.out.println(year+"�?+month+"月的"+"天数为："+monthDays);
		
		// 4.输入的月份距�?900�?�?日的天数
		int total_days = 0;
		int weekday = 0;
		// 4-1.计算年的总天数，当年的天数算在月天数里面
		for(int i=1900;i<year;i++) {
			if(i%400==0 || (i%100!=0 && i%4==0)) {
				total_days+=366;
			}else{
				total_days+=365;
			}
		}
		// 4-2.计算月份所对应的天�?
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
					System.out.println("输入有误�?);
					break;
			}
			// 累加求和，这个地方重点理解记忆！！！
			if(i!=month) {
				total_days+=monthDays;
			}

			// 5.第一天是周几的公式：星期x = 1 + 天数�?% 7
			weekday = 1 + total_days % 7;
			if(weekday==7){
				// weekday的值为0，是周日，不需要\t空格
				weekday=0;
			}
		}
		
		// 6.格式化输出xx年x月日历（一�?个，�?换行�?
		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
		// 是周几就打印几个空格,i=0表示周日，成功换算出周几并在前面打印出空�?
		for(int i=0;i<weekday;i++){
			System.out.print("\t");
		}
		// 开始输出每月从1~31的日�?
		for(int i=1; i<monthDays; i++) {
			System.out.print(i+"\t");
			
			// 难点2：weekday+i，比如是1号是周一，那�?+1除以7�?�?号是周日，即0+7=7/7�?，换�?
			if((weekday+i)%7== 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		
	}
}
	
	