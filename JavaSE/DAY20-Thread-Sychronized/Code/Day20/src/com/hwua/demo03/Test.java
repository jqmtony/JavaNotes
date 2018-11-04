/**
 * 
 */
package com.hwua.demo03;

/**
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Peach p = new Peach(100);
		
		Monkey m1 = new Monkey(p,"线程1");
		Monkey m2 = new Monkey(p,"线程2");
		Monkey m3 = new Monkey(p,"线程3");
		
		m1.start();
		m2.start();
		m3.start();
		
	}
}
