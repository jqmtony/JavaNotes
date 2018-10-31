package D18_LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class testMap {

	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap<>();
		Person p1 = new Person(1, "name1", 20);
		Person p2 = new Person(2, "name2", 24);
		Person p3 = new Person(3, "name3", 31);
		Person p4 = new Person(4, "name4", 16);
		map.put("科学", p1);
		map.put("李", p2);
		map.put("A", p3);
		map.put("B", p4);

		// 按照键排序，使用TreeMap
		TreeMap<String, Person> tm= new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		tm.putAll(map);

		System.out.println("***************");

		// 2.根据Person的年龄排序 id name age
		ArrayList<Map.Entry<String, Person>> list = new ArrayList<>(map.entrySet());
		Collection<E>
		
		
		
		
		
		
		
		
		
		
	}
}
