import java.lang.reflect.Array;

/*
 * 	根据数组中字符串的长度进行降序排列
 */
public class D8_Ex4_stringArray {
	public static void main(String[] args) {
		// 定义字符串数组
		String[] array = {"a","abc","abcd","abcde","abcdef","a3333","a2"};
		System.out.print("原数组：\t" + array);
		// 调用方法
		stringArray(array);
		// 输出数组元素
		for(String i: array) { // i是数组元素
			System.out.println("数组元素：\t"+i+"\t字符串长度：\t"+i.length());
		}
	}
	
	// 方法
	public static void stringArray(String[] target) {
		// 获取字符串长度
		for(int i =0; i<target.length-1;i++) {
			for(int j =0; j<target.length-1-i;j++) { 
				if(target[j].length() < target[j+1].length()  ) { // 前面的str长度小就排往后排
					// str 1, str 2, str3
					String temp = target[j]; // str1,(str2),str3
					target[j] = target[j+1]; // str1,(str1),str3
					target[j+1] = temp; // 
				}
			}
		// 长度小的往后排，长度大的往前排
		}
	}
	
}
