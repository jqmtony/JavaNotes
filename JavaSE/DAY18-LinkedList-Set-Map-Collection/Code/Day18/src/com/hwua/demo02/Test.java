package com.hwua.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		// --
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

		// -- 按照键排序.使用TreeMap.
		TreeMap<String, Person> tm = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});

		// -- 放好了就排好了
		tm.putAll(map);

		Iterator<String> iter = tm.keySet().iterator();
		while (iter.hasNext()) {
			String string = (String) iter.next();
			System.out.println(string);
		}

		// -- 利用值排序 是利用Collections.sort(List,Comparator)
		// -- 根据Map中的所有键值对构建一个list对象.
		ArrayList<Map.Entry<String, Person>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Person>>() {

			@Override
			public int compare(Entry<String, Person> o1, Entry<String, Person> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().getAge() - o2.getValue().getAge();
			}
		});

		for (Entry<String, Person> entry : list) {
			System.out.println(entry);
		}
	}
}
