import java.util.Scanner;
/*
	输出每月有多少天
 */
class Demo12{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入年:\t");
		int year = scan.nextInt();
		System.out.print("请输入月:\t");
		int month = scan.nextInt();
		//-- 对月份进行匹配
		/*
		if(month ==1){
			
		}else if(month == 2){
			
		}
		*/
		
		/*
			代表month就是要被匹配的变量
			我们需要在大括号内列出所有的可能值
		 */
		switch(month){
			//-- 每一种取值可能提供与之对应的一个case
			case 1:
				System.out.println(month+"月有31天");
				break;
			case 2:
				//-- .1判断是闰年还是平年
				if(year % 4==0 && year % 100 != 0 || year % 400 ==0){
					System.out.println(month+"月有29天");
				}else{
					System.out.println(month+"月有28天");
				}
				break;
			case 3:
				System.out.println(month+"月有31天");
				break;
			case 4:
				System.out.println(month+"月有30天");
				break;
			case 5:
				System.out.println(month+"月有31天");
				break;
			case 6:
				System.out.println(month+"月有30天");
				break;
			case 7:
				System.out.println(month+"月有31天");
				break;
			case 8:
				System.out.println(month+"月有31天");
				break;
			case 9:
				System.out.println(month+"月有30天");
				break;
			case 10:
				System.out.println(month+"月有31天");
				break;
			case 11:
				System.out.println(month+"月有30天");
				break;
			case 12:
				System.out.println(month+"月有31天");
				break;
			//-- 代表上面所有的case都不满足
			default:
				System.out.println("地球上没这个月!");
				break;
		}
	}
}