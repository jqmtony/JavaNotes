import java.util.Arrays;

/*
 * 	仅用于Test部分输出
 */
public class TestOnly {
	public static void main(String[] args) {
		// 数组的倒序输出
		String[] array = {"5","abcd","aaa","4","a","#%(*","3","abcd","1"};
		for (int i = array.length-1; i >=0; i--) {
			System.out.println("数组下标\t"+i+"\t数组元素\t"+array[i]);
		}
	}
}
