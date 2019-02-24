/* 
	1.	现有一个电视商品竞猜活动
	活动规则：随机出现一个电视的价格（2000-10000之间），
	用户去竞猜价格，如果在5次内猜对价格，便可获得此商品。
	（超过5次，显示”很可惜，你没有获得奖品，竞猜结束。”，
	在5次内猜对的话，显示”恭喜你，获得了此奖品。”）。
	提示：
	产生2000-10000的随机数：
	1）	首先在开头导入Math 类
	Import java.util.Random;
	2）	生成随机数
	Random random=new Random();
	Int price= random.nextInt(8000)+2000;
 */
 
 import java.util.Scanner;
 import java.util.Random;
 
 class Guess {
	 public static void main(String[] args) {
		 // 1.设置随机价格
		 Random random = new Random();
		 int price = random.nextInt(8001)+2000;
		 System.out.println("电视商品竞猜价格为：\t"+price);
		 // 2.创建Scanner，输入数字竞猜
		 Scanner scan = new Scanner(System.in);
		 
		 // 3.5次竞猜机会
		 for(int i=1;i<6;i++) {
			System.out.print("请输入竞猜价格： \t");
			int guess = scan.nextInt();
			// 3-1. 猜对
			if(guess==price) {
				System.out.println("恭喜你，获得了此奖品。");
				break;
			}else{ // 3-2. 猜错
				if(i==5) {
					System.out.println("5次你都猜错咯 o(╥﹏╥)o");
				}else {
					System.out.println("不对哦，还剩余竞猜机会："+(5-i));
					// 5-i可以通过将for(条件)设置为（int-5;i<=1;i--）
					// 这样，剩余竞猜机会就直接是i，便于理解和代码
				}
			}
		 } 
		 System.out.println("竞猜结束。");
	 }
 }
 
 /* 
	2.	完成购买商品结算功能：
    1、循环输入商品编号和购物数量，计算消费金额并累加到总金额
    2、输入“n”开始结账（假设享8折）
	3、输入实付金额，计算找零
 */
 
 class shopping {
	 public static void main(String[] args) {
	 // 0. 创建Scanner
	 Scanner scan = new Scanner(System.in);
	 // 1. 创建商品编号 -> 使用for循环i取1~100，print"*"，i==49
	 // -> for输出选择购买的商品编号123,51~100，会自己继续输出print"*"
	 System.out.println("\n\n我行我素购物管理系统 > 购物结算\n\n\n\n");
	 System.out.println("*************************");
	 System.out.println("请选择购买的商品编号：\n");
	 System.out.println("1.T恤 \t\t 2.网球鞋\t\t 3.网球拍");
	 System.out.println("*************************\n\n");
	 // 2. 输入商品编号、购物数量
	 int price1, price2, price3 = 0;
	 int temp = 0;
	 int total = 0;
	 // 核心是输入y，次数不限制，for(;"y".equalsIgnoreCase(guess);)
	 String answer = "y";
	 for(;"y".equalsIgnoreCase(answer);) {
		System.out.print("请输入商品编号：");
		int clothe = scan.nextInt();
		System.out.print("请输入购买数量：");
		int number = scan.nextInt();
		switch(clothe) {
			case 1:
				int product1 = 245;
				price1 = number * product1;
				temp = price1;
				System.out.println("T恤 \t\t"+product1+"\t\t"+price1);
				break;
			case 2:
				int product2 = 570;
				price2 = number * product2;
				temp = price2;
				System.out.println("网球鞋 \t\t"+product2+"\t\t"+price2);
				break;
			case 3: 
				int product3 = 100;
				price3 = number * product3;
				temp = price3;
				System.out.println("网球拍 \t\t"+product3+"\t\t"+price3);
				break;
		}
		/* 
			累计总金额，因为不是每次只能选择一个商品，
			所以不能单独计算每类商品，合理的方式就是每次统计累加 
		*/
		total += temp;
		// 询问是否继续
		System.out.print("\n是否继续(y/n)：");
		answer = scan.next(); 
		/* 
		下方本来是规定输入n才能结束，
		但for的核心已经换做了y才继续，所以没必要 
		*/
		// 两个string比较大小，可以用函数：a.equalsIgnoreCase(忽略大小写A)或a.equals(b)
		// boolean bl = str.equals("n");
		// if(bl){ break;}
	 }
	 // 3. 计算消费金额：商品*数量 = 金额，结账：金额 = 金额 * 0.8
		System.out.println("\n\n折扣：0.8");
		System.out.println("金额总计：\t"+total*0.8);
		// 缴费金额的逻辑可以改为输入
		int amount = 900;
		System.out.println("实际交费：\t"+amount);
		System.out.println("找钱：\t\t"+(amount-total)+"\n");
	 }
 }
 
 /* 
		3.	有5家衣服专卖店，每家最多购买3件。
		用户可以选择离开，可以买衣服。
		最后打印总共买了几件衣服。
 */
 
 class StoreShop {
	 public static void main(String[] args) {
		 // 创建Scanner
		 Scanner scan = new Scanner(System.in);
		 int count = 0;
		 String answer = "";
		 // 最多5家店
		 for(int i=1;i<=5;i++) {
			 System.out.println("欢迎进入第"+i+"家店\n");
			 // 刚进店的时候就是进店，等进入买衣服j的循环后
			 answer = "n";
			 // 每家店，最多买3件衣服
			 for(int j=1;j<=3 && "n".equalsIgnoreCase(answer);j++) {
				 // 可以不买，所以可以买衣服的时候就可以选择走
				 System.out.print("是否要离开这家店？(y/n)");
				 answer = scan.next();
				 // 不离开就自动买一件衣服
				 if("n".equalsIgnoreCase(answer)) {
					 System.out.println("欢迎购在第"+i+"家店买第"+j+"一件衣服\n");
					 count++;
				 }
			 }
		 }
		 System.out.println("\n--------------------------------------");
		 System.out.println("你一共买了 "+count+" 件衣服 (*^▽^*)！");
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 