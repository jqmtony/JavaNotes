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
		Thread t = new Thread("�߳�1");
		t.setName("�߳�2");
		System.out.println(t.getName());
		
		//-- 1.��ȡ��ǰ�̶߳��� main�߳�Ҳ�����߳�.����main�������ڵ��߳�.
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName());
		
		//-- 2.�õ�ǰ�߳���Ϣһ��
		System.out.println(System.currentTimeMillis());
		try {
			//-- ͨ��sleep�������߳�����ָ����ʱ��
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(System.currentTimeMillis());

	}
}
