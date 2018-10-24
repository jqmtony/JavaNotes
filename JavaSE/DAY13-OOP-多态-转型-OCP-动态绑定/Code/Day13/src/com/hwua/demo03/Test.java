package com.hwua.demo03;

public class Test {
	public static void main(String[] args) {
		School school = new School("上海中心");
		Printer printer = new ColorPrinter();
		school.setPrinter(printer);
		Info info1 = new Info("张三的简历");
		Info info2 = new Info("李四的简历");
		
		school.usePrintToPrinter(info1);
		
		
	}

}
