package com.hwua.demo04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = null;
		//--  把可能会产生异常的代码放到try中
		try {
			System.out.println("Enter Number:");	
			//-- 这里一旦产生了异常.就直接进入与之对应的catch模块.
			//-- try中剩余的语句是不会执行的.
			//-- 如果没有与之对应的catch就找Exception.如果连Exception都找不到
			//-- 则直接把错误抛出
			scan.nextInt();
			System.out.println(str.length());
		}catch (InputMismatchException e)  {
			System.out.println("捕获到了1");
		}catch (NullPointerException e) {
			System.out.println("捕获到了2");
		}catch (Exception e) {
			System.out.println("捕获到了3");
		}
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
	}
}
