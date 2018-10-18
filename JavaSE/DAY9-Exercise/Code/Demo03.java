import java.util.Scanner;

// 万年历
//-- 基姆拉尔森计算公式

public class Demo03 {

	public static void main(String[] args) {
		//-- 1.提供Scanner
		Scanner scan = new Scanner(System.in);
		//-- 2.获取年月
		System.out.println("输入年");
		int year = scan.nextInt();
		System.out.println("输入月");
		int month = scan.nextInt();
		//-- 3.提供变量用户汇总天数
		int sum = 0;
		//-- 3.1 数显汇总年(1900-输入年)
		for (int i = 1900 ; i < year; i++) {
			if (judegeYear(i)) {
				sum += 366;
			}else {
				sum += 365;
			}
		}
		//-- 3.2 其次汇总月(输入年1月到输入月-1月的最后一天)
		for (int i = 1; i < month; i++) {
			if (i == 2) {
				if (judegeYear(year)) {
					sum += 29;
				}else {
					sum += 28;
				}
			}else if(i == 4 || i == 6 || i == 9 || i == 11) {
				sum += 30;
			}else {
				sum += 31;
			}
		}
		
		System.out.println("总天数:\t" + sum);
		
		sum = sum + 1;
		//-- 余数是多少就是星期几.
		int weekDay = sum % 7;
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for (int i = 1; i <= weekDay; i++) {
			System.out.print("\t");
		}
		//-- 提供变量temp 用于显示当前月的总天数
		int temp = 0;
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			temp = 30;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			temp = 31;
		}
		if (month == 2) {
			if(judegeYear(year)) {
				temp = 29;
			}else {
				temp = 28;
			}
		}
		
		//-- 循环打印当月的日历
		for (int i = 1; i <= temp ; i++) {
			if (sum % 7 == 6) {
				System.out.print(i+"\n");
			}else {
				System.out.print(i+"\t");
			}
			sum += 1;
		}	
		
		//-- 关闭
		scan.close();
		
	}
	
	public static boolean judegeYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
}
