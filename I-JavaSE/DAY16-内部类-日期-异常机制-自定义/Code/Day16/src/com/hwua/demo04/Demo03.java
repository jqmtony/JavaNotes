package com.hwua.demo04;

public class Demo03 {
	public static void main(String[] args) {
		Demo03 d = new Demo03();
		try {
			d.getLength(null);
		} catch (NullPointerException e) {
			//-- throw 是抛出异常后面跟的是异常对象
			System.out.println("收到异常");
			throw e;
		}
	}

	/**
	 * 
	 * @param str
	 * @return
	 * @throws NullPointerException 声明这个方法可能会产生该异常.如果真的
	 * 产生这里不处理.将异常向上抛出.抛给上层.
	 */
	public int getLength(String str) throws NullPointerException{
		return str.length();
	}
}
