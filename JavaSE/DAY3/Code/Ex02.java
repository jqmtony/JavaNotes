/*
	我们可以再JDK的目录下找到src.zip 源码的压缩文件包
	按照下面的路径我们可以找到Scanner这个文件.
	路径是: java文件夹下/util文件夹下的/Scanner.java 文件
	
	import 是一个关键字 keyword
	
 */
import java.util.Scanner;

class Ex02{
	/*
		千万不要死记硬背
	 */
	public static void main(String[] args){
		//-- 1.导包
		//-- 2.提供Scanner变量.(先记住写法后面再说第7章之后)
		Scanner scan = new Scanner(System.in);
		//-- 3.获取键盘录入并保存到两个变量中
		System.out.println("请输入数字1");
		int num1 = scan.nextInt();
		System.out.println("请输入数字2");
		int num2 = scan.nextInt();
		System.out.println("交换前:");
		System.out.println("Num1:" + num1);
		System.out.println("Num2:" + num2);
		//-- 4.变量交换
		/*
			num1:1
			num2:2
				
			目标:
			num1:2  3-1   
			num2:1	3-2
			
			num1+num2 = 3
			
		 */
		 num2 = num1 + num2;
		 num1 = num2 - num1;
		 num2 = num2 - num1;
		//-- 5.打印输出
		System.out.println("交换后:");
		System.out.println("Num1:" + num1);
		System.out.println("Num2:" + num2);
	}
}








