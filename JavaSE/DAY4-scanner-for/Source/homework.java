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
		 int price = random.nextInt(8000)+2000;
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
				System.out.println("不对哦，还剩余竞猜机会："+(5-i));
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
	 // 1. 创建商品编号
	 System.out.println("");
	 System.out.println("我行我素购物管理系统 > 购物结算");
	 System.out.println("");
	 System.out.println("");
	 System.out.println("*************************");
	 System.out.println("请选择购买的商品编号：");
	 System.out.println("");
	 System.out.println("");
	 System.out.println("1.T恤 \t 2.网球鞋 \t 3.网球拍");
	 System.out.println("*************************");
	 System.out.println("");
	 // 2. 输入商品编号、购物数量
	 int price1 = 0;
	 int price2 = 0;
	 int price3 = 0;
	 for(int i=0;i<3;i++) {
		System.out.print("请输入商品编号：");
		int clothe = scan.nextInt();
		System.out.print("请输入购买数量：");
		int number = scan.nextInt();
		switch(clothe) {
			case 1:
				int product1 = 245;
				price1 = number * product1;
				System.out.println("T恤 \t"+product1+"\t"+price1);
				break;
			case 2:
				int product2 = 570;
				price2 = number * product2;
				System.out.println("网球鞋 \t"+product2+"\t"+price2);
				break;
			case 3: 
				int product3 = 100;
				price3 = number * product3;
				System.out.println("网球拍 \t"+product3+"\t"+price3);
				break;
		}
		// 询问是否继续
		System.out.println("");
		System.out.print("是否继续(y/n)：");
		String str = scan.next();
		switch(str){
			 case "n":
				System.out.println("这是一个n");
				break;
			default:
				System.out.println("这不是一个n");
				break;
		 }
	 }
	 // 3. 计算消费金额：商品*数量 = 金额
		System.out.println("");
		System.out.println("");
		System.out.println("折扣：0.8");
		int total = price1 + price2 + price3;
		System.out.println("金额总计：\t"+total);
		int amount = 900;
		System.out.println("实际交费：\t"+amount);
		System.out.println("找钱：\t"+(amount-total*0.8));
	 // 4. 不继续，结账：金额 = 金额 * 0.8
		 
	 }
 }
	
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 