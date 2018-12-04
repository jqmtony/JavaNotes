import java.util.Arrays;

public class Demo09 {

	public static void main(String[] args) {
		
		//-- 对已有的数组进行容量改变处理.本质还是创建一个新的数组.
		
		int[] array = {1,2,3,4,5};
		
		System.out.println(array.length);
		
		//-- 利用API方法改变数组容量
		array = Arrays.copyOf(array, 10);
		
		System.out.println(Arrays.toString(array));	
	}
}
