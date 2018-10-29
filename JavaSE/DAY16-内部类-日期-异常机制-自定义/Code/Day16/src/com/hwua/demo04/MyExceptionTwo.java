package com.hwua.demo04;

/**
 * 父类Exception实现了序列化接口.所以子类也推荐实现.
 * 这里其实只需要提供一个名字固定为:serialVersionUID的long类型变量就可以了
 * @author Administrator
 *
 */
public class MyExceptionTwo extends RuntimeException{

	private static final long serialVersionUID = 1660992394981429239L;
	
	public MyExceptionTwo() {
	}
	public MyExceptionTwo(String msg){
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return "我的异常2";
	}
	
	
	
	
	
	
	
}
