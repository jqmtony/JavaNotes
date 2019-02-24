import java.util.Arrays;
import java.util.Random;

public class DoubleColorLotteryRef {
	public static void main(String[] args) {
		//-- 1.�ṩһ������
		int[][] lottery = new int[100][7]; // 100�ڣ�ÿ��7������6��1��
		System.out.println(lottery.length); // 
		//-- 2.�ṩRandom
		Random random = new Random();
		//-- 3.���������Ԫ��
		//-- 3.1��lottery��100��Ԫ�ظ�ֵ
		for(int i=0;i<lottery.length;i++) {
			//-- 3.2��lottery���±�Ϊi��Ԫ�ؽ��и�ֵ
			for(int j=0;j<lottery[i].length;j++) {
				if(j==6) {
					//-- ��������
					lottery[i][j]=random.nextInt(16)+1;
				}else {
					//-- ���Ǻ���
					lottery[i][j]=random.nextInt(33)+1;
					//-- �Ժ����ֵ������֤��֤һ���ڲ������ظ���Ԫ��
					for(int k=0;k<j;k++) {
						if(lottery[i][k]==lottery[i][j]) {
							j--;
							break;
						}
					}
				}
			}
		}
		//-- Ԥ��100�ڲ�Ʊ���ݣ�toString�����ϣ��
//		System.out.println(Arrays.deepToString(lottery));
		int term = 0;
		for(int[] stage:lottery) {
			System.out.print("��"+(++term)+"�ڲ�Ʊ���룺\t");
			for(int ele:stage) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
		
		//-- 4.ͳ��������Ԫ�صĳ��ִ������������������±�Ϊ����ȡֵ���±��ظ���������ֵ����+1����ʼ����������Ԫ�ؾ�Ϊ0��
		//-- 4.1�ṩ����������ȡֵ��Χ
		int[] redBalls = new int[33]; // �±�0~32
		int[] blueBalls = new int[16]; 
		
		for(int i=0;i<lottery.length;i++)  { // ��ά����������飺{{i} {i} {...} {...} {} {}}
			for(int j=0;j<lottery[i].length;j++) { // ��ά������������Ԫ�أ�{{j1,j2,j3....} {j1,j2,j3...} {...} {...} {} {}}
				if(j==6) {
					blueBalls[lottery[i][j]-1]=blueBalls[lottery[i][j]-1]+1;
				}else {
					redBalls[lottery[i][j]-1]=redBalls[lottery[i][j]-1]+1;
				}
			}
		}
		//-- 4.2��ʾ100�������е���ɫ����ֵĴ���
		int blueCount = 0;
		for(int i:blueBalls) { // ����ֵ���±�����1�Ĺ�ϵͳ�����е�1��������Ԫ�������ܺ�
			System.out.println(i);
			blueCount +=i;
		}
		System.out.println("���е����������ǣ�1*100����"+blueCount);

		int redCount = 0;
		for(int j:redBalls) {
			System.out.println(j);
			redCount +=j;
		}
		System.out.println("���еĺ��������ǣ�6*100����"+redCount);
		
		//-- 5.����
		//-- 5.0 �����ÿ����������ÿ�������ֵĸ���
		double[][] redPro=new double[33][2];
		double[][] bluePro=new double[16][2]; //{{Ԫ�ر���Ԫ�س��ֵĸ���} {} {}...}
		
		//-- 5.1������
		//-- ȡһ������ 
		//-- blueBalls������±�+1���������±�����Ӧ�������ǳ��ֵĴ���
		for(int i=0;i<blueBalls.length;i++) {
			//-- ��i+1�����������ֵĸ���
			double pro = blueBalls[i]/100.0;  // ��Ϊ������100�ڣ������120�ڣ����ֵĴ���Ӧ���ǳ���120��
			//-- ���ʺ��������bluePro��
			bluePro[i][0]=i+1;
			bluePro[i][1]=pro;
		}
			
		//-- 5.2�����
		for(int i=0;i<redBalls.length;i++) {
			//-- ��i+1�����������ֵĸ���
			double pro = redBalls[i]/100.0;
			//-- ���ʺ��������redPro��
			redPro[i][0]=i+1;
			redPro[i][1]=pro;
		}
		System.out.println("-----------------------");
		
		//-- 5.3��ʾ����
		System.out.println("blueBalls(1~16)���ִ�����"+Arrays.toString(blueBalls));
		System.out.println("blueBalls({ȡֵ������})���������У�"+Arrays.deepToString(bluePro));

		System.out.println("redBalls(1~33)���ִ�����"+Arrays.toString(redBalls));
		System.out.println("redBalls({ȡֵ������})���������У�"+Arrays.deepToString(redPro));
		
		System.out.println("-----------------------");
		//-- 6.����
		//-- 6.1 ����������
		for(int i=0;i<bluePro.length-1;i++) {
			for(int j=0;j<bluePro.length-1-i;j++) {
				//-- bluePro[j] = {Ԫ�أ�����}��1�����2��Ԫ��
				double[] temp= {};
				if(bluePro[j][1]>bluePro[j+1][1]) {
					temp=bluePro[j];
					bluePro[j]=bluePro[j+1];
					bluePro[j+1]=temp;
				}
			} 
		} 
		//-- 6.2��ӡ�����Ľ��
		System.out.println("blueBalls(1~16)���ִ����������"+Arrays.deepToString(bluePro));
		
		//-- 6.3�Ժ�������
		for(int i=0;i<redPro.length-1;i++) {
			for(int j=0;j<redPro.length-1-i;j++) {
				//-- bluePro[j] = {Ԫ�أ�����}��1�����2��Ԫ��
				double[] temp= {};
				if(redPro[j][1]>redPro[j+1][1]) {
					temp=redPro[j];
					redPro[j]=redPro[j+1];
					redPro[j+1]=temp;
				}
			} 
		} 
		System.out.println("redBalls(1~33)���ִ����������"+Arrays.deepToString(redPro));
		
	}
}
