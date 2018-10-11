import java.util.Scanner;

/* 16.	用户登录验证。验证次数最多3次  */

class login {
	public static void main(String[] args) {
		// 登陆验证
		String str1 = "Jim";
		int int1 = 12345;
		for(int i=1;i<4;i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("请输入用户名：");
			String name = scan.nextLine();
			boolean bl1 = name.equals("Jim");
			// int name = scan.nextInt();
			System.out.print("请输入密码：");
			int password = scan.nextInt();
			// 用户名和密码同时正确才能登陆
			if(bl1 && password==123456) {
				System.out.println("欢迎登陆NyShopping系统！");
				break;
			}else {
				System.out.println("输入错误！您还有"+(3-i)+"一次机会");
			}
			if(i==3){
				System.out.println("对不起，您3次均输入错误！");
			}
		}
	}
}