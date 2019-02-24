package com.hvua.domain.D16_strategy;

public class Context {
	private Operator operator;
	/**
	 * 可以去引用继承operator接口的重写后的operator行为
	 */
	public void setOperator(Operator operator) {
		this.operator=operator;
	} 
	
	/**
	 * 给参数，执行方法
	 */
	public void action(double num1, double num2) {
		double result = operator.doResult(num1, num2);
		System.out.println(result);
	}
	
}
