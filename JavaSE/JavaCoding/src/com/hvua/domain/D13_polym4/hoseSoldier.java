package com.hvua.domain.D13_polym4;

public class hoseSoldier extends Soldier {

	public hoseSoldier() {
		super("���","��ɢ�з����Σ����������");
	}

	@Override
	public String getGroup() {
		// TODO Auto-generated method stub
		return super.getGroup();
	}

	@Override
	public void attack( ) {
		System.out.println("[ "+getGroup() + " ] ���ϳ���������ʽΪ���� [ "+getAttackType()+" ] ����");
	}

}
