package D18_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class randToMap {
	public static void main(String[] args) {
		Random random = new Random();
		// �������30~35��50������
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			list.add(random.nextInt(6) + 30);
		}
		System.out.println(list);
		
		// �����ַŵ�Map����ȥ��ʹ�ü���frequencyͳ�Ƴ��ִ���
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(30, Collections.frequency(list, 30));
		map.put(31, Collections.frequency(list, 31));
		map.put(32, Collections.frequency(list, 32));
		map.put(33, Collections.frequency(list, 33));
		map.put(34, Collections.frequency(list, 34));
		map.put(35, Collections.frequency(list, 35));
		
		// ���
		System.out.println(map);
		System.out.println(map.values());
	}
}
