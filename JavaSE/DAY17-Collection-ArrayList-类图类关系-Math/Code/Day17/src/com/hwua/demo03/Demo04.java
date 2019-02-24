package com.hwua.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Demo04 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			list.add(random.nextInt(6) + 30);
		}
		
		for (Integer i : list) {
			System.out.print(i+" ");
		}
		
		System.out.println("---------------");
		Integer temp = 30;
		int oldSize = list.size();
		while (list.size() >= 0 && temp <= 35) {
			//-- 判断是否包含指定元素
			if (list.contains(temp)) {
				//-- 如果temp是int会认为是下标的.所以必须强调是引用数据类型
				//-- 因为集合中只能放引用.
				list.remove(temp);
			}else {
				int newSize = list.size();
				System.out.println("temp:\t" + temp + "次数:\t" +(oldSize - newSize));
				oldSize = newSize;
				temp ++;				
			}
		}
	}
}
