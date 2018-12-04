package com.hwua.demo04;

public class Demo02 {

	public static void main(String[] args) {
			Demo02 d = new Demo02();
			System.out.println(d.method(null));
	}
	@SuppressWarnings("finally")
	public int method(String str) {
		try {
			System.out.println(1);
			System.out.println(str.length());
			System.out.println(2);
			return 3;
		} catch (NullPointerException e) {
			System.out.println(4);
			return 5;
		} catch (Exception e) {
			System.out.println(6);
			return 7;
		} finally {
			System.out.println(8);
			return  9;
		}
	}
}
