//-- 目的就是告诉当前类.等下会使用一个名字叫做Scanner的类.
//-- 好让当前类(Demo15)知道到哪里去找这个Scanner.
import java.util.Scanner;
class Demo15{
	public static void main(String[] args){
		//System.in 是标准输入.即获取键盘录入的内容
		Scanner scan = new Scanner(System.in);
		//-- 声明一个变量.用于保存键盘录入的内容
		System.out.println("请输入数字1:");
		int num1 = scan.nextInt();
		System.out.println("请输入数字2:");
		int num2 = scan.nextInt();
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
	}
}