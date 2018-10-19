package com.hwua.demo;

public class Demo02 {

	public static void main(String[] args) {
		
		int i = 100;
		while (true) {
			if (i++ > 100) {
				System.out.println("1");
				//-- 当且仅当 if或者for或者while等.中只有1条语句时,可以省略大括号
				break;
			}
			System.out.println(i);
			
		}
		
	}
}
