package com.hwua.demo01;

public class Test {
	public static void main(String[] args) {
		
		Context context = new Context();
		context.setOperator(new SubOperator());
		context.action(1, 3);
		
		
	}

}
