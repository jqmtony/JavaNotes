/**
 * 
 */
package com.hwua.demo02;

/**
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		char[] array = {'h','e','l','l','o','w','o','r','l','d'};
		/*
		 * 
		 * offset       : Æ«ÒÆÁ¿
		 * count/length : ³¤¶È
		 */
		String str = new String(array,3,5);
		System.out.println(str);
	}

}
