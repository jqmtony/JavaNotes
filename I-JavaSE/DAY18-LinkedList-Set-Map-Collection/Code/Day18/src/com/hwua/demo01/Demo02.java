package com.hwua.demo01;

import java.util.Set;
import java.util.TreeSet;

public class Demo02 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		System.out.println(set.add("A"));
		System.out.println(set.add("B"));
		System.out.println(set.add("C"));
		System.out.println(set.add("D"));
		
		System.out.println(set.add("A"));
		System.out.println(set.add("B"));
		System.out.println(set.add("C"));
		System.out.println(set.add("D"));
		//-- 根据add的返回值可以知道放入是成功的还是失败的.
		System.out.println(set.size());
	}
}
