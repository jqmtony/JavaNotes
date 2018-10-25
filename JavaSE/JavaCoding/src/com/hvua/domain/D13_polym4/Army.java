package com.hvua.domain.D13_polym4;

public class Army {
	private String position; // 军官
	private String attackType;

	public Army(String position) {
		super();
		this.position = position;
		this.attackType = "直攻敌对首领";
	}

	public String getPosition() {
		return position;
	}

	public String getAttackType() {
		return attackType;
	}

	// 行为1：上场加入战争
	public void attack() {
		System.out.println("[ " + getPosition() + " ] 已上场！ [ " +getAttackType() + " ] ！！" );
	}

	public void callSoldier(Soldier[] array) {
		for(Soldier soldier: array ) {
			soldier.attack();
		}
	}

}
