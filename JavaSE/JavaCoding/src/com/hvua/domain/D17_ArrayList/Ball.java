package com.hvua.domain.D17_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Ball {

	private ArrayList<Integer> redBalls;
	private int blueBall;
	private Random random;

	/**
	 * get and set
	 * 
	 * @return
	 */

	public ArrayList<Integer> getRedBalls() {
		return redBalls;
	}

	public void setRedBalls(ArrayList<Integer> redBalls) {
		this.redBalls = redBalls;
	}

	public int getBlueBall() {
		return blueBall;
	}

	public void setBlueBall(int blueBall) {
		this.blueBall = blueBall;
	}

	/**
	 * 构造一个无参
	 */
	public Ball() {
		redBalls = new ArrayList<>();
	}

	/**
	 * 每次创建一个Ball，都可以产生一期双色球
	 * 
	 * @return
	 */
	public void oneBallTerm() {
		random = new Random();
		redBalls.add(random.nextInt(33) + 1);
		blueBall = random.nextInt(16) + 1;
		System.out.println(redBalls);
		System.out.println(blueBall);
	}

}
