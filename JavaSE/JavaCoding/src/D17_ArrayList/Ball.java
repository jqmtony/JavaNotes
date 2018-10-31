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
	 * ���죡�вι�����취����һ�������һ�����У�������
	 */
	public Ball() {
		this.getRedBall();
		this.getBlueBall();
	}
	/**
	 * ��ȡ��ɫ�����ɫ��
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
