package com.hwua.demo01;

import java.util.LinkedList;

/**
 * LinekdList
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(2, 3);
		list.addFirst(4);//4123
		list.addFirst(5);//54123
		list.addLast(6);//541236
		list.add(7);//5412367
		list.add(7, 8);//54123678
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
		list.removeFirst();
		list.removeLast();
	}
}
