package com.hwua.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Demo05 {

	public static void main(String[] args) {
		//Ctrl + Shift + O 自动导包
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			list.add(random.nextInt(6) + 30);
		}
			
		ArrayList<Integer> temp = new ArrayList<>();
		int num = 30;
		while(list.size() > 0) {
			temp.add(num);
			int oldSize = list.size();
			//-- 从list中移除temp中所包含的所有元素.
			list.removeAll(temp);
			int newSize = list.size();
			System.out.println("num:\t" + num + "次数:\t" +(oldSize - newSize));
			num ++;
			//-- 清空temp中的所有数据.(理论上可以不清空的.)
			temp.clear();
		}
		
		
		
		
		
		
		
		
		
	}
}
