import java.util.Random;
import java.util.Scanner;
class Ex01{
	public static void main(String[] args){
		/*
			1.随机数能够产生一个商品的价格
				Math.random
				Random
			2.能重复5次
			3.可以判断价格是否匹配
		 */
		Random random = new Random(1);
		int target = random.nextInt(8001)+2000;
		System.out.println("生成随机价格:\t" + target);
		
		for(int i = 5 ;i >= 1 ; i --){
			Scanner scan = new Scanner(System.in);
			System.out.print("请输入一个价格:\t");
			int userInput = scan.nextInt();
			
			if(target == userInput){
				System.out.println("恭喜你猜对了");
				//-- 使用break离开for循环
				//-- break只可以出离它最近的一个for
				//-- 加break的目的:终止循环
				//-- 改变循环条件让条件不成立就可以终止循环.
				break;
				//i = 0;
			}else if(target < userInput){
				System.out.println("再小一点");
			}else{
				System.out.println("再大一点");
				//System.out.println("还剩余" + (i - 1) + "次");
			}
			/*
				i 5  4
				i 4  3
				i 3  2
				i 2  1
				i 1  0
			 */
			System.out.println("还剩余" + (i - 1) + "次");
			
		} 
	}
}