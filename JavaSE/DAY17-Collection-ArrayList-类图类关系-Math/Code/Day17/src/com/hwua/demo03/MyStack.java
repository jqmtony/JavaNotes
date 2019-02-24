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
	 * ��ջ
	 * @param t
	 */
	public void push(T t) {
		list.add(t);
	}
	
	/**
	 * ��ջ
	 * @return
	 */
	public T pop() {
		//-- �Ƴ�ָ��λ�õ�Ԫ��
		return list.remove(list.size() - 1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
