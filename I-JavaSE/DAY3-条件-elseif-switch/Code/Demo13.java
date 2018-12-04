import java.util.Scanner;

class Demo13{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年龄:\t");
		int age = scan.nextInt();
		int temp = age / 10;
		String str = "";
		switch(temp){
			case 0:
				str = "儿童";
				//-- 离开switch的大括号.脱离整个switch结构.
				//-- 执行swith下面的代码
				break;	
			case 1:
				str = "青少年";
				break;
			case 2:	
			case 3:
				str = "青年";
				break;
			case 4:
			case 5:
				str = "中年";
				break;
			case 6:
			default:
				str = "老年人";
				break;
		}
		System.out.println(age+"生命期是:\t" + str);
		
	}
}