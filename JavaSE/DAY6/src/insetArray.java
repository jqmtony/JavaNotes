import java.util.Arrays;

/*
 * 2.	
 * 在一组有序数组中进行查找指定数及对应下标，
 * 再插入指定数保持有序，最后删除指定数。
 */
public class insetArray {
	public static void main(String[] args) {
		// 1.定义有序数组
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(array));
		// 2.创建指定数
		int num = 5;
		// 3.输出指定数的下标
		int index=0;
		for(int i: array) {
			if(i==num) {
				System.out.println("指定数的下标为："+index);
			}
			index++;
		}
		// 4.插入指定数，而不是取代
		array = Arrays.copyOf(array, array.length+1); // 先挪出来一个位置给指定数，也就是拓展一位 
		System.out.println(Arrays.toString(array)); // 输出的最后一个元素为0
		
		for(int i=0; i<array.length; i)
		
		// 5.保持数组有序
		// 6.删除指定数
	}
}
