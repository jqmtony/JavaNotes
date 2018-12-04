/**
 * 
 */
package com.hwua.demo01;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		//-- 1.101-200  之间的所有的素数
		boolean flag = true;
		for (int i = 101; i <= 200; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}else {
					flag = false;
				}
			}
			if (!flag) {
				System.out.println(i);
			}
		}
		
		//-- 输入两个数m和n求两个数的最小公倍数和最大公约数
		int a,b,num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:\t");
		a = scan.nextInt();
		System.out.println("Enter Number:\t");
		b = scan.nextInt();
		num = deff(a, b);
		System.out.println("最大公倍数:\t" + num);
		System.out.println("最小公约数:\t" + (a*b/num));		
	}	
		
	static int deff(int x,int y) {
		int t = 0;
		if (x < y) {
			t = x;
			x = y;
			y = t;
		}		
		while(y != 0) {
			if (x == y) {
				return x;
			}else {
				int z = x%y;
				x = y;
				y = z;
			}
			
		}
		return x;
	}
	
	
}
