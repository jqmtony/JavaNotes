package com.hwua.demo01;

import java.util.TreeSet;

public class Demo04 {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < 10; i++) {
			ts.add(i);
		}
		//-- ȡ��һ��ֵ
		System.out.println(ts.first());
		
		//-- ��������֤Ԫ���Ƿ���set�д���.
		System.out.println(ts.ceiling(1));
		
		//-- ȡ���һ��ֵ
		System.out.println(ts.last());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
