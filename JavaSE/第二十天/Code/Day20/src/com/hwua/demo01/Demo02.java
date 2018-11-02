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
		 * ' ����ֵ�������з��;���
		 */
		@Override
		public String call() throws Exception {
			// TODO Auto-generated method stub
			return "ABC";
		}
	}

	public static void main(String[] args) {
		Demo02 d = new Demo02();
		// Callable �ӿڵ�ʵ�������
		MyThread mt = d.new MyThread();

		// -- FutureTask ������Runnable�Ķ���.
		FutureTask<String> ft = new FutureTask<>(mt);

		/*
		 * Thread�Ĳ������Խ���Runnable.û�н���Callable����.
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
