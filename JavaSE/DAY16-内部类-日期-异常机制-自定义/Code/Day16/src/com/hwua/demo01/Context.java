package com.hwua.demo01;

/**
 * ���Ե�ִ�л���.
 * 	Ҫ��������:
 * 1.����һ�����Խӿ���Ϊ��Ա����(ʹ�ö�̬.ʹ�ø��ӿ�)
 * 2.�ṩһ����Ϊ��ִ�в����еľ����㷨.
 * @author Administrator
 *
 */
public class Context {
	private Operator operator;
	
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	/**
	 * ִ�в��Եĵط�
	 */
	public void action(double num1,double num2) {
		double result = operator.doResult(num1, num2);
		System.out.println("Result:\t" +result);
	}

}
