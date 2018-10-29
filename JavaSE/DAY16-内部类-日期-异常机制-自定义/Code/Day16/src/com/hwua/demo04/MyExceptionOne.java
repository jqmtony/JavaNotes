package com.hwua.demo04;

/**
 * 父类Exception实现了序列化接口.所以子类也推荐实现.
 * 这里其实只需要提供一个名字固定为:serialVersionUID的long类型变量就可以了
 * @author Administrator
 *
 */
public class MyExceptionOne extends Exception{

	private static final long serialVersionUID = 1660992394981429239L;
	
	public MyExceptionOne() {
	}
	public MyExceptionOne(String msg){
		super(msg);
	}	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "我的异常1";
	}
}
