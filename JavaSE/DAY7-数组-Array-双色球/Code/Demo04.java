import java.util.Arrays;
import java.util.Scanner;

/*
  * 对数组中的元素进行增删改查
 */
public class Demo04 {

	public static void main(String[] args) {
		
		String[] array = {"A","B","C","D","E"};
		
		//-- 1.顺序添加元素.自然添加在末尾
		
		//-- 1.1 扩容处理.改变数组的大小
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = "F";
		for (String str : array) {
			System.out.println(str);
		}
		
		//-- 2.中间插入添加. 比如想把Z放到B和C的中间.
		array = Arrays.copyOf(array, array.length + 1);
		//-- array.length = 7
		for (int i = array.length - 1; i > 0 ; i--) {
			// A B C D E F
			// A B C D E F X
			// 
			array[i] = array[i-1];
			if (array[i].equals("C")) {
				array[i - 1] = "Z";
				break;
			}
			
		}		
		System.out.println(Arrays.toString(array));
		
		
		//-- 3.从已有的元素中查找指定元素是否存在
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character:\t");
		String temp = scan.next();
		//-- 到容器中遍历.(如果只需要查找有还是没有)
		for (String str : array) {
			if (temp.equals(str)) {
				System.out.println("有存在相同元素");
				break;
			}
		}
		
		
		System.out.println("删除前预览数据:\t");
		System.out.println(Arrays.toString(array));
		// A B Z C D E F
		//-- 4.删除已有元素
		//-- 目标删除Z元素
		//-- 思路: 从Z开始把后面的元素向前覆盖..利用Arrasy.copyOf() 减掉最后一个空间
		for (int i = 0; i < array.length - 1; i++) {
			// 把Z交换到最后
			if (array[i].equals("Z")) {
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;		
			}			
		}
		array = Arrays.copyOf(array, array.length-1);
		System.out.println("删除后:\t");
		System.out.println(Arrays.toString(array));
	}
}
