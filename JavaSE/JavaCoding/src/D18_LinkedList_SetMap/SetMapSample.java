package D18_LinkedList_SetMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class SetMapSample {
	public static void main(String[] args) {
		getRedBall(); // [2, 4, 8, 22, 23, 25]
		System.out.println("********************");
		/**
		 * ʹ��HashMap<String, Person>ʵ�֣�1.key���� 2.������������
		 */
		HashMap<String, Person> map = new HashMap<>();
		Person p1 = new Person(1, 17, "����");
		Person p2 = new Person(2, 16, "����");
		Person p3 = new Person(3, 15, "����");
		Person p4 = new Person(4, 18, "����");
		Person p5 = new Person(5, 19, "����");
		Person p6 = new Person(6, 20, "�ܰ�");

		map.put("B", p1);
		map.put("A", p2);
		map.put("Z", p3);
		map.put("G", p4);
		map.put("H", p5);
		map.put("C", p6);

		// key����hash������ģ�����tree���򣬾��ǰ�hash�Ķ�����tree��
		// ���treeMap��Ȼ�����������
		TreeMap<String, Person> tMap = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		// ����
		tMap.putAll(map);
		System.out.println(tMap);
		// �������
		Iterator<String> iterator = tMap.keySet().iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		// ֵ����map�ȷŵ�������
		ArrayList<Map.Entry<String, Person>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Person>>() {
			@Override
			public int compare(Entry<String, Person> o1, Entry<String, Person> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().getAge()-o2.getValue().getAge();
			}
		});
		for(Entry<String, Person> entry: list){
			System.out.println(entry);
		}
	}

	/**
	 * ˫ɫ��6�����򣬲��ظ�����set
	 */
	public static void getRedBall() {
		// set����ʵ��������������ʵ����treeset��hashset����
		Set<Integer> red = new TreeSet<>();
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			if (!red.add(random.nextInt(33) + 1)) {
				i--;
			}
		}
		System.out.println(red);
	}
}
