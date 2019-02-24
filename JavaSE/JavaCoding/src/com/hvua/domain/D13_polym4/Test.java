package com.hvua.domain.D13_polym4;

public class Test {
	public static void main(String[] args) {

		Army leader = new Army("уе╫╚╬Э");
		Soldier step = new stepSoldier();
		Soldier boom = new boomSoldier();
		Soldier hoSoldier = new hoseSoldier();
		Soldier[] soldiers = new Soldier[3];
		
		soldiers[0]=step;
		soldiers[1]=boom;
		leader.callSoldier(soldiers);
	}
}
