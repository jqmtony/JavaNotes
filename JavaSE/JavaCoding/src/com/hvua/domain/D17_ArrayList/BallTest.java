package com.hvua.domain.D17_ArrayList;

import java.util.ArrayList;

public class BallTest {
	public static void main(String[] args) {
		/**
		 * ����100�ڵ�˫ɫ��
		 */
		Ball balls = new Ball();
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
		System.out.println("length\t"+arrayList.size());
//		while(arrayList.size()<10) {
			balls.oneBallTerm();
			balls.getRedBalls();
			balls.getBlueBall();
			balls.oneBallTerm();
			balls.getRedBalls();
			balls.getBlueBall();
//			balls.oneBallTerm();
//			balls.oneBallTerm();
//		}
		
		
	}
}
