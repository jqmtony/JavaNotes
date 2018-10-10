/*
	4. 从键盘输入一个三位的正整数，分别打印出：
	百位：
	十位：
	个位：
	三个位的数字
*/

import java.util.Scanner;

public class hw4_printInt {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//-- 输入一个三位的正整数
		System.out.println("输入一个三位的正整数");
		int num = scan.nextInt();
		//-- 打印百位、十位、个位
		System.out.println("百位："+(num/100)); //220/100=2
		System.out.println("十位："+(num/10%10)); //220/10=22%10=2
		System.out.println("个位："+(num%10)); //222%10=2 
	}
}
