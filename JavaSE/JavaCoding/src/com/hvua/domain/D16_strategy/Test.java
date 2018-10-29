package com.hvua.domain.D16_strategy;


public class Test {
	public static void main(String[] args) {
		Context context = new Context();
		context.setOperator(new addOperator());
		context.action(1.5, 3.2);
	}
}
