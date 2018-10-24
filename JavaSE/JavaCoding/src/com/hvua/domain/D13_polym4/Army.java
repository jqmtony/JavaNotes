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

	// ��Ϊ:2.1������ʿ�����й���
	public void callSoldier(Soldier soldier, Soldier soldier2, Soldier soldier3, Soldier soldier4) {
		if (soldier == null && soldier2 == null && soldier3 == null && soldier4 == null) {
			System.out.println("�� [ " + getPosition() + " ] ����ʩ�");
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
