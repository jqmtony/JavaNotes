package com.hwua.demo;

public class Demo04 {

	public static void main(String[] args) {
		
		// ? :   三目运算符
		//-- 布尔值表达式 ? 表达式1 : 表达式2
		int i = 0 , j = 0 ;
		boolean result = i > j ? true : false;
		System.out.println(result);
		//-- 等价于
		if (true) {
			//-- 表达式1
		}else {
			//-- 表达式2
		}
	}
}
