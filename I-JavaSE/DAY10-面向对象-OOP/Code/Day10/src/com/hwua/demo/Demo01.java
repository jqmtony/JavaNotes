package com.hwua.demo;
//-- 测试字符串和加号
public class Demo01 {

	public static void main(String[] args) {
		//-- 加号是左结合 从左向右运算.
		System.out.println(1+""+2);//12
		System.out.println(1+2+"");//3
		System.out.println(""+1+2);//12
		//-- 想把一个内容变成字符串.最简单的方式就是加双引号.
		System.out.println(""+'a'+1);
	}
}
