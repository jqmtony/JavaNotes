import java.util.Scanner;
class Ex06{
	public static void main(String[] args){
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个1-9的整数");
		int num = scan.nextInt();
		int copyNum = num;
		// sum = 0 + 3;
		sum += num;
		// num = 3 * 10 + 3
		num = num * 10 + num;
		// sum = 3 + 33;
		sum += num;
		// num = 33 * 10 + 3
		num = num * 10 + copyNum;
		sum += num;
		System.out.println("Sum:\t" + sum);
		
	}
}