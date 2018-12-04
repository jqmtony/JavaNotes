/* 
	3.	实现从键盘输入年、月，
	判断该年是闰年还是平年，
	判断对应的月份天数
	（判断闰年的条件：能被400整除，或者能被4整除却不能被100整除） 
*/
import java.util.Scanner;

class Lunar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 输入年月
		System.out.println("请输入一个年份");
		int year = scan.nextInt();
		System.out.println("请输入一个月份");
		int month = scan.nextInt();
		// 判断年月
		String resultYear = "";
		if((year%400==0) || (year%4==0 && year%100 != 0)){
			resultYear = "闰年";
		}else{
			resultYear = "平年";
		}
		int resultMonth = 0;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				resultMonth = 31;
				break;
			case 2:
				if(resultYear=="闰年"){
					resultMonth = 29;
				}else{
					resultMonth = 28;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				resultMonth = 30;
				break;
		}
		// 输出年的类型
		System.out.println(year+"是"+resultYear);
		// 输出月的天数
		System.out.println(month+"有"+resultMonth+"天");
	}
}