package com.hvua.domain.D13_polym4;

public class Soldier {
	private String group; // ��ͬ���͵ı�
	private String attackType;

	public Soldier() {
	}

	public Soldier(String group, String attackType) {
		super();
		this.group = group;
		this.attackType = attackType;
	}

	public String getAttackType() {
		return attackType;
	}

	public Soldier(String group) {
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	public void attack() {
//		System.out.println("����ʿ���Ѿ�������׼������������");

	}

}
