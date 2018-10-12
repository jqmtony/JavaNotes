import java.util.Scanner;

/* 
	22.	万年历(实现从键盘输入1900年之后的
	任意的某年、某月，输出该月的日历) 
	- 请输入年份（>=1900）: 2015
	- 请输入月份[1-12]: 2
	日 	一 	二 	三 	四 	五 	六
	1 	2	3	4	5	6	7
	……
	……
*/

class Calendar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 
			1. 需要计算的天数，假设是1900年1月~2019年1月
			2. 匹配周一~周日
			3. 匹配月份、年份、判断闰年
		*/
		
		// 1900年1月1日~2018年12月31日，即1990年~2018年所有月份都可以查
		int total_days = 43100;
		int total_weeks = total_days / 7;
		/* 
			判断闰年：被4整除， 不能被100整除
			平年有365天，闰年有366天
			四年一闰，百年不闰，四百年再闰
		*/
		System.out.print("请输入年份（>=1900）：");
		int year = scan.nextInt();
		System.out.print("请输入月份（1~12）：");
		int month = scan.nextInt();
		
		// 判断年份是否为闰年
		/* 
		for(int i=1;i<1020;i++) {
			if( year%4==0 && year%100!=0){
				System.out.println("年份：\t"+year+"\t是闰年");
			}else{
				System.out.println("年份：\t"+year+"\t不是闰年");
			}
		} */
		// 排周期
		for(i=1; i<= total_day) {
			
		}
		
		int year0 = 1900;
		if(year%4==0 && year%100!=0) {
			int total_day = 366;
			// switch case 判断是哪个月的
			int which_day = (year-1900)
		} else {
			int total_day = 365;
		}

		// 找月份
		int total_week = 43100 / 7;
		int month_days = 0;
		switch(month) {
			// 闰年2月29天，平年闰年28天
			case 2: 
				if( year%4==0 && year%100!=0){
					month_days = 29;
					System.out.println(year+"是闰年，天数是："+month_days);
				}else{
					month_days = 28;
					System.out.println(year+"不是闰年，天数是："+month_days);
				}
				break;
			// 有31天的7个月
			case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: 
				month_days = 31;
				System.out.println("这个月有31天");
				break;
			// 有30天的4个月
			case 4:
			case 6: 
			case 9: 
			case 11: 
				System.out.println("这个月有30天");
				break;
			// 输出的值不在1~12的范围里
			default:
				System.out.println("不存在此月份，请重新输入 ^_^");
				break;
		}
	}
}