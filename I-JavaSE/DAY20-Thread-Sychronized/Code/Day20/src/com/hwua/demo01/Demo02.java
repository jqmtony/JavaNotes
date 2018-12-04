/**
 * 
 */
package com.hwua.demo01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Administrator
 *
 */
public class Demo02 {

	class MyThread implements Callable<String> {
		/**
		 * ' 返回值的类型有泛型决定
		 */
		@Override
		public String call() throws Exception {
			// TODO Auto-generated method stub
			return "ABC";
		}
	}

	public static void main(String[] args) {
		Demo02 d = new Demo02();
		// Callable 接口的实现类对象
		MyThread mt = d.new MyThread();

		// -- FutureTask 看做是Runnable的对象.
		FutureTask<String> ft = new FutureTask<>(mt);

		/*
		 * Thread的参数可以接收Runnable.没有接收Callable方法.
		 * 
		 */
		Thread t = new Thread(ft);
		t.start();

		String result = "";
		try {
			result = ft.get();
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
