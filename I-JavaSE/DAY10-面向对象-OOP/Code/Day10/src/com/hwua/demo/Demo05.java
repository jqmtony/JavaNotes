package com.hwua.demo;

public class Demo05 {

	public static void main(String[] args) {
		
		int i = 1; 
		int j = 1;
		//-- & ��λλ ÿ��λ�϶�Ϊ1��ʱ��Ϊ1.
		/*
		 * ��1 ת�ɶ�����  1  
		 *             1
		 *             
		 *             
		 */
		System.out.println(i & j);
		
		i = 5;
		j = 3;
		/*
		 * 5 ת��2����
		 * 		101
		 * 3 ת��2����
		 * 		1*2^1 + 1*2^0
		 * 		 11
		 * 
		 * 			001
		 */
		System.out.println(i & j);
		
		
		/* 5�Ķ�����		101   
		 * 3�Ķ�����          011
		 * 5|3�Ľ��		111
		 *  
		 */
		i = 5;
		j = 3;
		System.out.println(i|j);
		
		
		i = 5;
		j = 3;
		/*
		 *  5�Ķ�����   101
		 *  3�Ķ�����   011
		 *  5^3�Ľ��   110   6
		 * 
		 */
		System.out.println(i ^ j);
		
		
		i = 5;
		j = 3;
		/*
		 *   5�Ķ�����	0000 0101
		 *   ~5�Ľ��        1111 1010  -6
		 *  
		 */
		//-- һԪ�����
		System.out.println(~i);
		
		//-- 2* 2^3
		System.out.println(2<<3);
		
		//-- 2/2^3
		System.out.println(-100 >> 2);
		
		//-- ����������һ��.������������.�޷�������..����ָ����������
		System.out.println(-100 >>> 2);
		
		
		System.out.println("---------------");
		System.out.println(true & false);
		System.out.println(true | false);
		System.out.println(true ^ false);
		
	}
}
