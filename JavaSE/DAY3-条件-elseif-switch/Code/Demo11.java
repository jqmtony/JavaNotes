import java.util.Scanner;
class Demo11{
	public static void main(String[] args){
		/*
			利润I
			0<i<=10   10%
			10<i<20	  10*0.1 + (i-10)*0.075
			20<=i<40  10*0.1 + 10*0.075 + (i-20)*0.05
			40<=i<60  10*0.1 + 10*0.075 + 20*0.05 + (i-40)*0.03
			60<=i<100 10*0.1 + 10*0.075 + 20*0.05 + 20*0.03 + (i-60)*0.015
			i>=100    10*0.1 + 10*0.075 + 20*0.05 + 20*0.03 + 40*0.015 + (i-100)*0.01
		 */
		 
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入利润(单位:万)");
		double i = scan.nextDouble();
		double salary = 0;
		if(i >0 && i <= 10){
			salary = i * 0.1;
		}else if(i < 20){
			salary = 10*0.1 + (i-10)*0.075;
		}else if(i < 40){
			salary = 10*0.1 + 10*0.075 + (i-20)*0.05;
		}else if(i < 60){
			salary = 10*0.1 + 10*0.075 + 20*0.05 + (i-40)*0.03;
		}else if(i < 100){
			salary = 10*0.1 + 10*0.075 + 20*0.05 + 20*0.03 + (i-60)*0.015;
		}else{
			salary = 10*0.1 + 10*0.075 + 20*0.05 + 20*0.03 + 40*0.015 + (i-100)*0.01;
		}
		
		System.out.println("奖金:\t" + salary);
		
	}
}