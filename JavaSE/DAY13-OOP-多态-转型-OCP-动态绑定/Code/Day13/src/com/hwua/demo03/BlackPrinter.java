package com.hwua.demo03;

public class BlackPrinter extends Printer{

	@Override
	public void print(Info info) {
		System.out.print("����ʹ�úڰ״�ӡ����ӡ:\t");
		super.print(info);
	}
}
