package com.hwua.demo;

public class Demo06 {

	public int i = 7;
	private int j = 8;
	protected int k = 9;
	int l = 10;
	
	/**
	 * ������
	 * 	����ͨ������ֵ�����ݴ��ݳ�ȥ
	 * 	
	 */
	public int getJ() {
		return j;
	}
	
	/**
	 * д����
	 * 	����Ҫд����������ݴ����洫�������ڲ�
	 */
	public void setJ(int j) {
		if (j < 10) {
			j = 100;
		}else {
			this.j = j;
		}
	}
}











