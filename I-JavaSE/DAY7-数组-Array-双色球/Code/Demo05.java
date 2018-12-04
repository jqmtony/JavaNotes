
public class Demo05 {

	public static void main(String[] args) {
	
		/*
		 * array中有三个元素.分别是
		 * 	array1 = {1,2}
		 * 	array2 = {3,4,5,6}
		 * 	array3 = {7,8,9,10}
		 */
		int[][] array = {{1,2},{3,4,5,6},{7,8,9,10}};
		//-- 
		System.out.println(array.length);
		int[] childArray = array[1];
		for (int i : childArray) {
			System.out.println(i);
		}
		System.out.println(childArray[2]);
		
		// -- 把上面的合并
		System.out.println(array[1][2] = 111);
		
		// -- 遍历
		System.out.println("------------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("array["+i+"]["+j+"]:\t"+ array[i][j]);
			}
		}
	}
}
