package com.hvua.domain.D16_Exception;

import java.util.Random;

public class hw3_LiveOrDie {
	static Random random = new Random();
	static int health = random.nextInt(100) + 1;
	static int treatment = random.nextInt(50) + 1;

	/**
	 * 测试
	 */
	public static void main(String[] args) {
		if (!worker(health)) {
			doctor(treatment);
		}

	}

	/**
	 * 工作者
	 * 
	 * @return
	 */
	public static boolean worker(int health) {
		try {
			System.out.println("你的健康值：" + health);
			if (health <= 50) {
				throw new Exception();
			} else {
				System.out.println("你很健康哦~");
				return true;
			}
		} catch (Exception e) {
			System.out.println("快死了啊！");
			return false;
		}
	}

	/**
	 * 医生
	 */
	public static void doctor(int treatment) {
		System.out.println("你的治疗成功值：" + treatment);
		try {
			if (treatment <= 20) {
				throw new Exception();
			} else {
				System.out.println("恭喜你，还活着！");
			}
		} catch (Exception e) {
			System.out.println("治疗失败！等死吧！");
		}
	}

}
