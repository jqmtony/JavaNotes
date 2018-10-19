package com.hwua.demo;

public class Demo03 {
	public static void main(String[] args) {
		int i = 1;
		while (++i <= 10) {//2-10
			System.out.println(i);
		}
		i = 1;
		while (i++ <= 10) {//2-11
			//-- 1.i = 1 ,i <= 10 成立.
			//-- 2.i ++
			//-- 3.进入循环体
			//-- 4.打印i的值.
			System.out.println(i);
		}
		
		System.out.println("----------------");
		for (int j = 1; j <= 10; ) {
			j++;
			System.out.println(j);
			
		}
		System.out.println("----------------");
		for (int j = 1; ++j <= 10; ) {
			System.out.println(j);	
		}
		
		int [] arr=new int[]{3,4,5,6};
		//-- 凡是可以自动转换的都可以放在一起
		int [] arr1={'a', 23 , 45 , 6};
	}

}












