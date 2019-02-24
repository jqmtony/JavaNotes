package com.hwua.demo03;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("张三", 18, 1);
		Person p2 = new Person("李四", 17, 1);
		Person p3 = new Person("王五", 19, 1);
		Person p4 = new Person("赵六", 17, 1);
		Person p5 = new Person("孙七", 20, 1);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		Collections.sort(list);
		
		
		for (Person p : list) {
			System.out.println(p);
		}
		
		System.out.println("ababab".compareTo("bababa"));
		
		
		
		
		
		
		
		
	}
}
