package com.hwua.demo02;

/**
 * 
 * @author Administrator
 *
 * @param <T>  ��һ��ͨ�����������һ����������.
 * ������һ����ʱ��֪��.�ȴ�������ʱ,���ݾ����ṩ�Ĳ���ȷ��
 */
public class A<T> {
	//-- ���ͱ���
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	/**
	 * �����ķ����������ͷ���.
	 * @return
	 */
	public <T>T method(){
		return null;
	}
	
	
	
	
	
	
	
	
}
