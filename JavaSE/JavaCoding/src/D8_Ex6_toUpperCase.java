import java.util.Arrays;
import java.util.Random;

/*
 * 	5.	设计一个方法.用于把小写的字母转换成大写.
 * 	用String s=str.toLowerCase();
 * String s=str.toUpperCase();
 * 来将字符串用来字符串大小写转换
 */

public class D8_Ex6_toUpperCase {
	
	public static void main(String[] args) {
		 
		// 创建String数组
		String[] array = {"abcdefghijDEFGHklm","nopqrstuvwxyzABCIJKLM","NOPQRSTUVW","XYZ0123456789"};
		// TODO 随机生成String元素
		// 调用方法
		toUpperCase(array);
	}

	private static void toUpperCase(String[] array) {
		System.out.println("String1："+Arrays.toString(array));
		for(int i=0;i<array.length;i++) {
//			String Upstr = str.toUpperCase();
			array[i] = array[i].toUpperCase();
		}
		System.out.println("String2："+Arrays.toString(array));
	}
	
	
}











