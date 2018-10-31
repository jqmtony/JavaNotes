package com.hwua.demo01;

import java.util.TreeSet;

public class Demo04 {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < 10; i++) {
			ts.add(i);
		}
		//-- 取第一个值
		System.out.println(ts.first());
		
		//-- 类似于验证元素是否在set中存在.
		System.out.println(ts.ceiling(1));
		
		//-- 取最后一个值
		System.out.println(ts.last());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
