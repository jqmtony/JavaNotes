package com.hwua.test;

/**
 *  ' 正则表达式测试
 * @author Administrator
 *
 */
public class RegexTest {

	public static void main(String[] args) {
		
		
		String str = "A_1234_";
		//用户输入的内容.matches("正则表达式")
		String regex = "[A-Z]{1}[0-9a-zA-Z_]{5,9}";
		System.out.println(str.matches(regex));
		
		
		
		
		
		
		
		
		
	}
}
