package com.hvua.domain.D16_strategy;

public class Context {
	private Operator operator;
	/**
	 * ����ȥ���ü̳�operator�ӿڵ���д���operator��Ϊ
	 */
	public void setOperator(Operator operator) {
		this.operator=operator;
	} 
	
	/**
	 * ��������ִ�з���
	 */
	public void action(double num1, double num2) {
		double result = operator.doResult(num1, num2);
		System.out.println(result);
	}
	
}
