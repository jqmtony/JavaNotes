import java.util.Arrays;
import java.util.Scanner;

import org.w3c.dom.css.ElementCSSInlineStyle;

/*
 * 	题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
 
public class D9_Ex1_PracticeX6 {
	public static void main(String[] args) {
		// 创建Scanner
		Scanner scan = new Scanner(System.in);
		
		// 题目1：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
//		System.out.println("请输一行字符：");
//		String input = scan.nextLine();
//		matchStr(input);
		
		// 题目2：一对兔子第3个月开始每月生一对兔子，后续的兔子也一样，求么每月兔子数
		int month = 24;
		rabbitFamily(month);
		
		// 题目3：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
		// 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
		int height = 100;
//		heightFlow(height);
		
		// 题目4：题目：有1、2、3、4四个数字，
		// 能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输入。   
//		noRepeat3d() ;
		
		// 题目5：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，
		// 还不瘾，又多吃了一个；第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
		// 以后每天早上都吃了前一天剩下 的一半加一个。
		// 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。   
		int lastPeach = 1;
		monkeyPeach(lastPeach);
		
	} // main end


	private static void monkeyPeach(int lastPeach) {
		int[] array = new int[10];
		for (int i = array.length-1; i >=0; i--) {
			if(i==array.length-1) {
				array[i]= lastPeach; 
			}else {
				array[i] = (array[i+1]+1)*2; // 第9天的桃子 = ( 第10天的桃子+1 ）* 2
			}
			System.out.println("第 "+(i+1)+" 天共有 "+array[i]+" 个桃子");
		}
	}

	private static void noRepeat3d() {
		int count = 0;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				for (int j2 = 1; j2 <=4; j2++) {
					if(i!=j&&j!=j2&&j2!=i) {
						count = count +1;
//						System.out.println(i*100+j*10+j2);
					}
				}
			}
		}
		System.out.println("三位数不重复的一共有："+count);
	}

	private static void heightFlow(int height) {
		double[] array = new double[10];
		double jump = 0.0;
		for (int i = 0; i < array.length; i++) {
			if(i==0) {
				array[i] =50; // 第1次反弹的高度
			}else {
				array[i] = array[i-1] / 2;
			}
			jump = jump + array[i]*2; 
		}
		System.out.println("它在 第10次落地时，共经过多少米？"+(jump+100));
		System.out.println("它在 第10次落地时，第10次反弹多高？"+array[array.length-1]);
		// 它在 第10次落地时，共经过多少米？299.8046875
		// 它在 第10次落地时，第10次反弹多高？0.09765625
	} 


	private static void rabbitFamily(int month) {
		int[] rabbitsArray = new int[month];  // 兔子家族存活的10个月
		for (int i = 0; i <rabbitsArray.length; i++) { // 0就是第1个月，有1对兔子
			if(i==0 || i==1) {
				rabbitsArray[i] = 2;  // 第3个月是2对兔子，4只
			}else {
				rabbitsArray[i] = rabbitsArray[i-1]+rabbitsArray[i-2];
			}
			System.out.println("第"+(i+1)+"个月的兔子数量为"+rabbitsArray[i]);
		}
	}

	// 方法1
	public static void matchStr(String input) {
		// 提取字符
		
		int sum_abc = 0;
		int sum_blank = 0;
		int sum_num = 0;
		int sum_other = 0;
		char[] charArray = input.toCharArray();
		int charASCII = 0;
		for (int i = 0; i < charArray.length-1; i++) { // 字符数组的遍历
			charASCII = (int)charArray[i];
			// 英文字符码：97~122,65~90
			if((charASCII>=97&&charASCII<=122) || (charASCII>=65&&charASCII<=90)) { 
				sum_abc += 1;
			}else if(charASCII>=48&&charASCII<=59) { // 数字字符码：48~59
				sum_num += 1;
			}else if(charASCII==32) { // 空格：32
				sum_blank += 1; 
			}else {
				sum_other +=1;
			}
		}

		System.out.println("字母总数："+sum_abc);
		System.out.println("数字总数："+sum_num);
		System.out.println("空格总数："+sum_blank);
		System.out.println("其他字符总数："+sum_other);
		System.out.println("预览字符数组："+Arrays.toString(charArray));
	} // end
	
	
}
