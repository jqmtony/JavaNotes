package com.hwua.demo03;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack<String> ms = new MyStack<>(10);
		
		ms.push("A");
		ms.push("B");
		ms.push("C");
		ms.push("D");
		ms.push("E");
		
		int size = ms.size();
		for (int i = 0; i < size; i++) {
			System.out.println(ms.pop());
		}
		
		
		//-- 和上面效果一样
		for (int i = ms.size() - 1; i >= 0 ; i--) {
			System.out.println(ms.pop());
		}
		
		
		
		
		
		
		
		
	}
}
