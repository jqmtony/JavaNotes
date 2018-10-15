import java.util.Arrays;
import java.util.Scanner;

public class arraySum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arraySum = {8,4,2,1,23,344,12};
		int sum = 0;
		boolean result = false;
		
		// 循环输出，推荐使用for-each
//		for(int i=0;i<arraySum.length;i++) {
//			sum = sum + arraySum[i];
//		}
		for(int i: arraySum) { // 一定要注意i是元素，不是下标！
			sum += i;
		}
		System.out.println("和：\t"+sum);
		
		// 猜数游戏
		System.out.print("请任意输入一个数据：");
		int guess = scan.nextInt();
		int index = 0;
		for(int i: arraySum) {
			if(guess==i) {
				System.out.println("包含此元素，下标为：\t"+index);
				break;
//				continue; // 跳过当前循环，所以根本不会出现包含的情况了 ，相当于没有写
			}index ++;
		}
	}
}
