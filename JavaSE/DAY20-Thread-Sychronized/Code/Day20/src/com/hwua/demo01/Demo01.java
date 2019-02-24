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
	 * ' ͨ���̳�Thread������һ���߳���
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
			System.out.println("����Thread��Run����.");
		}
	}

	/**
	 * ' ͨ��ʵ��Runnable�ӿ�������һ���߳�.���̵߳�ִ�д�run��ʼ
	 */
	class MyThread2 implements Runnable {

		@Override
		public void run() {
			System.out.println("����Runnable��Run����.");
		}

	}

	public static void main(String[] args) {
		Demo01 d = new Demo01();

		// -- ����Thread��Դ������Է���.������Threadʱ,���û���ṩ��Runnable����
		// -- ��ִ�е���Thread���������д��run��������.
		Thread t1 = d.new MyThread1();
		// -- ����Thread��Դ������Է���.������Threadʱ,����ṩ��Runnable����
		// -- ��ִ�еľ���Runnable�����run����
		Thread t2 = d.new MyThread1(d.new MyThread2());

		Thread t3 = new Thread(d.new MyThread2());
		// -- ����һ���߳���ͨ��start����������
		t1.start();// Thread
		t2.start();// Thread
		t3.start();// Runnable
	}
}
