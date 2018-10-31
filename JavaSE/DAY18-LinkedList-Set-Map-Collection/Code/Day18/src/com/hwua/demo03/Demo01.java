package com.hwua.demo03;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Demo01 {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<>();

		Random random = new Random();

		for (int i = 0; i < 50; i++) {
			Integer num = random.nextInt(6) + 30;
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		// -- Map 的内部接口Entry.
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
