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
		//-- ����add�ķ���ֵ����֪�������ǳɹ��Ļ���ʧ�ܵ�.
		System.out.println(set.size());
	}
}
