package com.hwua.demo03;

public class ColorPrinter extends Printer{

	@Override
	public void print(Info info) {
		System.out.print("����ʹ�ò�ɫ��ӡ����ӡ:\t");
		super.print(info);
	}
}
