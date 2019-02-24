import java.util.Random;
/**
 * 目标:  实现冒泡
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		
		//-- 0.提供Random
		Random random = new Random();
		//-- 1.提供一个长度为20的数组
		int[] array = new int[20];
		//-- 2.利用循环给数组中的元素进行赋值.
		for(int i = 0 ; i < array.length ; i ++) {
			array[i] = random.nextInt(30);
		}
		//-- 3.输出排序前的内容
		System.out.println("排序前:");
		for(int i : array) {
			System.out.print(i+"  ");
		}
		//-- 4.实现冒泡排序.按照从小到大排序.
		//-- 控制第几轮比较
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			//-- 控制第i轮第j次比较.即实际控制元素两两比较的地方
			//-- -1  是为了避免越级
			//-- -i 让下一轮扫比较一个元素
			for (int j = 0; j < array.length - 1 - i; j++) {
				System.out.println("\n第" + (i+1) + "轮第" + (j+1) +"次比较.比较的是:\t"+array[j]+"\t与\t" + array[j+1]);
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		
		
		
	}
}














