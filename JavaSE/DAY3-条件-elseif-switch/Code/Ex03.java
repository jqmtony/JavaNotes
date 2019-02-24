import java.util.Scanner;
/*
	三角形的面积公式:
		S = 1/2 a(底)h(高)
 */
class Ex03{
	public static void main(String[] args){
		//-- 1.导包
		//-- 2.先提供Scanner
		Scanner scan = new Scanner(System.in);
		//-- 3.再录入底和高
		System.out.println("输入三角形的底");
		int i = scan.nextInt();
		System.out.println("输入三角形的高");
		int j = scan.nextInt();
		//-- 4.使用三角形面积公式求得面积
		int area = i*j*1/2;
		//double area = i*j*0.5;
		//-- 5.输出面积		
		System.out.println("Area:\t" + area);
	}

}