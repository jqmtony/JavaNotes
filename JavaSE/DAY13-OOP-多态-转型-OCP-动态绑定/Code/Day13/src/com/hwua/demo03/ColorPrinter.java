package com.hwua.demo03;

public class ColorPrinter extends Printer{

	@Override
	public void print(Info info) {
		System.out.print("正在使用彩色打印机打印:\t");
		super.print(info);
	}
}
