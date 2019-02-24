/* 首字母大写的一定是类名，常量也会，但常量是全部大写 */

import java.util.Scanner;

public class ScannerInType{
	public static void main(String[] args){
		/* 
			声明了一个引用数据类型变量，该引用类型是Scanner类型，
			变量名称是scan，并赋予初始值：new.Scanner(System.in)；
			类比原生的转换，比Scanner小的类型也可以
		*/
		Scanner scan = new Scanner(System.in);
		// int i = 0;
		// byte b = 0;
		// 把 byte赋值给int是小给大，自动转换
		// i = b; 
		
		// 测试Scanner可以接受的数据类型
		System.out.println("测试Scanner对原生数据类型的支持：");
		
		System.out.println("接受整型");
		int i = scan.nextInt();
		System.out.println("接受字节");
		byte b = scan.nextByte();
		System.out.println("接受短整型");
		short s = scan.nextShort();
		System.out.println("接受长整型");
		long l = scan.nextLong();
		System.out.println("接受单精度浮点");
		float f = scan.nextFloat();
		System.out.println("接受双精度浮点");
		double db = scan.nextDouble();
		System.out.println("接受布尔值");
		boolean bl = scan.nextBoolean();
		System.out.println("接受字符串");
		String str = scan.nextLine();
		System.out.println("接受字符");
		//-- 不支持printchar，所以获取第一个元素
		char c = scan.next().charAt(0);
		System.out.println("c:"+c);
		
	}
}