import java.util.Scanner;
class Ex04{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入一个月份");
		int i = scan.nextInt();
		/*
			检查录入的月份是否正确.不可以小于0,也不可以大于12
		 */
		if(i <= 0 || i > 12){
			System.out.println("月份不对");
			//-- 通过return来开入口函数
			return ;
		}
		
		String str = "";
		//-- 判断属于什么季节
		if(i <= 3){
			str = "春节";
		}else if(i <= 6){
			str = "夏季";
		}else if(i <= 9){
			str = "秋季";
		}else{
			str = "冬季";
		}
		System.out.println(str);
		
		
		/*
			Swtich擅长等值匹配
			如果是区间匹配if比较擅长
		 */
		switch(i){
			case 1:
			case 2:
			case 3:
				str = "春季"
				break;
			case 4:
			case 5:
			case 6:
				str = "夏季"
				break;
			case 7:
			case 8:
			case 9:
				str = "秋季"
				break;
			case 10:
			case 11:
			case 12:
				str = "冬季"
				break;
			default:
				break;
		}
		
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}