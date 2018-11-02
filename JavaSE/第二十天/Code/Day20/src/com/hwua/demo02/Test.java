/**
 * 
 */
package com.hwua.demo02;

/**
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Account a = new Account();
		a.setId(1);
		a.setBalance(500);
		
		WorkThread wt = new WorkThread(a);
		
		Thread t1 = new Thread(wt,"线程1");
		Thread t2 = new Thread(wt,"线程2");
		
		t1.start();
		t2.start();
		
		
	}
}
