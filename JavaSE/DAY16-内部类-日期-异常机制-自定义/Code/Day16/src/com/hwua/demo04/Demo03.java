package com.hwua.demo04;

public class Demo03 {
	public static void main(String[] args) {
		Demo03 d = new Demo03();
		try {
			d.getLength(null);
		} catch (NullPointerException e) {
			//-- throw ���׳��쳣����������쳣����
			System.out.println("�յ��쳣");
			throw e;
		}
	}

	/**
	 * 
	 * @param str
	 * @return
	 * @throws NullPointerException ��������������ܻ�������쳣.������
	 * �������ﲻ����.���쳣�����׳�.�׸��ϲ�.
	 */
	public int getLength(String str) throws NullPointerException{
		return str.length();
	}
}
