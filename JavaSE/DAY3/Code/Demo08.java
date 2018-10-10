import java.util.Scanner;
class Demo08 {
	public static void main(String[] args) {
		//在控制台输入一个年份，判断是否是闰年。	
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入年:\t");
		int year = scan.nextInt();
		//-- (四年一闰 && 百年不闰) || 四百年再闰
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println("闰年");
		}else{
			System.out.println("平年");
		}
	}
}