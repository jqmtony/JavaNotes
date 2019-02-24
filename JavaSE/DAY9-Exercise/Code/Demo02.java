import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入行数");
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
			// -- 负责打印星号前的空格
			for (int k = 1; k < line - i; k++) {
				System.out.print(" ");
			}
			// -- 负责打印星号
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
		
		//-- 负责控制打印第几行
		for (int i = 0 ; i < line ; i++) {
			//-- 负责打印每行前的空格
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//-- 负责打印每行中的星号
			for (int k = 0; k < line - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scan.close();
	}

}
