package D17_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BallTest {
	public static void main(String[] args) {
		// ��ֵ��ArrayList���ؼ�������һ����������һ��˫ɫ��
		ArrayList<Ball> allBalls = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Ball ball = new Ball();
			allBalls.add(ball);
		}
		// ����ArrayList
		int index = 1;
		for (Ball one : allBalls) {
			System.out.println("��" + index + "��˫ɫ��" + one);
			index++;
		}
		// �������ֵȡ����
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Ball one : allBalls) {
			for (int i = 0; i < one.getReds().length; i++) {
				arrayList.add(one.getReds()[i]);
			}
			arrayList.add(one.getBlue());
		}
		// ����ͳ�Ƴ��ִ���
		int temp = 1;
		while (temp <= 33) {
			System.out.println(temp + "��" + Collections.frequency(arrayList, temp));
			temp++;
		}
	}
}
