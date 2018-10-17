import java.util.Arrays;
import java.util.Scanner;

public class D8_Ex3_tryMethod {
	/*
	 *	对数组中的元素进行增删改查
	 */

		public static void main(String[] args) {
			// 1.创建数组
			int[] array = {0,1,2,3,4,5,6,7};
			
			// 2.制定某个元素进行操作
			System.out.println("元素长度为："+array.length);
			System.out.println("请输入想要进行操作的元素下标：");
			Scanner scan=new Scanner(System.in);
			int p = 0;
			while(true) {
				p = scan.nextInt();
				if(p<0 || p>array.length-1){
					System.out.println("输入的下标超出范围，请重新输入：");
					continue;
				}
				break;
			}
			System.out.println("Array为："+Arrays.toString(array)+"，下标："+p+"，值："+array[p]);
			
			// 3.引用方法进行操作
			System.out.println("请输入想要进行的操作：1.添加 2.删除 3.替换 4.查询");
			int operator = scan.nextInt();
			int[] result = new int[array.length+1];
			switch(operator){
				case 1:
					result = addEle(array,p);
					System.out.println("计算结果为"+Arrays.toString(result)+"，下标："+p+"，值："+array[p]);
					break;
				case 2:
					result = delEle(array,p);
					System.out.println("计算结果为"+Arrays.toString(result)+"，下标："+p+"，值："+array[p]);
					break;
				case 3:
					result = changeEle(array,p);
					System.out.println("计算结果为"+Arrays.toString(result)+"，下标："+p+"，值："+array[p]);
					break;
				case 4:
					result = findEle(array,p);
					System.out.println("计算结果为"+Arrays.toString(result)+"，下标："+p+"，值："+array[p]);
					break;
				default:
					;
					break;
			}

			
		}  
		// 方法在main外面
		
		// 4.方法
		// 4.1 增加元素
		public static int[] addEle(int[] array, int p){
			array = Arrays.copyOf(array, array.length+1);
			array[array.length-1] = array[p];
			return array;
		}
		// 4.2 删除元素
		public static int[] delEle(int[] array, int p){
			for(int i=p;i<array.length-1;i++) { // 后面的值统一前移
				// 0 1 2 3 (4) 5 6 7 8，
				// 0 1 2 3 5 6 7 8
				int temp = array[i];	// 从p的值开始，p为p+1的值
				array[i]=array[i+1];
				array[i+1]=temp;
			}
			array = Arrays.copyOf(array, array.length-1);
			return array;
		}
		// 4.3 改变元素
		public static int[] changeEle(int[] array, int p){
			for(int i=0;i<array.length-1;i++) {
				if(array[i]==array[p]) {
					array[i] = 123;
				}
			}
			return array;
		}
		// 4.4 查询元素
		public static int[] findEle(int[] array, int p){
			for(int i=0;i<array.length-1;i++) {
				if(array[i]==array[p]) {
					System.out.print(array[p]);
				}
			}
			return array;
		}
	

}
