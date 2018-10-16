import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author Administrator
 *
 */
public class Demo06 {
	// -- 目标:数组 循环 条件 随机数 不重复 统计次数练习
	// -- 额外补充知识点:double类型的输出格式(四种写法.我们只用一种)

	public static void main(String[] args) {
		// -- 1.提供一个容器 100代表lottery容器中有100个元素.这每一个元素还是一个数组.这个数组中有7个元素
		int[][] lottery = new int[100][7];
		// -- 2.提供Random
		Random random = new Random();
		// -- 3.给容器填充元素
		// -- 3.1 给lottery的100个元素赋值
		for (int i = 0; i < lottery.length; i++) {
			// -- 3.2 对lottery中下标为i的元素进行赋值
			for (int j = 0; j < lottery[i].length; j++) {
				if (j == 6) {
					// -- 这是蓝球
					lottery[i][j] = random.nextInt(16) + 1;
				} else {
					// -- 代表红球
					lottery[i][j] = random.nextInt(33) + 1;
					// -- 对红球的值进行验证保证一期内不出现重复的元素
					for (int k = 0; k < j; k++) {
						if (lottery[i][k] == lottery[i][j]) {
							j--;
							break;
						}
					}
				}
			}
		}
		// -- 预览100期彩票数据.HashCode().哈希码
		// System.out.println(Arrays.toString(lottery));
		// System.out.println(Arrays.deepToString(lottery));
		/*
		 * int i = 0;
		 * 
		 * for (int[] stage : lottery) { System.out.print("第" + (++i) + "期彩票,号码是:\t");
		 * for (int ele : stage) { System.out.print(ele + " "); } System.out.println();
		 * }
		 */
		// -- 4.统计容器中元素的出现次数

		// -- 4.1 提供对应红球的取值范围和蓝球的取值范围
		int[] redBalls = new int[33];
		int[] blueBalls = new int[16];

		for (int i = 0; i < lottery.length; i++) {
			for (int j = 0; j < lottery[i].length; j++) {
				if (j == 6) {
					blueBalls[lottery[i][j] - 1] = blueBalls[lottery[i][j] - 1] + 1;
				} else {
					redBalls[lottery[i][j] - 1] = redBalls[lottery[i][j] - 1] + 1;
				}
			}
		}

		// -- 4.2 显示100期中所有的蓝球出现的次数
		int blueCount = 0;
		for (int i : blueBalls) {
			System.out.println(i);
			blueCount += i;
		}
		System.out.println("所有的蓝球总数是:\t" + blueCount);

		int redCount = 0;
		for (int i : redBalls) {
			System.out.println(i);
			redCount += i;
		}
		System.out.println("所有的红球总数是:\t" + redCount);

		// -- 5.求红球每个数和蓝球每个数出现的概率.
		double[][] redPro = new double[33][2];
		double[][] bluePro = new double[16][2];
		// {{元素本身,元素的概率}
		// -- 5.1 求蓝球
		// -- 取一个蓝球 blueBalls数组的下标+1 是蓝球本身.下标所对应的数字是出现的次数
		for (int i = 0; i < blueBalls.length; i++) {
			// -- 求i+1所代表的数.出现的概率
			double pro = blueBalls[i] / 100.0;
			// -- 概率和球本身放入bluePro里面
			bluePro[i][0] = i + 1;
			bluePro[i][1] = pro;
		}

		// -- 5.2 求红球
		for (int i = 0; i < redBalls.length; i++) {
			// -- 求i+1所代表的数.出现的概率
			double pro = redBalls[i] / 100.0;
			// -- 概率和球本身放入bluePro里面
			redPro[i][0] = i + 1;
			redPro[i][1] = pro;
		}
		System.out.println("----------");

		// -- 5.3 显示数据
		System.out.println(Arrays.toString(blueBalls));
		System.out.println(Arrays.deepToString(bluePro));

		// -- 6.排序
		// -- 6.1 对蓝球排序
		for (int i = 0; i < bluePro.length - 1; i++) {
			for (int j = 0; j < bluePro.length - 1 - i; j++) {
				// bluePro[j] = {元素,概率}
				double[] temp = {};
				if (bluePro[j][1] > bluePro[j + 1][1]) {
					temp = bluePro[j];
					bluePro[j] = bluePro[j + 1];
					bluePro[j + 1] = temp;
				}
			}
		}
		// -- 6.2 打印排序后的结果
		System.out.println(Arrays.deepToString(bluePro));

		// -- 6.3 对红球排序
		for (int i = 0; i < redPro.length - 1; i++) {
			for (int j = 0; j < redPro.length - 1 - i; j++) {
				// bluePro[j] = {元素,概率}
				double[] temp = {};
				if (redPro[j][1] > redPro[j + 1][1]) {
					temp = redPro[j];
					redPro[j] = redPro[j + 1];
					redPro[j + 1] = temp;
				}
			}
		}
		// -- 6.4 打印排序后的结果
		System.out.println(Arrays.deepToString(redPro));
	}
}
