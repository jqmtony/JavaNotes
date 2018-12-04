package com.hwua.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * ' 彩票类
 * 
 * @author Administrator
 *
 */
public class Lottery {
	// -- 记录期号
	private int stage;

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	/**
	 * 提供常量用来控制红球和蓝球的个数
	 */
	private static final int MAX_RED = 6;

	// -- 注解.目的是忽略 unused的警告
	@SuppressWarnings("unused")
	private static final int MAX_BLUE = 1;

	private Random random;
	/**
	 * '提供容器保存6个取值1-33的红球
	 */
	private ArrayList<Integer> reds;

	// -- 提供一个变量保存每一期的蓝球
	private int blue;

	/**
	 * ' 提供红球的get方法
	 * 
	 * @return
	 */
	public ArrayList<Integer> getReds() {
		return reds;
	}

	public int getBlue() {
		return blue;
	}

	/**
	 * '利用构造方法完成号码的初始化操作
	 */
	public Lottery(int stage) {
		this.stage = stage;
		initLottery();
	}

	/**
	 * '初始化集合
	 */
	public void initLottery() {
		// -- 实例化保存红球的集合
		reds = new ArrayList<>();
		random = new Random();
		createRed();
		createBlue();
	}

	/**
	 * '生成红球
	 */
	public void createRed() {
		// -- 生成红球并放入集合
		for (int i = 0; i < MAX_RED; i++) {
			// -- 取值范围1-33
			Integer ball = random.nextInt(33) + 1;
			if (reds.contains(ball)) {
				i--;
				continue;
			}
			reds.add(ball);
		}
		// -- 生成数字是随机的导致集合中元素的顺序是乱序的.排序
		Collections.sort(reds);
	}

	/**
	 * ' 生成蓝球
	 */
	public void createBlue() {
		// -- 取值 1-16
		blue = random.nextInt(16) + 1;
	}

	/**
	 * ' 格式话打印!
	 */
	@Override
	public String toString() {
		String line = "第" + stage + "期彩票号码:\t";
		for (int i = 0; i < reds.size(); i++) {
			if (reds.get(i) < 10) {
				line = line + "0" + reds.get(i) + " ";
			} else {
				line = line + reds.get(i) + " ";
			}
		}
		line = line + blue;
		return line;
	}
}
