package com.hwua.demo;

public class Demo06 {

	public static void main(String[] args) {
		int x =1,y=1;
		/*
		 * ++ == �� & ���������ȼ���
		 * 	++ > == > &
		 *   ���� ++ ���� == ����� &
		 *   false & true
		 *
		 */
		if(x++==2 & ++y==2)
		{
			x=7;
		}
		System.out.println("x="+x+"  ,  y="+y);

	}
}
