package com.hwua.test;

/**
 *  ' ������ʽ����
 * @author Administrator
 *
 */
public class RegexTest {

	public static void main(String[] args) {
		
		
		String str = "A_1234_";
		//�û����������.matches("������ʽ")
		String regex = "[A-Z]{1}[0-9a-zA-Z_]{5,9}";
		System.out.println(str.matches(regex));
		
		
		
		
		
		
		
		
		
	}
}
