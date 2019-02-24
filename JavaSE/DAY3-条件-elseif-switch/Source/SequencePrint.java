import java.util.Scanner;

/*
	2.	在控制台从键盘输入三个整数，按照从大到小的顺序输出
*/

class SequencePrint {
	public static void main(String[] args) {
		// 1.导包
		// 2.创建Scanner
		Scanner scan = new Scanner(System.in);
		// 3.提示输入三个整数
		System.out.print("请输入第一个整数：");
		int a = scan.nextInt();
		System.out.print("请输入第二个整数：");
		int b = scan.nextInt();
		System.out.print("请输入第三个整数：");
		int c = scan.nextInt();
		// 4.比较大小
		int max = 0;
		int min = 0;
		int mid = 0;
		if(a>b){
			if(a>c){
				if(b>c){
					max = a;
					mid = b;
					min = c;
				}
			}
		}else{
			if(a>c){ //b,a,c
				max = b;
				mid = a;
				min = c;
			}else if(b>c){ 
				max = b;
				mid = c;
				min = a;
			}else{
				max = c;
				mid = b;
				min = a;
			}
		}
		// 5.从大到小顺序输出
		System.out.println("按顺序从小到大输出："+max+mid+min);
		System.out.println(toString(max));
		// 6.如何让结果以 a:1, b:2, c:3这样出现
		
	}
}








