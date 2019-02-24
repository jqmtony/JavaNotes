import java.util.Scanner;

// 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。

public class Demo04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter:\t");
		//-- 想要包含空格要使用nextLine
		//-- next 遇到空格回车.会自动结束录入
		String temp = scan.nextLine();
		//-- 把字符串转变成字符数组
		char[] chars = temp.toCharArray();
	
		//-- 英文字母
		int abcCount = 0;
		//-- 空格
		int spaceCount = 0;
		//-- 数字
		int numCount = 0;
		//-- 其它字符
		int otherCount = 0;
		
		
		//-- 对数组做遍历
		for (int i = 0; i < chars.length; i++) {
			 //-- Character.isLetter()  判断是否是字母
			if (Character.isLetter(chars[i])) {
				abcCount ++;
			}else if(Character.isDigit(chars[i])) {
				//-- Character 是char的引用数据类型
				//-- 判断是不是数字
				numCount ++;
			}else if (Character.isWhitespace(chars[i])) {
				spaceCount ++;
			}else {
				otherCount ++;
			}
		}
		
		System.out.println("字母个数:\t" + abcCount);
		System.out.println("数字个数:\t" + numCount);
		System.out.println("空格个数:\t" + spaceCount);
		System.out.println("其它个数:\t" + otherCount);
		// Ctrl + D 删除一行
		// Ctrl + Alt + Down 复制一行
		
		scan.close();
	}
}











