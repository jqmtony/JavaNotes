package com.hvua.domain.D16_Exception.hw2_judgeName;

public class NameException extends Exception {
	/**
	 * ���extends����Exception��Ҳ���Ƿ�����ʱ�쳣����Ҫ�� try-catch���֣�
	 */
//	private static final long serialVersionUID = 1660992394981429239L;
	
	/**
	 * ���죬û��Ҳ��Ӱ�죬Ĭ�����޲ε�
	 */
//	public NameException() {
//	}
////	public NameException(String msg) {
//		super(msg);
//	}
	
	/**
	 * message�������
	 */
	@Override
	public String getMessage() {
		return "���ֲ���С��2���ֽ�**";
	}

}
