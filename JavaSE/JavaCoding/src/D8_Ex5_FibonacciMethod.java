import java.util.Arrays;

/*
 * 	4.	�Ʋ���������ʹ�÷�����ʵ��
 */
public class D8_Ex5_FibonacciMethod {
	public static void main(String[] args) {
		int[] array = new int[30];
		fibonacciMethod(array);
		System.out.print(Arrays.toString(array));
	}

	private static void fibonacciMethod(int[] array) {
		// TODO Auto-generated method stub
		// 1,1,2,3,5..... n3=n1+n2;
		for(int i=0;i<array.length-1;i++) {
			if(i==0 || i==1) {
				array[i] = 1; 
			}else { // �ӵ�3������ʼ
				array[i] = array[i-1]+array[i-2]; // ����������ǰ��λ��֮��
			}
		}
	}
	
}
