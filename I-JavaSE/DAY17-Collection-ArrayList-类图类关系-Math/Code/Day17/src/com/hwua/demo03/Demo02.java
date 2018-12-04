package com.hwua.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			list.add(random.nextInt(6) + 30);
		}
		for (Integer i : list) {
			System.out.println("i:\t"+i);
		}
		
		System.out.println("------------------------------");
		//-- 求list中元素为30的重复次数
		System.out.println(Collections.frequency(list, 30));
		System.out.println(Collections.frequency(list, 31));
		System.out.println(Collections.frequency(list, 32));
		System.out.println(Collections.frequency(list, 33));
		System.out.println(Collections.frequency(list, 34));
		System.out.println(Collections.frequency(list, 35));
	}

}
