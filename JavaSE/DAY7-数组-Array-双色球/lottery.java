import java.util.Arrays;
import java.util.Random;

public class lottery {
	public static void main(String[] args) {
		// 1. ����Random�����
		Random random = new Random();
		// 2. �����б�{ {6���죬1����} {6���죬1����} {} {} {} {} {} {} {}....{n=100}}
		int[][] lottery = new int[100][7];
		
		// 2.1 ��ɫȡֵ1-16����ɫȡֵ1-33�Ҳ��ظ�����ɫ����ɫ�����ظ�
		for(int i=0; i<lottery.length;i++) {
			for(int j=0; j<lottery[i].length; j++) {
				// ��j�ǵ�7��Ԫ�أ����±�Ϊ6ʱ����������ֵ
				if(j==6) { 
					lottery[i][j] = random.nextInt(16)+1;
					break;
				}else {
					lottery[i][j] = random.nextInt(33)+1; 
					// 0~5��6��Ԫ���Ǻ�����ֵ��Ҫ���ظ�
					for(int k=0;k<j;k++) {
						if(lottery[i][j]==lottery[i][k]) {
							j--;
						}
					}
				}
			}
			//-- Ԥ��100�ڵ�6��1�����飬�����ʽ����1��˫ɫ�����У�{.......}  ��2��
			System.out.print("��"+i+"��˫ɫ�����У�");
			System.out.println(Arrays.toString(lottery[i]));
		}
		System.out.println("-------------------- ˫ɫ������������ -------------------");
		
		// 3. ͳ����ֵ�ĳ��ִ�����������ֵ��Ӧ�±���ִ�������1
		int[] blueEleCount = new int[16]; // ��ɫ��ȡֵ��Χ��1~16���±�0~15
		int[] redEleCount = new int[33]; // ��ɫ��ȡֵ��Χ��1~33���±�0~32
		
		for(int i=0;i<lottery.length;i++) { // ��ȡÿ��˫ɫ������
			for(int j=0;j<lottery[i].length;j++) { // ��ȡÿ��˫ɫ�������ֵ
				if(j==6) { // ����ǵ�6��Ԫ�أ���ֵ�����±��blueEleCount������1
					/*
					if(lottery[i][j]==3) { // ��֤Ԫ�س��ִ����Ƿ�Ϊ��
						System.out.println(lottery[i][j]);
					}
					*/
					blueEleCount[lottery[i][j]-1] = blueEleCount[lottery[i][j]-1]+1; // ͬ���±����һ�����Ӧֵ+1
				}else { // ��0~5��Ԫ�أ���redEleCount
					redEleCount[lottery[i][j]-1] = redEleCount[lottery[i][j]-1]+1; // ֵ16�洢���±�15��
				}
			}
		}
		// Ԥ����ɫ�ͺ�ɫ��ֵ�ظ����ֵĴ���
		System.out.println("��ɫ���ֵ([0]1~[15]16)���ֵĴ�����"+Arrays.toString(blueEleCount));
		System.out.println("��ɫ���ֵ([0]1~[15]33)���ֵĴ�����"+Arrays.toString(redEleCount));
		System.out.println("--------------------�� ��ɫ����ɫ���ֵĴ������� �� -------------------");
		// 4. ÿ��Ԫ�صĳ��ָ���
		// 4.1 ����һ����ά���飬{ {ȡֵ1�����ִ���1or����1} {ȡֵ2�����ִ���or����} {...} {} {} {} {} {}}
		double[][] bluePoss = new double[16][2]; // 100�ڵ���ɫ��ȡֵ����Χ1~16������Ԫ��{ֵ,����/����}
		double[][] redPoss = new double[32][2];
		int p=0;
		
		// 4.2 ȡ��ɫ��{1~16, blueEleCount[i]}
		for(int i=0;i<bluePoss.length;i++) {
			bluePoss[i][0]=i+1; // ��һ��Ԫ�أ��±�0~15��ֵΪ1~16
			bluePoss[i][1]=blueEleCount[i]; // �ڶ���Ԫ�أ���Ӧ����ȡֵblue���ִ���
			// ��ȡ����
			double possibilityblue =bluePoss[i][1]/100.0; // ����Ԫ��ֵ��С�����ֽ�4�������Զ�ת��Ϊdouble8�ֽ�
//			System.out.println("������ʣ�"+possibilityblue);
			bluePoss[i][1]=possibilityblue; 
		}
		// Ԥ����ɫȡֵ�͸���
		System.out.println("��ɫ��1~16��ȡֵ�����ʣ���"+Arrays.deepToString(bluePoss));
		
		// 4.3 ȡ��ɫ��{1~33, redEleCount[i]}
		p=0;
		for(int i=0;i<redPoss.length;i++) {
			redPoss[i][0]=i+1;
			redPoss[i][1]=redEleCount[i]; 
			double possibilityred =redPoss[i][1]/100.0; 
//			System.out.println("������ʣ�"+possibilityred);
			redPoss[i][1]=possibilityred; 		
		}
		System.out.println("��ɫ��1~33��ȡֵ�����ʣ���"+Arrays.deepToString(redPoss));
		System.out.println("--------------------����ɫ����ɫ��ȡֵ�����ʣ� �� -------------------");

		// 5. ÿ��Ԫ�صĳ��ָ�������
		double temp = 0.0;
		// 5.1 �ݹ���ɫÿ������ĵ�2��Ԫ�أ�����С����ð������
		for(int i=0;i<bluePoss.length;i++) {
			for(int j=0;j<bluePoss[i].length;j++) {
				if(bluePoss[j]>bluePoss[j+1]) { // С��ֵ��ǰ�ߣ����ֵ������
					temp = bluePoss[j+1];
					bluePoss[j+1]=bluePoss[j];
					bluePoss[j]=temp;
				}
			}
		}
		// Ԥ��
		System.out.println("��ɫ��1~16��ȡֵ�����ʣ��������"+Arrays.deepToString(bluePoss));
		// 5.2 �ݹ��ɫ
		for(int i=0;i<redPoss.length;i++) {
			for(int j=0;j<redPoss[i].length;j++) {
				if(redPoss[j]>redPoss[j+1]) {
					temp = redPoss[j+1];
					redPoss[j+1]=bluePoss[j];
					redPoss[j]=temp;
				}
			}
		}
		System.out.println("��ɫ��1~33��ȡֵ�����ʣ��������"+Arrays.deepToString(redPoss));

		
		
		
		
		
		
		
		
		
	}
}
