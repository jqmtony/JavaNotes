import java.util.Arrays;

public class Demo07 {
	public static void main(String[] args) {
		//-- 逗号的作用就是分隔符 在C语言中是承认分隔符作为运算符存在的.
		int[] array = {7,3,4,9,3,2,6,10,16,12,4};
		
		//-- 求最大值和最小值.
		
		Arrays.sort(array);
		
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("最小值:\t" + array[0]);
		System.out.println("最大值:\t" + array[array.length]);
	}
}
