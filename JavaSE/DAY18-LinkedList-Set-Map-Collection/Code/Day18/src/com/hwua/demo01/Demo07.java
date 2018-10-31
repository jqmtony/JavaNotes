package com.hwua.demo01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * 
 * @author Administrator
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(16);
		
		//-- map的赋值  
		map.put("A", 1);
		map.put("1", 2);
		map.put("中", 3);
		map.put("LL", 4);
		map.put("TC", 5);
		map.put("KEY", 6);
		
		//-- map的取值
		System.out.println(map.get("A"));
		
		//-- 获取Map中的所有键 会发现取出的key顺序和放入的不一样.则是map的特点:无序.
		//-- 序:是插入和读取的顺序不一致.
		Set<String> keys = map.keySet();
		for (String string : keys) {
			System.out.println(string);
		}
		
		//-- 获取Map的所有的Value
		Collection<Integer> values = map.values();
		for (Integer integer : values) {
			System.out.println(integer);
		}
		
		//-- 获取Map中的所有键值对
		Set<Map.Entry<String, Integer>> sets = map.entrySet();
		for (Map.Entry<String, Integer> entry : sets) {
			System.out.println(entry);
		}
	}
}
