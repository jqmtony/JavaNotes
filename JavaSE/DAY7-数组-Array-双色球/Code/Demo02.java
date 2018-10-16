import java.util.Random;

public class Demo02 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(15) + 1;
		}
		for (int i : array) {
			System.out.print(i+" ");
		}
		/*
		 * 最笨的方法.取每一个数和后面的元素一次比较.比较完成后记录重复的次数
		 */
		
		int[] target = new int[20];
		boolean[] record = new boolean[20];
		
		//-- 取数组中的每一个元素
		for (int i = 0; i < array.length; i++) {
			// -- 和数组中的每一个元素进行比较
			for (int j = 0; j < target.length; j++) {
				if (array[i] == array[j] && record[array[i]] == false) {
					target[i] = target[i] + 1;
				}
			}
			//-- 当内层循环走完.即array[i]这个元素已经统计过次数了.
			//-- 修改标志.那再次遇到时不会再统计该元素的次数
			record[array[i]] = true;
		}
		
		System.out.println();
		int sum = 0;
		for (int i = 0; i < target.length; i++) {
			System.out.println("元素:\t" + array[i] + "\t次数:\t" + target[i]);
			sum += target[i];
		}
		
		System.out.println("sum:\t" + sum);
	
	}
}
