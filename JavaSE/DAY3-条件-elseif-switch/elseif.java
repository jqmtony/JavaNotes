/*
	12.企业发放的奖金根据利润提成。
	a 利润(I)低于或等于10万元时，奖金可提10%；
	b 利润高于10万元，低于20万元时，
	低于10万元的部分按10%提成，
	高于10万元的部分，可可提成7.5%；
	c 20万到40万之间时，高于20万元的部分，可提成5%；
	d 40万到60万之间时高于40万元的部分，可提成3%；
	e 60万到100万之间时，高于60万元的部分，可提成1.5%，
	f 高于100万元时，超过100万元的部分按1%提成，
	从键盘输入当月利润I，求应发放奖金总数？
*/
import java.util.Scanner;

public class elseif {
	public static void main(String[] args) {
		//-- 创建Scanner
		Scanner scan = new Scanner(System.in);
		//-- 输入企业利润
		System.out.print("企业利润为：");
		double i = scan.nextInt();
		//-- 利润计算的规律
		double a = i * 0.1;
		double b = 10 * 0.1 + (i - 10) * 0.75;
		double c = 10 * 0.1 + 10 * 0.75 + (i-20) * 0.05;
		double d = 10 * 0.1 + 10 * 0.75 + 20 * 0.5 + (i - 40) * 0.03;
		double e = 10 * 0.1 + 10 * 0.75 + 20 * 0.5 + 20 * 0.03 + (i - 60) * 0.015;
		double f = 10 * 0.1 + 10 * 0.75 + 20 * 0.5 + 20 * 0.03 + 20 * 0.015 + (i - 100) * 0.01;
		
		double extra = 0.0;
		//-- 计算利润提成
		if(i <= 10) {
			System.out.println(a);
		}else if(i < 20) {
			System.out.println(b);
		}else if(i < 40) {
			System.out.println(c);
		}else if(i < 60) {
			System.out.println(d);
		}else if(i < 100) {
			System.out.println(e);
		}else {
			System.out.println(f);
		}
	}
}