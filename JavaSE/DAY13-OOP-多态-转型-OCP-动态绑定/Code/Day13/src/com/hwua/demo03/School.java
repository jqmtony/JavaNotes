package com.hwua.demo03;

public class School {
	private String name;
	private Printer printer;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public School(String name) {
		super();
		this.name = name;
	}
	
	
	public void usePrintToPrinter(Info info) {
		System.out.print(getName());
		printer.print(info);
	}
}
