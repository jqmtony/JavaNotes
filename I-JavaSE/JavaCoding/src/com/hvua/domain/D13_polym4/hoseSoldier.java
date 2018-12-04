package com.hvua.domain.D13_polym4;

public class hoseSoldier extends Soldier {

	public hoseSoldier() {
		super("骑兵","冲散敌方队形，并射箭攻击");
	}

	@Override
	public String getGroup() {
		// TODO Auto-generated method stub
		return super.getGroup();
	}

	@Override
	public void attack( ) {
		System.out.println("[ "+getGroup() + " ] 已上场！攻击方式为快速 [ "+getAttackType()+" ] ！！");
	}

}
