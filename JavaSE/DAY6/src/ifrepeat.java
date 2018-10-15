import java.util.Scanner;

public class ifrepeat {

	public static void main(String[] args) {
		//-- 1.提供数组(容器来保存数列)
		int[] array = {8,4,2,1,23,344,12,12,12,344,2,4,8};
		
		//-- 2.循环打印数列中的元素
		//-- 从数据源 array 中取 int 类型的元素保存到i里面去.
		for(int i : array) {
			System.out.println(i);
		}
		
		//-- 3.求数列中所有元素的和
		int sum = 0;
		/*
		 * For-Each 是加强For.利用了迭代器对遍历进行加强.
		 * 所以遍历的速度会比普通的For要快一点.
		 * 如果只是单纯的遍历.不需要使用下标的情况下推荐使用加强for
		 */
		for(int i : array) {
			sum +=i;
		}
		System.out.println("和:\t" + sum);

		sum = 0;
		for(int i = 0 ; i < array.length ; i ++) {
			sum += array[i];
		}
		System.out.println("和:\t" + sum);
		
		//-- 4.从键盘录入一个数.判断数列中是否包含此数
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please Enter A Number:\t");
//		int target = scan.nextInt();
//		
		//-- 对数组中的元素进行遍历.取每一个元素和录入的元素进行比较.判断是否相同
//		int index = 0;
//		for(int i : array) {
//			if(i == target){
//				System.out.println("包含此元素.下标为:\t" + index);
//				break;
//			}
//			index ++;
//		}
//		
		// 值相同则输出下标
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array.length-1;j++) {
				if(array[i]==array[j]) {
					if(i!=j) {
						System.out.println("----------------------------");
						System.out.println("第"+i+"个元素与第"+j+"个元素的值相同，分别为："+array[i]+"和"+array[j]);
						System.out.println("此处下标i的值为："+i);
						System.out.println("此处下标j的值为："+j);
						System.out.println("此处array[i])的值为："+array[i]);
						System.out.println("此处array[j])的值为："+array[j]);
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
