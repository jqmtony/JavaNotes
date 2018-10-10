/*
	3. 从键盘输入三角形的底和高，并输出三角形的面积。
*/

import java.util.Scanner;

public class hw3_Striangle {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	//-- 输入底和高
	System.out.println("输入三角形的底");
	int border = scan.nextInt();
	System.out.println("输入三角形的高");
	int height = scan.nextInt();
	//-- 计算三角形的面积
	System.out.println("(底)"+border+"*(高)"+height+"÷2="+border*height/2);
	}
}