import java.util.Arrays;

/*
 * 找出数组的最大值和最小值
 */
class trySort {
	public static void main(String[] args) {
		int[] arraySort = {7,3,4,9,3,2,6,10,16,12,4};
		System.out.println(Arrays.toString(arraySort));
		// 找出最大的值和最小的值
		// 可以直接采用api: Arrays.sort(array);
		int temp = 0;
		for(int i=0;i<=arraySort.length;i++) {
			for(int j=0; j<arraySort.length-1-i;j++) {
				if(arraySort[j]>arraySort[j+1]) { // 小的往前，大的往后
					temp = arraySort[j];
					arraySort[j] = arraySort[j+1];
					arraySort[j+1] = temp;
//					System.out.println(Arrays.toString(arraySort));
				}
			}
		}
		System.out.println("最小值：\t"+arraySort[0]);
		System.out.println("最大值：\t"+arraySort[arraySort.length-1]);
		
		// 查看是否有重复的数值，并输出位置
		System.out.println();
		
	}
}















