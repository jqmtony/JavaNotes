/*
	2.	实现两个int类型变量值的交换，要求不使用中间变量
*/

import java.util.Scanner;

public class ex2_exchange0 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- 输入两个int类型值
		System.out.println("输入两个int类型值：");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("交换前：");
		System.out.println("num1="+num1+"\t num2="+num2);
		//-- 交换两个int值
		num1 = num1 + num2; // 4+6
		num2 = num1 - num2; // 4+6-6
		num1 = num1 - num2; // 4+6-4
		System.out.println("交换后：");
		System.out.println("num1="+num1+"\t num2="+num2);
	}
}