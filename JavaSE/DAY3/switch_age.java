/*
	11.根据年龄判断人的生命期：
	60岁以上---老年人；40~60岁---中年人；
	20~40岁---青年人；10~20岁---青少年；
	10岁以下---儿童，应用switch/case编程实现
*/
import java.util.Scanner;

class age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//-- 输入年龄
		System.out.print("输入年龄：");
		int age = scan.nextInt();
		//-- 为了减少case的数量，取得十位数，得到0,1,2,3,4,5,6,7,8,9~
		int temp = age / 10;
		String str = "";
		switch(temp) {
			case 0: 
				str = "儿童";
				break;
			case 1: 
				str = "青少年";
				break;
			//-- 两种情况结果一致，可以省略第一个，让它顺下
			case 2: 
			case 3: 
				str = "青年人";
				break;
			case 4: 
			case 5: 
				str = "中年人";
				break;
			case 6: 
			default: 
				str = "老年人";
				break;
		}
		System.out.println(age+"的生命期为"+str);
	}
}