/**
 * 
 */
package com.hwua.demo01;

/**
 * @author Administrator
 *
 */
public class Demo01 {
	/**
	 * ' 通过继承Thread来定义一个线程类
	 * 
	 * @author Administrator
	 *
	 */
	class MyThread1 extends Thread {

		public MyThread1() {
			super();
			// TODO Auto-generated constructor stub
		}

		public MyThread1(Runnable target) {
			super(target);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void run() {
			System.out.println("这是Thread的Run方法.");
		}
	}

	/**
	 * ' 通过实现Runnable接口来定义一个线程.该线程的执行从run开始
	 */
	class MyThread2 implements Runnable {

		@Override
		public void run() {
			System.out.println("这是Runnable的Run方法.");
		}

	}

	public static void main(String[] args) {
		Demo01 d = new Demo01();

		// -- 根据Thread的源代码可以发现.当构造Thread时,如果没有提供了Runnable对象
		// -- 那执行的是Thread子类必须重写的run方法内容.
		Thread t1 = d.new MyThread1();
		// -- 根据Thread的源代码可以发现.当构造Thread时,如果提供了Runnable对象
		// -- 那执行的就是Runnable对象的run方法
		Thread t2 = d.new MyThread1(d.new MyThread2());

		Thread t3 = new Thread(d.new MyThread2());
		// -- 启动一个线程是通过start方法来启动
		t1.start();// Thread
		t2.start();// Thread
		t3.start();// Runnable
	}
}
