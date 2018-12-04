package com.hwua.demo01;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Demo03 {

	public static void main(String[] args) {
		//-- ʹ��Set��ʵ��6�����ظ��ĺ��� 1-33
		Set<Integer> set = new TreeSet<>();
		Random random = new Random();
	
		for (int i = 0; i < 6; i++) {
			int num = random.nextInt(33) + 1;
			if (!set.add(num)) {
				i --;
			}
		}
		System.out.println("----------");
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
