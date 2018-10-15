import java.util.Random;
import java.util.Arrays;


/*
 * 目标：
 * 实现一个数组，长度为10，里面的元素取值随机数1-10，没有重复
 */

public class tryArray2 {
	public static void main(String[] args) {
		boolean isSame = false;
		//-- 1.提供random
		Random random = new Random();
		//-- 2.提供数组容器
		int[] array = new int[7];
		//-- 3.利用循环给数组中的元素进行赋值操作
		for(int i=0;i<array.length;i++) {
			//-- 目的：把随机数放到数组array中第i个位置上
			array[i]=random.nextInt(10)+1;
			//-- 目的，取第0~i位置上的元素和第i位置上的元素进行比较
			for(int j=0;j<i;j++) {
				if(array[i]==array[j]) { // 值相同
					i=i-1;
					isSame = true;
//					System.out.println("------------"+i+isSame);
					break;
				}else {
					isSame = false; // 值不同
//					System.out.println("////////////"+i+isSame);
				}
//				System.out.println("33333333333"+i+isSame); 
			}
			if (!isSame) { 
				System.out.println("第" + (i) + "位置上的元素是:" + array[i]);
				System.out.println(isSame); 
//			}
		}
	}
}

