package com.hwua.demo03;

public class Test {
	public static void main(String[] args) {
		School school = new School("�Ϻ�����");
		Printer printer = new ColorPrinter();
		school.setPrinter(printer);
		Info info1 = new Info("�����ļ���");
		Info info2 = new Info("���ĵļ���");
		
		school.usePrintToPrinter(info1);
		
		
	}

}
