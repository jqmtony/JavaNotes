import java.util.Scanner;
class Demo01{
	public static void main(String[] args){
		//-- 直接使用大括号声明
		//-- 这里的中括号是一种运算符.代表是数组
		//-- 数组中元素的数据类型[] 变量名称 = {值1,值2,值3};
		int[] array1 = {1,2,3,4,5};
		double[] array2 = {0.0,0.1,0.2,0.3,0.4,0.5};
		boolean [] array3 = {true,false,true,false};
		Scanner[] array4 = {new Scanner(System.in)};
		String[] array5 = {"a","b","c"};
		
		//-- 指明长度声明
		//-- 中括号中的5代表数组中有5个元素.
		/*
			像这样声明,在声明时是不确定数组中每个元素的值
			是多少的.所以系统给与了默认值.(就是该数据类型
			的默认值.)
		 */
		int[] array6 = new int[5];
		double[] array7 = new double[5];
		boolean[] array8 = new boolean[5];
		Scanner[] array9 = new Scanner[1];
		String[] array10 = new String[3];
		
		//-- 混合声明
		int[] array = new int[]{1,2,3,4,5};		
	}
}