import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		// 1.输出数列信息
		int[] array = {4, 2, 4, 5, 3, 2, 1, 6, 5, 11, 1, 5};
		System.out.println("数组长度："+array.length+"\n数组元素："+Arrays.toString(array));
		
		// 2.遍历是否有相等的数组元素，并统计出现的次数
		int count = 0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if(array[i]==array[j]) {
					count++;
				}else { // 没有相等元素
//					System.out.println("------------------------------i="+i);
				}

//				System.out.println("**************相等**************i="+i);
				System.out.println("array[i] "+array[i]+" = array[j] "+array[j]+",i和j分别为："+i+","+j);
				System.out.println("此元素一共出现 "+count+" 次");
			}
		}
		
	}
}
