package com.hwua.demo04;

/**
 * ����Exceptionʵ�������л��ӿ�.��������Ҳ�Ƽ�ʵ��.
 * ������ʵֻ��Ҫ�ṩһ�����̶ֹ�Ϊ:serialVersionUID��long���ͱ����Ϳ�����
 * @author Administrator
 *
 */
public class MyExceptionTwo extends RuntimeException{

	private static final long serialVersionUID = 1660992394981429239L;
	
	public MyExceptionTwo() {
	}
	public MyExceptionTwo(String msg){
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return "�ҵ��쳣2";
	}
	
	
	
	
	
	
	
}
