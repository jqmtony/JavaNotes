package com.hwua.demo;

public class Demo06 {

	public static void main(String[] args) {
		int x =1,y=1;
		/*
		 * ++ == 和 & 三个的优先级是
		 * 	++ > == > &
		 *   先算 ++ 再算 == 最后算 &
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
