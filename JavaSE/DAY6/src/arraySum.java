import java.util.Arrays;
import java.util.Scanner;

public class arraySum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arraySum = {8,4,2,1,23,344,12};
		int sum = 0;
		boolean result = false;
		
		// ѭ��������Ƽ�ʹ��for-each
//		for(int i=0;i<arraySum.length;i++) {
//			sum = sum + arraySum[i];
//		}
		for(int i: arraySum) { // һ��Ҫע��i��Ԫ�أ������±꣡
			sum += i;
		}
		System.out.println("�ͣ�\t"+sum);
		
		// ������Ϸ
		System.out.print("����������һ�����ݣ�");
		int guess = scan.nextInt();
		int index = 0;
		for(int i: arraySum) {
			if(guess==i) {
				System.out.println("������Ԫ�أ��±�Ϊ��\t"+index);
				break;
//				continue; // ������ǰѭ�������Ը���������ְ���������� ���൱��û��д
			}index ++;
		}
	}
}
