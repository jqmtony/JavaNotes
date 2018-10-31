package com.hvua.domain.D16_Exception.hw2_judgeName;

public class NameException extends Exception {
	/**
	 * 如果extends的是Exception，也就是非运行时异常，需要在 try-catch出现？
	 */
//	private static final long serialVersionUID = 1660992394981429239L;
	
	/**
	 * 构造，没有也不影响，默认是无参的
	 */
//	public NameException() {
//	}
////	public NameException(String msg) {
//		super(msg);
//	}
	
	/**
	 * message报错输出
	 */
	@Override
	public String getMessage() {
		return "名字不能小于2个字节**";
	}

}
