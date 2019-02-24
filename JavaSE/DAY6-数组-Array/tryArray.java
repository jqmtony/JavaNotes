import java.util.Arrays;
import java.util.Random;

class tryArray1 {
	public static void main(String[] args) {
		// int类型的数组
		int[] array1 = {1,2,3,4,5};
		double[] array2 = {0.0,0.1,0.2,0.3,0.4};
		// boolean,string,scanner
		
		// 查看输出是否顺利
		System.out.println(array1); // c1@....
		System.out.println(Arrays.toString(array1));// [1,2,3,4,5]
		System.out.println(array2);
	}
}

class tryArray2 {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7,8,9};
		// 输出6,可见下标从0开始
		System.out.println("原本的值"+array1[5]); 
		// 将array1[5]的值从6改为10
		array1[5] = 10;
		System.out.println("赋值后的值"+array1[5]); 
		
	}
}

class printArray {
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7,8,9,13};
		//-- 对上面的数组进行遍历，循环取其中的元素
		//-- 表达式1~3，长度获取表达式array.length，无需导包
		for(int i=0;i<array1.length;i++) { 
			//-- 循环体表达式4
			System.out.println(array1[i]); 
		}
	}
}

class exercise {
	public static void main(String[] args) {
		// 1.1创建数组，原生类型8小种
		/* int[] arrayint = {1,2,3,4,5,6,7,8,9};
		byte[] arraybyte = {1,2,3,4,5,6,7,8,9};
		short[] arrayshort = {1,2,3,4,5,6,7,8,9};
		long[] arraylong = {1,2,3,4,5,6,7,8,9};
		float[] arrayfloat = {1,2,3,4,5,6,7,8,9};
		double[] arraydouble = {0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9};
		char[] arraychar = {'a','b','c','d','e'}; // 双引号，单引号无法转成string
		String[] arrayString = {"a","b","c","d","e","f","g"}; // 双引号，单引号无法转成string
		boolean[] arrayboolean = {true,false,true,false,true,false}; */

		// 1.2创建数组，长度为18
		int[] arrayint2 = new int[11];
		byte[] arraybyte2 = new byte[18];
		short[] arrayshort2 = new short[18];
		long[] arraylong2 = new long[18];
		float[] arrayfloat2 = new float[18];
		double[] arraydouble2 = new double[18];
		char[] arraychar2 = new char[18];
		String[] arrayString2 = new String[18];
		boolean[] arrayboolean2 = new boolean[18];
		
		// 2.对1.2的9个数组进行遍历并输出数组值
		/* for(int int2=0;int2<arrayint2.length;int2++) {
			System.out.println(arrayint2[int2]);
		}
		for(int byte2=0;byte2<arraybyte2.length;byte2++) {
			System.out.println(arraybyte2[byte2]);
		}
		for(int short2=0;short2<arrayshort2.length;short2++) {
			System.out.println(arrayshort2[short2]);
		}
		for(int long2=0;long2<arraylong2.length;long2++) {
			System.out.println(arraylong2[long2]);
		}
		for(int float2=0;float2<arrayfloat2.length;float2++) {
			System.out.println(arrayfloat2[float2]);
		}
		for(int double2=0;double2<arraydouble2.length;double2++) {
			System.out.println(arraydouble2[double2]);
		}
		for(int char2=0;char2<arraychar2.length;char2++) {
			System.out.println(arraychar2[char2]);
		}
		for(int String2=0;String2<arrayString2.length;String2++) {
			System.out.println(arrayString2[String2]);
		}
		// 打印出来都是flase,.....，因为系统赋值的是默认值即false
		for(int boolean2=0;boolean2<arrayboolean2.length;boolean2++) {
			System.out.println(arrayboolean2[boolean2]);
		} */
		
		// 3.给int类型的数组赋值.取值随机数(随机数取值范围10)
		// System.out.println("--------3.数组赋值--------");
		/* 
			random的两种取值方式
			第一种：
			import java.util.Random;
			Random random = new Random();
			int num = random.nextInt(10)+1; 
			第二种：
			int num = (int)(Math.random()*10+1);
		*/
		System.out.println("赋值前："+Arrays.toString(arrayint2));
		
		// for(int int3=0;int3<arrayint2.length;int3++) {
			// int num = (int)(Math.random()*10+1);
			// arrayint2[int3]= num;
		// }
		
		// Arrays.toString(array); 一行打印数组元素
		// System.out.println("赋值后："+Arrays.toString(arrayint2));
		
		// 4.接第三题.对int类型数组进行遍历.
		//-- 第二种遍历方式：加强for，也叫作for-each，推荐使用
		// for(int i:arrayint2) {
			// System.out.println(i);
		// }
		
		// 5.要求数组中的元素不可重复
		// int[] arrayintb = new[10];
		for(int i=0;i<arrayint2.length;i++) {
			 /* 
				注：如果int数组的元素超过10，需要把随机数范围也调整大，
				不然不够排，会导致死循环~~ 
			*/
			int arraynum = (int)(Math.random()*20+1);
			arrayint2[i]=arraynum;
			// 将array[i]与array[0~i]比较
			/* System.out.println("---------------");
			System.out.println("输出i："+i) */;
			for(int j=0;j<i;j++) {
				/* System.out.println("输出j："+j); // j=i-1
				System.out.println("输出arrayint2[j]："+arrayint2[j]);
				System.out.println("输出arrayint2[i]："+arrayint2[i]);
				System.out.println(); */
				if(arrayint2[j]==arrayint2[i]) {
					/* System.out.println("相等，需要修改当前元素值：\n"); */
					i = i-1;
				}
			}
		}
		System.out.println("赋值后："+Arrays.toString(arrayint2));
	}
}


















