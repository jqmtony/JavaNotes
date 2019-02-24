import java.util.Random;

/*
 * 
 * 统计数组中重复的元素.
 * 
 */
public class Demo01 {

	public static void main(String[] args) {
		//-- 1.创建Random
		Random random = new Random();
		//-- 2.提供容器
		int[] array = new int[50];
		//-- 3.给容器中填充元素 元素的取值10-50
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(41) + 10;
		}
		//-- 4.预览数组中的数据
		for (int i : array) {
			System.out.print(i+" ");
		
		}
		//-- 5.开始统计容器中重复的元素
		
		//-- 5.1创建一个新数组.数组的长度是取值范围.把上面的取值作为新数组的下标存在
		int[] newArray = new int[41];
		//-- 5.2循环遍历原数组
		for (int i : array) {
			//-- 取原数组中的值作为新数组的下标..下标所对应的空间保存出现的次数
			newArray[i - 10] = newArray[i - 10] + 1; 
		}
		//-- 5.3 打印新数组
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] != 0) {
				System.out.println("\n元素:\t" + (i+ 10) + "\t出现次数:\t" + newArray[i]);
			}
		}
		
	}
}











