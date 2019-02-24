package com.hwua.demo01;

/**
 * 策略的执行环境.
 * 	要做到两点:
 * 1.持有一个策略接口作为成员变量(使用多态.使用父接口)
 * 2.提供一个行为来执行策略中的具体算法.
 * @author Administrator
 *
 */
public class Context {
	private Operator operator;
	
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	/**
	 * 执行策略的地方
	 */
	public void action(double num1,double num2) {
		double result = operator.doResult(num1, num2);
		System.out.println("Result:\t" +result);
	}

}
