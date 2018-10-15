import java.util.Arrays;
import java.util.Scanner;

public class ifrepeat {

	public static void main(String[] args) {
		//-- 1.提供数组(容器来保存数列)
		int[] array = {8,4,2,1,23,344,12,12,12,344,2,4,8};
		
		//-- 2.循环打印数列中的元素
		//-- 从数据源 array 中取 int 类型的元素保存到i里面去.
		
		System.out.println(Arrays.toString(array));
		
		/*
		 * 1.	针对课堂练习Demo08.java.补充一道题.判断数组中是否重复元素.
		 * 如果有重复的位置.(把一个相同元素的所有出现位置(下标)列出来)
		 */
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array.length-1;j++) {
				if(array[i]==array[j]) {
					if(i!=j) {
//						System.out.println("----------------------------");
						System.out.println("值："+array[j]+"\t 分别出现在下标为"+i+"和"+j+"处");
					}
				}
			}
		}
	}
}