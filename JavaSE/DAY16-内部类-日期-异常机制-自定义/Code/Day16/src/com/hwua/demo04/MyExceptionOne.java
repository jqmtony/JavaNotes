package com.hwua.demo04;

/**
 * ����Exceptionʵ�������л��ӿ�.��������Ҳ�Ƽ�ʵ��.
 * ������ʵֻ��Ҫ�ṩһ�����̶ֹ�Ϊ:serialVersionUID��long���ͱ����Ϳ�����
 * @author Administrator
 *
 */
public class MyExceptionOne extends Exception{

	private static final long serialVersionUID = 1660992394981429239L;
	
	public MyExceptionOne() {
	}
	public MyExceptionOne(String msg){
		super(msg);
	}	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "�ҵ��쳣1";
	}
}
