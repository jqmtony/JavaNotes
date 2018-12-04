import java.util.Scanner;

class triangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("输入行数：");
		int rows = scan.nextInt();
		int tr1 = rows/4;
		int tr2 = rows/2;
		int tr3 = rows*3/4;
		for(int i=1; i<=rows;i++) {
			
			// 输出4个三角形，找规律，更简单的可以合并的方式？
			if(i<=tr1) {
				for(int j=1; j<=i;j++) {
					System.out.print("*");
				}
			System.out.println("");
			}else if(i<=tr2){
				for(int j=0; j<=tr2-i;j++) {
					System.out.print("*");
				}
			System.out.println("");
			}else if(i<=tr3){
				for(int k=0; k<=tr3-i;k++) {
					System.out.print(" ");
				}
				for(int j=1; j<=i-tr2;j++) {
					System.out.print("*");
				}
			System.out.println("");
			}else{
				for(int k=1; k<=i-tr3;k++) {
					System.out.print(" ");
				}
				for(int j=0; j<=rows-i;j++) {
					System.out.print("*");
				}
			System.out.println("");
			}

			if(i==tr1){
				System.out.println("");
			}else if(i==tr2){
				System.out.println("");
			}else if(i==tr3){
				System.out.println("");
			}else{
				;
			}
		}
	}
}