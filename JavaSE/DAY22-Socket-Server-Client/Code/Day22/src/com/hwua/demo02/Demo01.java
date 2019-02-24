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
public class Demo01 {

	public static void main(String[] args) {
		//-- �½�һ�����л�����̳߳�
		ExecutorService es = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 10; i++) {
			final int index = i;
			//-- ���̳߳�ȥִ��ĳ���߳�. ��Ҫ����Runnable�Ķ���
			es.execute(new Runnable() {
				@Override
				public void run() {
					Thread.currentThread().setName("�߳�-" + (index + 1));
					System.out.println(index);							
					System.out.println("�����߳��ڲ��Ĵ�ӡ");
					System.out.println("--------------------");
				}
			});
		}		
	}
}
