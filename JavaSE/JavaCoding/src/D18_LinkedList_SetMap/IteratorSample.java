package D18_LinkedList_SetMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorSample {

	public static void main(String[] args) {
		/**
		 * �õ����������������ArrayList
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
		 * �õ������������Map
		 */
		HashMap<String, Integer> map = new HashMap<>();
		
	}
	
}
