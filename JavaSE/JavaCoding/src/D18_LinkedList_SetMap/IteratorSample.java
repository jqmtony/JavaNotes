package D18_LinkedList_SetMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorSample {

	public static void main(String[] args) {
		/**
		 * 用迭代器遍历输出集合ArrayList
		 */
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i*3);
		}
		System.out.println(list);
		for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		/**
		 * 用迭代器遍历输出Map
		 */
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			map.put(i+1, i*2+3);
		}
		System.out.println(map);
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
		}
		
	}
	
}
