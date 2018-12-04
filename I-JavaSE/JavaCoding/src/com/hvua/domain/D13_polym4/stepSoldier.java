package com.hvua.domain.D13_polym4;

public class stepSoldier extends Soldier {

	public stepSoldier() {
		super("步兵","持刀枪近身攻击敌方");
	}

	@Override
	public String getGroup() {
		// TODO Auto-generated method stub
		return super.getGroup();
	}

	@Override
	public void attack( ) {
		System.out.println("[ "+getGroup() + " ] 已上场！攻击方式为 [ "+getAttackType()+" ] ！！");
	}

}
