package com.hwua.demo01;

public class Rabbit extends Animal{

	public Rabbit(String name) {
		//The constructor Animal() is undefined
		/*
		 *  .�����κ�һ����,������Ĭ�ϵ��޲ι���,�������ص�
		 *  .ͬʱ���췽���еĵ�һ�д���һ����super()
		 *  .�ų�ʹ��this()�����.
		 *  .������û���޲ι���ʱ,�����super()�Ҳ���������޲ι���
		 *  .���Իᱨ��.
		 */
		super(name);
	}
}
