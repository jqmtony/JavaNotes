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
		 * 使用HashMap<String, Person>实现：1.key排序 2.根据年龄排序
		 */
		HashMap<String, Person> map = new HashMap<>();
		Person p1 = new Person(1, 17, "张三");
		Person p2 = new Person(2, 16, "李四");
		Person p3 = new Person(3, 15, "王五");
		Person p4 = new Person(4, 18, "赵六");
		Person p5 = new Person(5, 19, "孙七");
		Person p6 = new Person(6, 20, "周八");

		map.put("B", p1);
		map.put("A", p2);
		map.put("Z", p3);
		map.put("G", p4);
		map.put("H", p5);
		map.put("C", p6);

		// key排序，hash是无需的，利用tree排序，就是把hash的东西给tree，
		// 输出treeMap自然就是有序的了
		TreeMap<String, Person> tMap = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		// 排序
		tMap.putAll(map);
		System.out.println(tMap);
		// 遍历输出
		Iterator<String> iterator = tMap.keySet().iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		// 值排序，map先放到数组里
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
	 * 双色球，6个红球，不重复，用set
	 */
	public static void getRedBall() {
		// set不能实例化，它的两个实现类treeset和hashset可以
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
