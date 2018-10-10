/*
	输出每月有多少天
*/

import java.util.Scanner;

class switch1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入年：\t");
		int year = scan.nextInt();
		System.out.print("请输入月：\t");
		int month = scan.nextInt();
		//-- 对月份进行匹配
		// if(month == 1){
			
		// }else if(month
	// }
		
		//-- month就是要被匹配的变量，我们需要在大括号中列出所有可能值
		switch(month){
			// 每一种可能提供与之对应的case
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 9: break;
			case 10: break;
			case 11: break;
			case 12: break;
			// 代表上面所有的case都不满足
			default;
			break;
			
		}
}