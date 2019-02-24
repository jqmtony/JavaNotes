package com.hwua.demo01;

/**
 * 策略模式中的具体策略角色
 * 		实现了策略接口.代表具体的某一种策略算法
 * @author Administrator
 *
 */
public class AddOperator implements Operator{

	@Override
	public double doResult(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

}
