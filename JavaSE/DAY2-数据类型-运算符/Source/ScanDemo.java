import java.util.Scanner;

//-- 一直提示没有scan后面的.，原因是class的名字
//-- 定义为Scanner，与引入的功能重复，改了标题就可以了
class ScanDemo {
	public static void main(String[] args) {
		// System.in 标准输入，即获取键盘录入的内容
		Scanner scan = new Scanner(System.in);
		//-- 声明一个变量，用于保存录入内容
		System.out.println("请输入数字1：");
		int num1 = scan.nextInt();
		System.out.println("请输入数字2：");
		int num2 = scan.nextInt();
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
	}
}