package com.hwua.demo03;

import java.util.ArrayList;

public class MyStack<T> {
	
	private ArrayList<T> list;
	private int size;
	
	public MyStack() {
		list = new ArrayList<>();
	}
	
	public MyStack(int length) {
		list = new ArrayList<>(length);
	}
	
	public int size() {
		return list.size();
	}

	
	
	/**
	 * 入栈
	 * @param t
	 */
	public void push(T t) {
		list.add(t);
	}
	
	/**
	 * 出栈
	 * @return
	 */
	public T pop() {
		//-- 移除指定位置的元素
		return list.remove(list.size() - 1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
