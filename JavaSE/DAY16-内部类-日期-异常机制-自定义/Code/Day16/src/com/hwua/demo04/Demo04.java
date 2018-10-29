package com.hwua.demo04;

import java.util.Scanner;

public class Demo04 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] array1 = null;
		boolean flag = true;
		while(true) {
			System.out.println("Enter Five Number:\t");
			flag = true;
			String str = scan.nextLine();
			String[] array = str.split(",");
			try {
				if (array.length < 5) {
					throw new ArrayIndexOutOfBoundsException();
				}
			} catch (Exception e1) {
				System.out.println("���鳤�Ȳ���5,��������");
				continue;
			}
			array1 = new int[array.length];
			
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
				try {
					array1[i] = Integer.parseInt(array[i]);
				} catch (NumberFormatException e) {
					System.out.println("����������");
					flag = false;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		
		System.out.println("-----------------");
		for (int i : array1) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		scan.close();
		
	}

}
