/*
 * 随机产生50个10~50的整数，统计每个数字个出现几次
 * 出现0的数字不打印
 */

import java.util.Arrays;
import java.util.Random;

public class arrayStatic {
	public static void main(String[] args) {
		
		int num = 0; 
		Random random = new Random();
		int[] array = new int[50]; // 创建数列

		for(int i=0;i<array.length;i++) {
			num = random.nextInt(41)+10;
			array[i] = num;
		}
		System.out.println("原始排序"+Arrays.toString(array));
		// 分析:1. 排序 2.比较j和j+1,count++，由于是排序的所以不相等了break;就可以了
		int temp = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp; // 大的值往后排，小的值往前排
				}
			}
		}
		System.out.println("第二次排序（从小到大）："+Arrays.toString(array));
		// 统计出现的次数
		int count = 1;
		boolean isSame = false;
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]==array[i+1]) { // 如果前面一个值等于后面一个值
				count = count + 1;
				isSame = true;				
			}else {
				count = 1;
				isSame = false;
			}
			if(isSame) {
				System.out.println("值："+array[i]+" 的出现次数为："+count);
			}
		}
	}
}

















