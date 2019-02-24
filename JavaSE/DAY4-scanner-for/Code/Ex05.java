import java.util.Scanner;
class Ex05 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num1 = 0 ,num2 = 0 ,num3 =0;
		System.out.println("请输入一个整数:\t");
		num1 = scan.nextInt();
		System.out.println("请输入一个整数:\t");
		num2 = scan.nextInt();
		System.out.println("请输入一个整数:\t");
		num3 = scan.nextInt();
		
		int temp = 0;
		if(num1 < num2){
			temp= num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2 < num3){
			temp= num3;
			num3 = num2;
			num2 = temp;
		}
		if(num1 < num2){
			temp= num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1 +"\t" + num2 + "\t" + num3);
	}
}