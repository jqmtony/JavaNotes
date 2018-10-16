import java.util.Arrays;
import java.util.Random;

class lottery {
	public static void main(String[] args) {
		// 1. 创建Random随机数
		Random random = new Random();
		// 2. 创建列表，{ {6个红，1个蓝} {6个红，1个蓝} {} {} {} {} {} {} {}....{n=100}}
		int[][] lottery = new int[100][7];
		
		// 2.1 蓝色取值1-16，红色取值1-33且不重复，红色和蓝色可以重复
		for(int i=0; i<lottery.length;i++) {
			for(int j=0; j<lottery[i].length; j++) {
				// 当j是第7个元素，即下标为6时输出蓝球随机值
				if(j==6) { 
					lottery[i][j] = random.nextInt(16)+1;
					break;
				}else {
					lottery[i][j] = random.nextInt(33)+1; 
					// 0~5这6个元素是红球数值，要求不重复
					for(int k=0;k<j;k++) {
						if(lottery[i][j]==lottery[i][k]) {
							j--;
						}
					}
				}
			}
			//-- 预览100期的6红1蓝数组，输出格式：第1期双色球序列：{.......}  第2期
			System.out.print("第"+i+"期双色球序列：");
			System.out.println(Arrays.toString(lottery[i]));
		}
		System.out.println("-------------------- 双色球序列输出完毕 -------------------");
		
		// 3. 统计数值的出现次数，方法：值对应下标出现次数自增1
		int[] blueEleCount = new int[16]; // 蓝色球取值范围：1~16，下标0~15
		int[] redEleCount = new int[33]; // 红色球取值范围：1~33，下标0~32
		
		for(int i=0;i<lottery.length;i++) { // 获取每期双色球数组
			for(int j=0;j<lottery[i].length;j++) { // 获取每期双色球数组的值
				if(j==6) { // 如果是第6个元素，把值当做下标给blueEleCount并自增1
					/*
					if(lottery[i][j]==3) { // 验证元素出现次数是否为真
						System.out.println(lottery[i][j]);
					}
					*/
					blueEleCount[lottery[i][j]-1] = blueEleCount[lottery[i][j]-1]+1; // 同样下标出现一次则对应值+1
				}else { // 第0~5个元素，给redEleCount
					redEleCount[lottery[i][j]-1] = redEleCount[lottery[i][j]-1]+1; // 值16存储在下标15上
				}
			}
		}
		// 预览蓝色和红色数值重复出现的次数
		System.out.println("蓝色球的值([0]1~[15]16)出现的次数："+Arrays.toString(blueEleCount));
		System.out.println("红色球的值([0]1~[15]33)出现的次数："+Arrays.toString(redEleCount));
		System.out.println("--------------------↑ 红色和蓝色出现的次数序列 ↑ -------------------");
		// 4. 每个元素的出现概率
		// 4.1 创建一个二维数组，{ {取值1，出现次数1or概率1} {取值2，出现次数or概率} {...} {} {} {} {} {}}
		double[][] bluePoss = new double[16][2]; // 100期的蓝色球取值，范围1~16，数组元素{值,出现/概率}
		double[][] redPoss = new double[32][2];
		int p=0;
		
		// 4.2 取蓝色，{1~16, blueEleCount[i]}
		for(int i=0;i<bluePoss.length;i++) {
			bluePoss[i][0]=i+1; // 第一个元素，下标0~15的值为1~16
			// 获取概率
			double possibilityblue =blueEleCount[i]/100.0; // 数组元素值是小数，字节4，可以自动转换为double8字节
			bluePoss[i][1]=possibilityblue; // 将double概率赋值给double数组
		}
		// 预览蓝色取值和概率
		System.out.println("蓝色球1~16（取值，概率）："+Arrays.deepToString(bluePoss));
		
		// 4.3 取红色，{1~33, redEleCount[i]}
		p=0;
		for(int i=0;i<redPoss.length;i++) {
			redPoss[i][0]=i+1;
			double possibilityred =redEleCount[i]/100.0; 
			redPoss[i][1]=possibilityred; 
		}
		System.out.println("红色球1~33（取值，概率）："+Arrays.deepToString(redPoss));
		System.out.println("--------------------↑红色和蓝色（取值，概率） ↑ -------------------");

		// 5. 每个元素的出现概率排序
		double[] temp= new double[2];

		// 5.1 递归蓝色每期数组的第2个元素，按大小进行冒泡排序
		for(int i=0;i<bluePoss.length-1;i++) {
			for(int j=0;j<bluePoss.length-1;j++) {
				if(bluePoss[j][1]>bluePoss[j+1][1]){// 比较蓝色球的次数{值，次数}
					temp =bluePoss[j+1]; // 按从小到大排列
					bluePoss[j+1] =bluePoss[j];
					bluePoss[j]=temp;
				}
			}
		}
		// 预览
		System.out.println("蓝色球1~16（取值，概率），排序后："+Arrays.deepToString(bluePoss));
		
		// 5.2 递归红色
		for(int i=0;i<redPoss.length-1;i++) {
			for(int j=0;j<redPoss.length-1;j++) {
				if(redPoss[j][1]>redPoss[j+1][1]){// 比较蓝色球的次数{值，次数}
					temp =redPoss[j+1]; // 按从小到大排列
					redPoss[j+1] =redPoss[j];
					redPoss[j]=temp;
				}
			}
		}
		System.out.println("红色球1~33（取值，概率），排序后："+Arrays.deepToString(redPoss));
	}
}
