/*
	2. 从键盘输入两个整数保存到两个变量中，并把两个变量的值交换，
	并打印输出每个变量的值。格式如下：
	num1 = **
	num2 = **

*/
import java.util.Scanner;

public class hw2_exchange {
	public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	//-- 输入两个值
	System.out.println("输入第1个数字：");
	int num1 = num.nextInt();
	System.out.println("输入第2个数字：");
	int num2 = num.nextInt();
	System.out.println("你输入的两个值为："+num1+","+num2);
	//-- 交换两个变量的值
	num1 = num2;
	num2 = num1;
	System.out.println("交换过后两个值为："+num1+","+num2);
	}
}