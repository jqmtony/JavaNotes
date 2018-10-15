import java.util.Arrays;
import java.util.Random;

/*
 * 目标:
 * 	实现一个数组.长度为10.里面的元素取值随机数1-10.没有重复
 */
public class Demo05 {

	public static void main(String[] args) {
		//-- 控制是否打印.
		boolean isSame = false;
		//-- 1.提供Random
		Random random = new Random();
		//-- 2.提供数组容器
		int[] array = new int[10];
		//-- 3.利用循环给数组中的元素进行赋值操作
		for(int i = 0 ; i < array.length ; i ++) {		
			//-- 声明一个变量保存随机数.随机数取值1-10
			//-- 目的:把随机数放到数组array中第i个位置上
			array[i] = random.nextInt(10)+1;			
			//-- 目的:取第0~i-1位置上的元素和第i位置上的元素进行比较
			//-- 实际只放了i+1个元素.(+1的原因:因为i取值从0开始)
			//-- 比如只放了5个元素.那需要比较的是前四个和第五个..第五个后面的不需要比较.
			for(int j = 0 ; j < i ;j ++) {
				//-- 利用条件结构和关系运算符来形成比较条件
				if(array[i] == array[j]) {
					/*
					 * 要思考清楚:
					 * 	相等要干嘛:离开内层for进行外层for 重新生成随机数
					 *  不相等要干嘛:继续比较下一个.直到第i-1个元素都和i个元素不相等.
					 */
					//-- 目的:保证i不变.
					i--;
					isSame = true;
					break;	
				}else {
					isSame = false;
				}
			}
			if (!isSame) {
				System.out.println("第" + (i+1) + "位置上的元素是:" + array[i]);
			}
		}
		
	}	
}
