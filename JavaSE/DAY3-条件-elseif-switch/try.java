import java.util.Scanner;
// import java.util.Random;
/*
3.输入三角形的三条边长，判断是否能够组成三角形，
如果能够组成，输出可以组成三角形，
否则输出不能组成三角形。

4.在控制台输入一个年份，判断是否是闰年。
（判断闰年的条件：能被400整除，
或者能被4整除却不能被100整除）

5.某用户出差，根据出差星期发放津贴
（如果不满一周算一周），每周的津贴是500元，
求该用户出差一次的津贴，出差天数由键盘输入。
*/
class Test{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// System.out.print("输入三角形的三条边长1：");
		// int a = scan.nextInt();
		// System.out.print("输入三角形的三条边长2：");
		// int b = scan.nextInt();
		// System.out.print("输入三角形的三条边长3：");
		// int c = scan.nextInt();
		
		// if((a^2+b^2)>(c^2)){
			// System.out.print("能组成");
		// }else{
			// System.out.print("不能组成");
		// }
		// int i = scan.nextInt();
		// int i = (int)(Math.random()*100+1);
		// System.out.print("数字："+i);
		System.out.print("输入一个年份：");
		int i = scan.nextInt();
		if(i % 400 == 0 || (i/4==0 && i%100 != 0)){
		// 4-1.if语句，如果a大于b，输出ab
			System.out.println(i+"是闰年");
		}else{
			// 4-2.else语句，如果不是，输出ba
			System.out.println(i+"不是闰年");
		}
		
		// System.out.print("输入出差的天数：");
		// int i = scan.nextInt(); //出差的天数
		// // 出差天数/7=出差的星期，不满一周的情况
		// // 每周的津贴为500
		// // 不满一周算一周，也就是说 i % 7 ！= 0，week = i/7 +1
		// // 津贴 = week * 500
		// if( i % 7 != 0){
			// int sum = (i / 7 + 1) * 500;
			// System.out.println("津贴为（不是整周）："+sum);
		// }else{
			// int sum = (i / 7) * 500;
			// System.out.println("津贴为（是整周）："+sum);
		// }
		
		
	}
}