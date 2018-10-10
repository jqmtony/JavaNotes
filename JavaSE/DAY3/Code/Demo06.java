import java.util.Scanner;
class Demo06{
	//	从键盘输入两个数，按照从小到大的顺序打印出来。
	public static void main(String[] args){
		//-- 1.导包
		//-- 2.创建Scanner变量
		Scanner scan = new Scanner(System.in);
		//-- 3.录入两个数
		System.out.print("请输入数字1:\t");
		int num1 = scan.nextInt();
		System.out.print("请输入数字2:\t");
		int num2 = scan.nextInt();
		//-- 4.利用条件结构判断两个数的大小.按照从小到大顺序打印
		//-- 4.1 利用双项if判断两种情况
		if(num1 < num2){
			System.out.println("较小的:\t" + num1 + "\t较大的:\t" + num2);
		}else{
			System.out.println("较小的:\t" + num2 + "\t较大的:\t" + num1);
			
		}
	}
	
}