/**
 * 
 */
package com.hwua.demo02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		//-- 新建一个带有缓存的线程池
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 10; i++) {
			final int index = i;
			//-- 让线程池去执行某个线程. 需要参数Runnable的对象
			es.execute(new Runnable() {
				@Override
				public void run() {
					Thread.currentThread().setName("线程-" + (index + 1));
					System.out.println(Thread.currentThread().getName());
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}		
	}
}
