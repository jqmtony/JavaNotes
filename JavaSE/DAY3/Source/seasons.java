import java.util.Scanner;

/*
	1.	使用条件结构从键盘输入一个月份，
	打印输出对应的季节（春、夏、秋、冬）
	即3、4、5月为春季，
	6、7、8月为夏季，
	9、10、11月为秋季，
	12、1、2月为冬季
*/

//-- 用if实现
class season1 {
	public static void main(String[] args) {
		// 1.导包
		// 2.创建Scanner
		Scanner scan = new Scanner(System.in);
		// 3.提示并输入一个月份
		System.out.print("请输入一个月份（1~12）:");
		int month = scan.nextInt();
		// 4.使用if语句判断季节
		String str = "";
		if( month >= 3 && month <= 5) {
			str = "春季";
		}else if( month >= 6 && month <= 8) {
			str = "夏季";
		}else if( month >= 9 && month <= 11) {
			str = "秋季";
		}else if( month == 12 || (month <= 2 && month >= 1)) {
			str = "冬季";
			// = 是赋值， ==才是关系运算，如果用的是赋值，会报错int不能转换为boolean
		}else{
			str = "月份不存在哦~ 请重新输入 ^_^";
		}
		// 5.输出对应季节
		System.out.println(str);
	}
}

//-- 用switch/case实现
class season2 {
	public static void main(String[] args) {
		// 1.导包
		// 2.创建Scanner
		Scanner scan = new Scanner(System.in);
		// 3.提示并输入一个月份
		System.out.print("请输入一个月份（1~12）:");
		int month = scan.nextInt();
		// 4.使用switch/case语句判断季节
		String str = "";
		switch(month) {
			case 3: 
			case 4: 
			case 5:
				str = "春季";
				break;
			case 6: 
			case 7: 
			case 8: 
				str = "夏季";
				break;
			case 9: 
			case 10: 
			case 11:  
				str = "秋季";
				break;
			case 12: 
			case 1: 
			case 2: 
				str = "冬季";
				break;
			default:
				str = "月份不存在哦~ 请重新输入 ^_^";
				break;
		}
		// 5.输出对应季节
		System.out.println(str);
	}
	
}