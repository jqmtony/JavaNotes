import java.util.Scanner;
class Demo06{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:\t");
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 0 ;i <= num ; i ++){
			sum += num;
		}
		System.out.println("Sum:\t" + sum);
	}
}