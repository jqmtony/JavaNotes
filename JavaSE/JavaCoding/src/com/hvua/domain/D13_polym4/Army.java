package com.hvua.domain.D13_polym4;

public class Army {
	private String position; // ����
	private String attackType;

	public Army(String position) {
		super();
		this.position = position;
		this.attackType = "ֱ���ж�����";
	}

	public String getPosition() {
		return position;
	}

	public String getAttackType() {
		return attackType;
	}

	// ��Ϊ1���ϳ�����ս��
	public void attack() {
		System.out.println("[ " + getPosition() + " ] ���ϳ��� [ " +getAttackType() + " ] ����" );
	}

	public void callSoldier(Soldier[] array) {
		for(Soldier soldier: array ) {
			soldier.attack();
		}
	}

}
