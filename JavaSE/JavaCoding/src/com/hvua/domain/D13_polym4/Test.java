package com.hvua.domain.D13_polym4;

public class Test {
	public static void main(String[] args) {

		Army leader = new Army("张将军");
		Soldier step = new stepSoldier();
		Soldier boom = new boomSoldier();
		Soldier hoSoldier = new hoseSoldier();
//		Soldier soldier = new Soldier("全部士兵！");
		
//		leader.callSoldier(null,null,null,null);
		leader.callSoldier(step,boom,hoSoldier,null); 
//		leader.callSoldier(boom,null,null,null);
		
	}
}
