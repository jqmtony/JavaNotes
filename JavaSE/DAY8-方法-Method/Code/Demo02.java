import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎使用DIY计算器");
		System.out.println("请输入第一个数");
		int num1 = scan.nextInt();
		System.out.println("请输入第二个数");
		int num2 = scan.nextInt();
		System.out.println("请选择要执行的运算:1.加法.2减法.3.乘法.4.除法");
		int operator = 0;
		while(true) {
			 operator = scan.nextInt();
			if (operator < 1 || operator > 4) {
				System.out.println("没有该预算");
				continue;
			}
			break;
		}
		
		double result = 0;
		switch (operator) {
		case 1:		
			//-- 等号左右两边数据类型必须匹配
			result = add(num1,num2);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
		System.out.println("运算结果:\t" +result);

	}	
	
	public static double add(int num1,int num2) {
		//-- 利用return 把数据返回给调用方法的地方
		return num1 + num2;
	}

	
	
	
	
	
	
	
	
	
}
