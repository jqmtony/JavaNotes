/*
	6. 某个公司采用公用电话传递数据，
	数据是四位的整数，在传递过程中是加密的，
	加密规则如下：每位数字都加上5,然后除以10的余数代替该数字，
	再将第一位和第四位交换，第二位和第三位交换。
	输入四位号码，求加密后的号码为多少？
*/


import java.util.Scanner;

public class hw6_secret {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- 输入一个四位号码
		System.out.println("输入一个四位号码");
		int num1 = scan.nextInt();
		//-- 每位数字都加上5
		int a1 = num1/1000+5; //千位
		int b1 = num1/100%10+5; //百位 1450/100=14%10=4
		int c1 = num1/10%10+5; //十位 1450/10=145%10=5
		int d1 = num1%10+5; //个位 1455%10=5
		System.out.println("每位数字加5后："+a1+","+b1+","+c1+","+d1);
		//-- 除以10的余数代替该数字
		int a2 = a1 % 10;
		int b2 = b1 % 10;
		int c2 = c1 % 10;
		int d2 = d1 % 10;
		System.out.println("除以10的余数："+a2+","+b2+","+c2+","+d2);
		//-- 将第一位和第四位交换，第二位和第三位交换
		int num2 = d2*1000 + c2*100 + b2*10 + a2;
		//-- 输出加密后的数据，顺序：d2-c2-b2-a2
		System.out.println("你输入的数字为："+num1);
		System.out.println("加密后的数字为："+num2);
	}
}
