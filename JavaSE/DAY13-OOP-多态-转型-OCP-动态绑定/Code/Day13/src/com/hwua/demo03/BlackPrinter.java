package com.hwua.demo03;

public class BlackPrinter extends Printer{

	@Override
	public void print(Info info) {
		System.out.print("正在使用黑白打印机打印:\t");
		super.print(info);
	}
}
