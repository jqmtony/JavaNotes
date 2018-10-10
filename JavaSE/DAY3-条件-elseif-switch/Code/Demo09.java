import java.util.Scanner;
class Demo09 {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("输入出差天数:\t");
		int day = scan.nextInt();
		int week = 0;
		if(day % 7 == 0){
			week = day / 7;
		}else{
			week = day / 7 + 1;
		}
		System.out.println("补贴:\t" + (week*500));
	}
}