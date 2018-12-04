import java.util.Random;
import java.util.Arrays;
class Demo04{
	public static void main(String[] args){
	
		//-- 第一题声明9个数组
		byte[] array1 = {1,2,3,4,5,6,7,8,9,10};
		short[] array2 = {1,2,3,4,5,6,7,8,9,10};
		int[] array3 = {1,2,3,4,5,6,7,8,9,10};
		long[] array4 = {1,2,3,4,5,6,7,8,9,10};
		
		float[] array5 = new float[10];
		double[] array6 = new double[10];
		
		char[] array7 = new char[10];
		
		boolean[] array8 = new  boolean[10];
		
		//-- 第二题测试第二种方式创建的数组中是否有值
		System.out.println(array8.length);
		
		//-- 利用循环遍历数组中的元素
		//-- 一旦数组创建.系统会自动给数组中每个位置赋值
		//-- 赋予类型的默认值.
		for(int i = 0 ; i < array8.length ; i ++){
			System.out.println(array8[i]);
		}
		
		
		//-- 第三题
		Random random = new Random();
		//-- Arrays.toString(数组) 把数组中的元素一行打印.
		System.out.println("赋值前:\t" + Arrays.toString(array3));
		for(int i = 0 ;i < array3.length ; i ++ ){
			array3[i] = random.nextInt(10)+1;
		}
		System.out.println("赋值后:\t" + Arrays.toString(array3));
		
		//-- 第四天.对数组进行遍历
		//-- 第一种遍历方式 使用普通for
		for(int i = 0 ; i < array3.length ; i ++ ){
			System.out.println(array[i]);
		}
		
		//-- 第二种遍历方式 使用加强for 也叫作for-each
		//-- 对于容器的遍历.该写法推荐使用.
		//-- 格式:for(数组中元素的类型 变量 : 数据源)
		//-- 从数据源array3中取int类型的变量保存在i中.
		//-- 这种写法的for会自动进行迭代.
		for(int i : array3){
			System.ot.println(i);
		}
		
		//-- 第三种遍历方式 使用API :Arrays.toString();
		//-- 需要java.util.Arrays包的支持
		System.out.println(Arrays.toString(array3));
		
		
		//-- 使用while来遍历数组
		int index = 0 ;
		while(index < array3.length){
			System.ot.println(array3[index++]);
		}
		
		//-- 使用do-while来遍历数组
		index = 0;
		do{
			System.ot.println(array3[index++]);
		}while(index < array3.length);
		
	}

}