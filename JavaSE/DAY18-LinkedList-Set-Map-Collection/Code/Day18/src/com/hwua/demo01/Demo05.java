package com.hwua.demo01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Demo05 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			list.add(random.nextInt(21) + 5);
		}
		
		//-- 想要对List进行排序 只能排序
		//Collections.sort(list);
		
		//-- 不仅需要排序还需要把重复的去掉.
		Set<Integer> set = new TreeSet<>(list);
		
		for (Integer i : set) {
			System.out.println(i);
		}
		
	}
}
