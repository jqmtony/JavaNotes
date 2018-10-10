/*
	5. 实现从键盘输入一个三位整数，并逆序输出。
*/

import java.util.Scanner;

public class hw5_sequence {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- 输入一个三位的整数
		System.out.println("输入一个三位的整数");
		int num1 = scan.nextInt();
		//-- 逆序输出
		int a = num1/100; //百位
		int b = num1/10%10; //十位
		int c = num1%10; //个位
		int num2 = c*100 + b*10 + a; //逆序
		System.out.println(num2);
	}
}
