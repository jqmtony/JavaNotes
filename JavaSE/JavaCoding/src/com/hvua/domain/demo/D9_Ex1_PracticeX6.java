import java.util.Arrays;
import java.util.Scanner;

import org.w3c.dom.css.ElementCSSInlineStyle;

/*
 * 	��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
 */
 
public class D9_Ex1_PracticeX6 {
	public static void main(String[] args) {
		// ����Scanner
		Scanner scan = new Scanner(System.in);
		
		// ��Ŀ1������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
//		System.out.println("����һ���ַ���");
//		String input = scan.nextLine();
//		matchStr(input);
		
		// ��Ŀ2��һ�����ӵ�3���¿�ʼÿ����һ�����ӣ�����������Ҳһ������ôÿ��������
		int month = 24;
		rabbitFamily(month);
		
		// ��Ŀ3��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
		// �����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
		int height = 100;
//		heightFlow(height);
		
		// ��Ŀ4����Ŀ����1��2��3��4�ĸ����֣�
		// ����ɶ��ٸ�������ͬ��һ�����������ظ����ֵ���λ�����������Ƕ����롣   
//		noRepeat3d() ;
		
		// ��Ŀ5�����ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬
		// ����񫣬�ֶ����һ�����ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
		// �Ժ�ÿ�����϶�����ǰһ��ʣ�� ��һ���һ����
		// ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�   
		int lastPeach = 1;
		monkeyPeach(lastPeach);
		
	} // main end


	private static void monkeyPeach(int lastPeach) {
		int[] array = new int[10];
		for (int i = array.length-1; i >=0; i--) {
			if(i==array.length-1) {
				array[i]= lastPeach; 
			}else {
				array[i] = (array[i+1]+1)*2; // ��9������� = ( ��10�������+1 ��* 2
			}
			System.out.println("�� "+(i+1)+" �칲�� "+array[i]+" ������");
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
		System.out.println("��λ�����ظ���һ���У�"+count);
	}

	private static void heightFlow(int height) {
		double[] array = new double[10];
		double jump = 0.0;
		for (int i = 0; i < array.length; i++) {
			if(i==0) {
				array[i] =50; // ��1�η����ĸ߶�
			}else {
				array[i] = array[i-1] / 2;
			}
			jump = jump + array[i]*2; 
		}
		System.out.println("���� ��10�����ʱ�������������ף�"+(jump+100));
		System.out.println("���� ��10�����ʱ����10�η�����ߣ�"+array[array.length-1]);
		// ���� ��10�����ʱ�������������ף�299.8046875
		// ���� ��10�����ʱ����10�η�����ߣ�0.09765625
	} 


	private static void rabbitFamily(int month) {
		int[] rabbitsArray = new int[month];  // ���Ӽ������10����
		for (int i = 0; i <rabbitsArray.length; i++) { // 0���ǵ�1���£���1������
			if(i==0 || i==1) {
				rabbitsArray[i] = 2;  // ��3������2�����ӣ�4ֻ
			}else {
				rabbitsArray[i] = rabbitsArray[i-1]+rabbitsArray[i-2];
			}
			System.out.println("��"+(i+1)+"���µ���������Ϊ"+rabbitsArray[i]);
		}
	}

	// ����1
	public static void matchStr(String input) {
		// ��ȡ�ַ�
		
		int sum_abc = 0;
		int sum_blank = 0;
		int sum_num = 0;
		int sum_other = 0;
		char[] charArray = input.toCharArray();
		int charASCII = 0;
		for (int i = 0; i < charArray.length-1; i++) { // �ַ�����ı���
			charASCII = (int)charArray[i];
			// Ӣ���ַ��룺97~122,65~90
			if((charASCII>=97&&charASCII<=122) || (charASCII>=65&&charASCII<=90)) { 
				sum_abc += 1;
			}else if(charASCII>=48&&charASCII<=59) { // �����ַ��룺48~59
				sum_num += 1;
			}else if(charASCII==32) { // �ո�32
				sum_blank += 1; 
			}else {
				sum_other +=1;
			}
		}

		System.out.println("��ĸ������"+sum_abc);
		System.out.println("����������"+sum_num);
		System.out.println("�ո�������"+sum_blank);
		System.out.println("�����ַ�������"+sum_other);
		System.out.println("Ԥ���ַ����飺"+Arrays.toString(charArray));
	} // end
	
	
}
