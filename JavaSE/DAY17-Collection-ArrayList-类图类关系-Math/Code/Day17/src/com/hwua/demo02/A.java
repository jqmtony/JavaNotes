package com.hwua.demo02;

/**
 * 
 * @author Administrator
 *
 * @param <T>  是一个通配符代表任意一种数据类型.
 * 具体哪一种暂时不知道.等创建对象时,根据具体提供的才能确定
 */
public class A<T> {
	//-- 泛型变量
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	/**
	 * 这样的方法叫做泛型方法.
	 * @return
	 */
	public <T>T method(){
		return null;
	}
	
	
	
	
	
	
	
	
}
