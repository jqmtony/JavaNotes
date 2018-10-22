package com.hwua.demo;

public class Demo06 {

	public int i = 7;
	private int j = 8;
	protected int k = 9;
	int l = 10;
	
	/**
	 * 读数据
	 * 	方法通过返回值把数据传递出去
	 * 	
	 */
	public int getJ() {
		return j;
	}
	
	/**
	 * 写数据
	 * 	把需要写入变量的数据从外面传到方法内部
	 */
	public void setJ(int j) {
		if (j < 10) {
			j = 100;
		}else {
			this.j = j;
		}
	}
}











