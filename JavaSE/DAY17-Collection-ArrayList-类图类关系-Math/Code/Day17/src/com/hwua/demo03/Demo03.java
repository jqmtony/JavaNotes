package com.hwua.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo03 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			list.add(random.nextInt(6) + 30);
		}		
		//-- 1.排序
		Collections.sort(list);
	
		int startIndex = 0;
		int endIndex = 0;
		
		while(startIndex < list.size()) {			
			int temp = list.get(startIndex);
			//-- 求元素第一次出现的下标
			startIndex = list.indexOf(temp);
			//System.out.println("startIndex:\t" + startIndex);
			//-- 求元素最后一次出现的下标
			endIndex = list.lastIndexOf(temp);
			//System.out.println("endIndex:\t" + endIndex);
			System.out.println("temp:\t" + temp + "个数:\t" + (endIndex - startIndex + 1));
			startIndex = endIndex + 1;
		}
	}

}
