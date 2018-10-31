package com.hwua.demo01;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		/**
		 * 对象创建出来的同时.红球和蓝球就已经完成赋值了
		 */
		//-- 生成100期彩票
		ArrayList<Lottery> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(new Lottery(i+1));
		}
		
		//-- 打印100期彩票信息
		Iterator<Lottery> iter = list.iterator();
		while (iter.hasNext()) {
			Lottery lottery = iter.next();
			System.out.println(lottery);
		}
		
		//-- 获取100期中所有的红球数
		ArrayList<Integer> reds = new ArrayList<>();
		//-- 获取100期中的所有的蓝球数
		ArrayList<Integer> blues = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			reds.addAll(list.get(i).getReds());
			blues.add(list.get(i).getBlue());
		}
		
		//-- 求每个红球的出现次数
		//-- 求每个蓝球的出现次数
	
	}
}
