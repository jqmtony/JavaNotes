import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("����������");
		int line = scan.nextInt();

		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < line; i++) {
			for (int j = line; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < line; i++) {
			// -- �����ӡ�Ǻ�ǰ�Ŀո�
			for (int k = 1; k < line - i; k++) {
				System.out.print(" ");
			}
			// -- �����ӡ�Ǻ�
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * 
		 * ***
		 *  **
		 *   * 
		 * 
		 * 
		 */
		
		//-- ������ƴ�ӡ�ڼ���
		for (int i = 0 ; i < line ; i++) {
			//-- �����ӡÿ��ǰ�Ŀո�
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//-- �����ӡÿ���е��Ǻ�
			for (int k = 0; k < line - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scan.close();
	}

}
