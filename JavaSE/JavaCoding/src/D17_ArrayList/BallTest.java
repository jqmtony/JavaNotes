package D17_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BallTest {
	public static void main(String[] args) {
		// 赋值给ArrayList，关键点在于一个球对象就是一组双色球！
		ArrayList<Ball> allBalls = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Ball ball = new Ball();
			allBalls.add(ball);
		}
		// 遍历ArrayList
		int index = 1;
		for (Ball one : allBalls) {
			System.out.println("第" + index + "期双色球：" + one);
			index++;
		}
		// 把里面的值取出来
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Ball one : allBalls) {
			for (int i = 0; i < one.getReds().length; i++) {
				arrayList.add(one.getReds()[i]);
			}
			arrayList.add(one.getBlue());
		}
		// 排序，统计出现次数
		int temp = 1;
		while (temp <= 33) {
			System.out.println(temp + "：" + Collections.frequency(arrayList, temp));
			temp++;
		}
	}
}
