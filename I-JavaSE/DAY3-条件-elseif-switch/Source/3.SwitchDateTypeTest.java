/*
	1.	测试switch能够接受的各种数据类型
	(把8种原生各测一遍.记录报的错误)

	switch可以接收的是整数(byte short int)
	或者字符串(String JDK1.7以上版本.)

	能接受的：
	byte
	short
	int
	char
	
	不能接受的：
	long
	float
	double
	boolean

 */
import java.util.Scanner;

public class test{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("输入当前测试的数据数据类型：");
		String info = scan.nextLine();
		// 定义数据类型，供后面测试
		byte b = 1;
		short s = 2;
		int i = 3;
		char c = 'a';
		// 会报错的
		long l = 4l; // long无法转换为int
		float f = 5.0f; // float无法转换为int
		double d = 6.0d; // double无法转换为int
		boolean bl = false; // boolean无法转换为int
		// switch条件语句测试报错
		String str = " ok ";
		switch(f){
			case 5.0f:
				str = "ok";
				break;
			default:
				str = "not ok";
				break;
		}
		// 输出
		System.out.println("switch结果："+str);
	}
}











