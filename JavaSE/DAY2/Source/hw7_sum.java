/*
	7. 从键盘输入一个一位的正整数a（1~9），
	求a+aa+aaa的和打印输出。
	(如a为3，则求3+33+333的和)
	
*/

import java.util.Scanner;

public class hw7_sum {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- 输入一个一位的正整数a（1~9）
		System.out.println("输入一个一位的正整数a（1~9）:");
		int num1 = scan.nextInt();
		//-- a+aa+aaa的和
		int a = num1;
		int aa = a*10 + a; 
		int aaa = a*100 + aa;
		int sum = a + aa + aaa;
		System.out.println(a+"+"+aa+"+"+aaa+"="+"="+sum);
	}
}
