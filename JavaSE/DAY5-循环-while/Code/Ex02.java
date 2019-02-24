import java.util.Scanner;
class Ex02{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("我行我素购物管理系统 > 购物结算");
		for(int i = 0 ;i < 100 ;i ++){
			System.out.print("*");
			if(i == 49){
				System.out.println("\n");
				System.out.println("\t\t请选择购买的商品编号:\t");
				System.out.println("\t1.T恤\t2.网球鞋\t3.网球拍");
				System.out.println("");
			}
		}
		
		/*
			String 类型比较相等使用的是equalsIgnoreCase()或者equals()
		 */
		String answer = "y";
		int goodsCount = 0;
		int goodsNum = 0;
		double totalGoods1 = 0;
		double totalGoods2 = 0;
		double totalGoods3 = 0;
		for(;"y".equalsIgnoreCase(answer);){
			System.out.print("\n请输入商品编号:\t");
			goodsNum = scan.nextInt();
			System.out.print("请输入购买数量:\t");
			goodsCount = scan.nextInt();
			switch(goodsNum){
				case 1:
					totalGoods1 += 245.0*goodsCount;
					System.out.println("T恤\t￥245.0\t￥" +(totalGoods1) );
					break;
				case 2:		
					totalGoods2 += 570.0*goodsCount;				
					System.out.println("网球鞋\t￥570.0\t￥" +(totalGoods2) );
					break;
				case 3:
					totalGoods3 += 452.0*goodsCount;
					System.out.println("网球拍\t￥452.0\t￥" +(totalGoods3) );
					break;				
				default:
					System.out.println("没有改商品");
					break;
			}
			System.out.print("是否继续(y/n)");
			answer = scan.next();
		}
		System.out.println("折扣:\t" + 0.8);
		double total  = totalGoods1 + totalGoods2 + totalGoods3;
		System.out.println("金额总计:￥\t" + total);
		System.out.println("金额总计(折扣后):￥\t" + (total*0.8));
		double realMoney = 0;
		for(;;){
			System.out.print("实际缴费:￥\t");
			realMoney = scan.nextDouble();
			//-- 判断给的钱够不够
			if(realMoney > total*0.8){
				break;
			}
			System.out.println("客官,钱不够哦!");
		}
		System.out.println("找钱:\t￥" + (realMoney - total*0.8));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}