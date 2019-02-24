import java.util.Random;

public class Demo03 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(15) + 1;
		}
		for (int i : array) {
			System.out.print(i+" ");
		}
		
		//-- 取值范围是1-15 能够取到15.即下标得有15.所以长度就是16.
		int[] target = new int[16];
		//-- 循环1-15.
		for (int i = 0; i < target.length; i++) {
			//--取i的值和数组中的每一个元素进行比较
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					target[i] =  target[i] + 1;
				}
			}
		}
		
		System.out.println();
		for (int i = 0; i < target.length; i++) {
			System.out.println("元素:\t" + (i) + "\t出现次数:\t" + target[i]);
		}
	}
}
