import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author Administrator
 *
 */
public class Demo06 {
	// -- Ŀ��:���� ѭ�� ���� ����� ���ظ� ͳ�ƴ�����ϰ
	// -- ���ⲹ��֪ʶ��:double���͵������ʽ(����д��.����ֻ��һ��)

	public static void main(String[] args) {
		// -- 1.�ṩһ������ 100����lottery��������100��Ԫ��.��ÿһ��Ԫ�ػ���һ������.�����������7��Ԫ��
		int[][] lottery = new int[100][7];
		// -- 2.�ṩRandom
		Random random = new Random();
		// -- 3.���������Ԫ��
		// -- 3.1 ��lottery��100��Ԫ�ظ�ֵ
		for (int i = 0; i < lottery.length; i++) {
			// -- 3.2 ��lottery���±�Ϊi��Ԫ�ؽ��и�ֵ
			for (int j = 0; j < lottery[i].length; j++) {
				if (j == 6) {
					// -- ��������
					lottery[i][j] = random.nextInt(16) + 1;
				} else {
					// -- �������
					lottery[i][j] = random.nextInt(33) + 1;
					// -- �Ժ����ֵ������֤��֤һ���ڲ������ظ���Ԫ��
					for (int k = 0; k < j; k++) {
						if (lottery[i][k] == lottery[i][j]) {
							j--;
							break;
						}
					}
				}
			}
		}
		// -- Ԥ��100�ڲ�Ʊ����.HashCode().��ϣ��
		// System.out.println(Arrays.toString(lottery));
		// System.out.println(Arrays.deepToString(lottery));
		/*
		 * int i = 0;
		 * 
		 * for (int[] stage : lottery) { System.out.print("��" + (++i) + "�ڲ�Ʊ,������:\t");
		 * for (int ele : stage) { System.out.print(ele + " "); } System.out.println();
		 * }
		 */
		// -- 4.ͳ��������Ԫ�صĳ��ִ���

		// -- 4.1 �ṩ��Ӧ�����ȡֵ��Χ�������ȡֵ��Χ
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

		// -- 4.2 ��ʾ100�������е�������ֵĴ���
		int blueCount = 0;
		for (int i : blueBalls) {
			System.out.println(i);
			blueCount += i;
		}
		System.out.println("���е�����������:\t" + blueCount);

		int redCount = 0;
		for (int i : redBalls) {
			System.out.println(i);
			redCount += i;
		}
		System.out.println("���еĺ���������:\t" + redCount);

		// -- 5.�����ÿ����������ÿ�������ֵĸ���.
		double[][] redPro = new double[33][2];
		double[][] bluePro = new double[16][2];
		// {{Ԫ�ر���,Ԫ�صĸ���}
		// -- 5.1 ������
		// -- ȡһ������ blueBalls������±�+1 ��������.�±�����Ӧ�������ǳ��ֵĴ���
		for (int i = 0; i < blueBalls.length; i++) {
			// -- ��i+1���������.���ֵĸ���
			double pro = blueBalls[i] / 100.0;
			// -- ���ʺ��������bluePro����
			bluePro[i][0] = i + 1;
			bluePro[i][1] = pro;
		}

		// -- 5.2 �����
		for (int i = 0; i < redBalls.length; i++) {
			// -- ��i+1���������.���ֵĸ���
			double pro = redBalls[i] / 100.0;
			// -- ���ʺ��������bluePro����
			redPro[i][0] = i + 1;
			redPro[i][1] = pro;
		}
		System.out.println("----------");

		// -- 5.3 ��ʾ����
		System.out.println(Arrays.toString(blueBalls));
		System.out.println(Arrays.deepToString(bluePro));

		// -- 6.����
		// -- 6.1 ����������
		for (int i = 0; i < bluePro.length - 1; i++) {
			for (int j = 0; j < bluePro.length - 1 - i; j++) {
				// bluePro[j] = {Ԫ��,����}
				double[] temp = {};
				if (bluePro[j][1] > bluePro[j + 1][1]) {
					temp = bluePro[j];
					bluePro[j] = bluePro[j + 1];
					bluePro[j + 1] = temp;
				}
			}
		}
		// -- 6.2 ��ӡ�����Ľ��
		System.out.println(Arrays.deepToString(bluePro));

		// -- 6.3 �Ժ�������
		for (int i = 0; i < redPro.length - 1; i++) {
			for (int j = 0; j < redPro.length - 1 - i; j++) {
				// bluePro[j] = {Ԫ��,����}
				double[] temp = {};
				if (redPro[j][1] > redPro[j + 1][1]) {
					temp = redPro[j];
					redPro[j] = redPro[j + 1];
					redPro[j + 1] = temp;
				}
			}
		}
		// -- 6.4 ��ӡ�����Ľ��
		System.out.println(Arrays.deepToString(redPro));
	}
}
