package com.hwua.demo;

public class Demo05 {

	public static void main(String[] args) {
		
		int i = 1; 
		int j = 1;
		//-- & 按位位 每个位上都为1的时候为1.
		/*
		 * 把1 转成二进制  1  
		 *             1
		 *             
		 *             
		 */
		System.out.println(i & j);
		
		i = 5;
		j = 3;
		/*
		 * 5 转成2进制
		 * 		101
		 * 3 转成2进制
		 * 		1*2^1 + 1*2^0
		 * 		 11
		 * 
		 * 			001
		 */
		System.out.println(i & j);
		
		
		/* 5的二进制		101   
		 * 3的二进制          011
		 * 5|3的结果		111
		 *  
		 */
		i = 5;
		j = 3;
		System.out.println(i|j);
		
		
		i = 5;
		j = 3;
		/*
		 *  5的二进制   101
		 *  3的二进制   011
		 *  5^3的结果   110   6
		 * 
		 */
		System.out.println(i ^ j);
		
		
		i = 5;
		j = 3;
		/*
		 *   5的二进制	0000 0101
		 *   ~5的结果        1111 1010  -6
		 *  
		 */
		//-- 一元运算符
		System.out.println(~i);
		
		//-- 2* 2^3
		System.out.println(2<<3);
		
		//-- 2/2^3
		System.out.println(-100 >> 2);
		
		//-- 正数和上面一样.负数略有区别.无符号右移..符号指的是正负号
		System.out.println(-100 >>> 2);
		
		
		System.out.println("---------------");
		System.out.println(true & false);
		System.out.println(true | false);
		System.out.println(true ^ false);
		
	}
}
