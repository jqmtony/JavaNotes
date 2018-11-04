/**
 * 
 */
package com.hwua.demo01;

/**
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		Thread t = new Thread("线程1");
		t.setName("线程2");
		System.out.println(t.getName());
		
		//-- 1.获取当前线程对象 main线程也是主线程.就是main方法所在的线程.
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		
		//-- 2.让当前线程休息一会
		System.out.println(System.currentTimeMillis());
		try {
			//-- 通过sleep方法让线程休眠指定的时间
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis());

	}
}
