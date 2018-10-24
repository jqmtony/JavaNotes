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

	// 行为:2.1：发号士兵进行攻击
	public void callSoldier(Soldier soldier, Soldier soldier2, Soldier soldier3, Soldier soldier4) {
		if (soldier == null && soldier2 == null && soldier3 == null && soldier4 == null) {
			System.out.println("请 [ " + getPosition() + " ] 发号施令！");
		} else if (soldier2 == null && soldier3 == null && soldier4 == null) {
			soldier.attack();
		} else if (soldier3 == null && soldier4 == null) {
			soldier.attack();
			soldier2.attack();
		} else if (soldier4 == null) {
			soldier.attack();
			soldier2.attack();
			soldier3.attack();
		} else {
			soldier.attack();
			soldier2.attack();
			soldier3.attack();
			soldier4.attack();
		}
		attack();
	}

}
