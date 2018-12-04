import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		//-- 思路:
		//-- 调用不同的方法打印不同的三角形
		//-- 需要一个什么样的方法:根据行数来显示三角形.
		//-- 什么时候需要参数,什么时候需要返回值.
		//-- 当方法的执行所需要的数据.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year:\t");
		int year = scan.nextInt();
		if (judegeYear(year)) {
			System.out.println("是闰年");
		}else {
			System.out.println("是平年");
		}
	}
	//-- 调用add方法时需要提供两个int类型的参数.有参方法
	/*
	 * @return int 是返回值类型.即方法执行结束后会返回一个int类型的数据
	 */
	public static int add(int num1,int num2) {
		return 0;
	}
	
	//-- 这就是无参
	public static void showMessage() {
		System.out.println("HelloWorld!");
	}

	//-- 这是有参数
	public static void showMessage(String msg) {
		System.out.println(msg);
	}
	
	
	/**
	 * 目的:希望有一个方法可以年份是否为闰年
	 *
	 * @param year 需要被判断的年
	 * @return boolean 代表是闰年还是不是闰年
	 */
	public static boolean judegeYear(int year) {
		//-- 有参数时,记得一定要对参数做检查
		if (year < 0) {
			System.out.println("参数不正确");
			return false;
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}
}
