/*
	3. �Ӽ������������εĵ׺͸ߣ�����������ε������
*/

import java.util.Scanner;

public class hw3_Striangle {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	//-- ����׺͸�
	System.out.println("���������εĵ�");
	int border = scan.nextInt();
	System.out.println("���������εĸ�");
	int height = scan.nextInt();
	//-- ���������ε����
	System.out.println("(��)"+border+"*(��)"+height+"��2="+border*height/2);
	}
}