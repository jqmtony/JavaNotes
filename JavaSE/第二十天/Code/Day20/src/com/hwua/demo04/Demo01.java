/**
 * 
 */
package com.hwua.demo04;

/**
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		final Object obj = new Object();

		Thread w1 = new WorK1(obj);
		w1.start();

		Thread w2 = new WorK2(obj);
		w2.start();
	}

}

class WorK1 extends Thread {
	private Object obj;

	/**
	 * @param obj
	 */
	public WorK1(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				// -- »½ÐÑ±ðÈË
				obj.notify();

				System.out.println("A");

				try {
					sleep(333);
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}
}

class WorK2 extends Thread {
	private Object obj;

	/**
	 * @param obj
	 */
	public WorK2(Object obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (obj) {
				obj.notify();
				System.out.println("B");
				try {
					sleep(333);
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}