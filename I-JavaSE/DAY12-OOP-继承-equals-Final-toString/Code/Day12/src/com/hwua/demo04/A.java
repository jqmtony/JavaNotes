package com.hwua.demo04;

public class A {
	//-- ��Ϊinstance��static����.��������Ψһ��.
	private static A instance;
	private A(){	
	}
	
	/* Ϊʲôʹ�þ�̬.
	 * 	��Ϊ����ĵ��÷�ʽ������:
	 * 	1.����.����
	 *  2.����.����
	 *   .����Ϊ�˻�ȡ����.��Ҫ���ø÷���..�����Ҫ�ܹ����ø÷���
	 *   .����Ҫ��һ������.���Ա���໥��������ѭ��.Ϊ�˽���������
	 *   .���õڶ��ֵ��÷����ķ�ʽ.ͨ������.����������.��Ҫ���ǰѷ���
	 *   .��Ƴɾ�̬����.
	 */
	public static A getInstance() {
		//-- �ж�instance�Ƿ��Ѿ���ʵ������.����Ѿ���ʵ������ֱ�ӷ���
		//-- ���û����ʵ����
		if (instance == null) {
			instance =  new A();
		}
		return instance;
	}
}
