import java.util.Arrays;
import java.util.Random;

public class DoubleColorLotteryRef {
	public static void main(String[] args) {
		//-- 1.提供一个容器
		int[][] lottery = new int[100][7]; // 100期，每期7个数，6红1蓝
		System.out.println(lottery.length); // 
		//-- 2.提供Random
		Random random = new Random();
		//-- 3.给容器填充元素
		//-- 3.1给lottery的100个元素赋值
		for(int i=0;i<lottery.length;i++) {
			//-- 3.2对lottery中下标为i的元素进行赋值
			for(int j=0;j<lottery[i].length;j++) {
				if(j==6) {
					//-- 这是蓝球
					lottery[i][j]=random.nextInt(16)+1;
				}else {
					//-- 这是红球
					lottery[i][j]=random.nextInt(33)+1;
					//-- 对红球的值进行验证保证一期内不出现重复的元素
					for(int k=0;k<j;k++) {
						if(lottery[i][k]==lottery[i][j]) {
							j--;
							break;
						}
					}
				}
			}
		}
		//-- 预览100期彩票数据，toString输出哈希吗
//		System.out.println(Arrays.deepToString(lottery));
		int term = 0;
		for(int[] stage:lottery) {
			System.out.print("第"+(++term)+"期彩票号码：\t");
			for(int ele:stage) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
		//-- 4.统计容器中元素的出现次数（核心是新数组下标为数组取值，下标重复，新数组值自增+1，初始化的新数组元素均为0）
		//-- 4.1提供红球和篮球的取值范围
		int[] redBalls = new int[33]; // 下标0~32
		int[] blueBalls = new int[16]; 
		
		for(int i=0;i<lottery.length;i++)  { // 二维数组的子数组：{{i} {i} {...} {...} {} {}}
			for(int j=0;j<lottery[i].length;j++) { // 二维数组的子数组的元素：{{j1,j2,j3....} {j1,j2,j3...} {...} {...} {} {}}
				if(j==6) {
					blueBalls[lottery[i][j]-1]=blueBalls[lottery[i][j]-1]+1;
				}else {
					redBalls[lottery[i][j]-1]=redBalls[lottery[i][j]-1]+1;
				}
			}
		}
		//-- 4.2显示100期中所有的蓝色球出现的次数
		int blueCount = 0;
		for(int i:blueBalls) { // 利用值和下标自增1的关系统计所有的1就是数组元素数的总和
			System.out.println(i);
			blueCount +=i;
		}
		System.out.println("所有的蓝球总数是（1*100）："+blueCount);

		int redCount = 0;
		for(int j:redBalls) {
			System.out.println(j);
			redCount +=j;
		}
		System.out.println("所有的红球总数是（6*100）："+redCount);
		
		//-- 5.排序
		//-- 5.0 求红球每个数和蓝球每个数出现的概率
		double[][] redPro=new double[33][2];
		double[][] bluePro=new double[16][2]; //{{元素本身，元素出现的概率} {} {}...}
		
		//-- 5.1求蓝球
		//-- 取一个蓝球 
		//-- blueBalls数组的下标+1是蓝球本身，下标所对应的数组是出现的次数
		for(int i=0;i<blueBalls.length;i++) {
			//-- 求i+1多代表的数出现的概率
			double pro = blueBalls[i]/100.0;  // 因为正好是100期，如果是120期，出现的次数应该是除以120的
			//-- 概率和球本身放入bluePro里
			bluePro[i][0]=i+1;
			bluePro[i][1]=pro;
		}
			
		//-- 5.2求红球
		for(int i=0;i<redBalls.length;i++) {
			//-- 求i+1多代表的数出现的概率
			double pro = redBalls[i]/100.0;
			//-- 概率和球本身放入redPro里
			redPro[i][0]=i+1;
			redPro[i][1]=pro;
		}
		System.out.println("-----------------------");
		
		//-- 5.3显示数据
		System.out.println("blueBalls(1~16)出现次数："+Arrays.toString(blueBalls));
		System.out.println("blueBalls({取值，概率})的数组序列："+Arrays.deepToString(bluePro));

		System.out.println("redBalls(1~33)出现次数："+Arrays.toString(redBalls));
		System.out.println("redBalls({取值，概率})的数组序列："+Arrays.deepToString(redPro));
		
		System.out.println("-----------------------");
		//-- 6.排序
		//-- 6.1 对蓝球排序
		for(int i=0;i<bluePro.length-1;i++) {
			for(int j=0;j<bluePro.length-1-i;j++) {
				//-- bluePro[j] = {元素，概率}，1代表第2个元素
				double[] temp= {};
				if(bluePro[j][1]>bluePro[j+1][1]) {
					temp=bluePro[j];
					bluePro[j]=bluePro[j+1];
					bluePro[j+1]=temp;
				}
			} 
		} 
		//-- 6.2打印排序后的结果
		System.out.println("blueBalls(1~16)出现次数，排序后："+Arrays.deepToString(bluePro));
		
		//-- 6.3对红球排序
		for(int i=0;i<redPro.length-1;i++) {
			for(int j=0;j<redPro.length-1-i;j++) {
				//-- bluePro[j] = {元素，概率}，1代表第2个元素
				double[] temp= {};
				if(redPro[j][1]>redPro[j+1][1]) {
					temp=redPro[j];
					redPro[j]=redPro[j+1];
					redPro[j+1]=temp;
				}
			} 
		} 
		System.out.println("redBalls(1~33)出现次数，排序后："+Arrays.deepToString(redPro));
		
	}
}
