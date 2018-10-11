/*
	java.util是路径.对应到Window的文件夹就是有
	两层嵌套的文件夹
	文件夹java下有文件夹util
	
	Scanner.首字母大写.在整个Java中会首字母大写只有
	两种情况
	1.类名
		只要是首字母大写的一定是类名
	2.常量
		常量又类名不一样.常量需要全大写
		
	所以Scanner 是一个类的名字.一般情况下一个类就会是一个源文件
	即存在源文件Scanner.java
 */
import java.util.Scanner;

public class Ex01{
	public static void main(String[] args){
		/*
			声明了一个引用数据类型变量.该引用类型是
			Scanner类型. 变量名称是scan.并赋予初始值
			把等号右边整体看做一个值.
			该值是Scanner类型的.(类比原生的转换.比Scanner小的类型也可以)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("测试Scanner对原生数据类型的支持");
		
		System.out.println("接收整型");
		int i = scan.nextInt();
		System.out.println("接收字节");
		byte by = scan.nextByte();
		System.out.println("接收短整型");
		short s = scan.nextShort();
		System.out.println("接收长整型");
		long l = scan.nextLong();
		System.out.println("接收单精度浮点");
		float f = scan.nextFloat();
		System.out.println("接收双精度浮点");
		double d = scan.nextDouble();
		System.out.println("接收布尔值");
		boolean b = scan.nextBoolean();
		System.out.println("接收字符串");
		String str = scan.next();
		System.out.println("str:\t" +str);
		System.out.println("接收字符");
		
		//-- 通过charAt(index)来取index所对应的字符.
		char c = scan.next().charAt(0);	
		System.out.println("c:\t" + c);
		
		System.out.println("请输入该字符的十进制值");
		char c1 = (char)(scan.nextInt());
		System.out.println("c1:\t" + c1);
	}
}











