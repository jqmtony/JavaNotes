package com.hvua.domain.D13_polym4;

public class stepSoldier extends Soldier {

	public stepSoldier() {
		super("����","�ֵ�ǹ�������з�");
	}

	@Override
	public String getGroup() {
		// TODO Auto-generated method stub
		return super.getGroup();
	}

	@Override
	public void attack( ) {
		System.out.println("[ "+getGroup() + " ] ���ϳ���������ʽΪ [ "+getAttackType()+" ] ����");
	}

}
