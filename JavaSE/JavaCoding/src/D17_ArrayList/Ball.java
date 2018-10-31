package D17_ArrayList;

import java.util.Arrays;
import java.util.Random;

public class Ball {
	Random random = new Random();
	private int[] reds;
	private int blue;
	@Override
	public String toString() {
		return "Ball [ reds=" + Arrays.toString(reds) + ", blue=" + blue + "]";
	}
	public int[] getReds() {
		return reds;
	}
	public int getBlue() {
		return blue;
	}
	/**
	 * 构造！有参构造想办法让它一个球就是一个数列！！！！
	 */
	public Ball() {
		this.getRedBall();
		this.getBlueBall();
	}
	/**
	 * 获取红色球和蓝色球
	 */
	public int[] getRedBall() {
		reds = new int[6];
		for (int i = 0; i < reds.length; i++) {
			reds[i] = random.nextInt(33) + 1;
			for (int j = 0; j < i; j++) {
				if(reds[j]==reds[j+1]) {
					i--;
					continue;
				}
			}
		}
		return reds;
	}
	public int getBlueBall() {
		blue = random.nextInt(16) + 1;
		return blue;
	}

}
