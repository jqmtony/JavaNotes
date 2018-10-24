package com.hvua.domain.D13_polym4;

public class boomSoldier extends Soldier {

	public boomSoldier() {
		super("炮兵", "发射远程炮击");
	}

	@Override
	public String getAttackType() {
		// TODO Auto-generated method stub
		return super.getAttackType();
	}

	@Override
	public String getGroup() {
		// TODO Auto-generated method stub
		return super.getGroup();
	}

	@Override
	public void attack() {
		System.out.println("[ " + getGroup() + " ] 已上场！攻击方式为 [ "+getAttackType()+" ] ！！");
	}

}
