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
		
		//-- map�ĸ�ֵ  
		map.put("A", 1);
		map.put("1", 2);
		map.put("��", 3);
		map.put("LL", 4);
		map.put("TC", 5);
		map.put("KEY", 6);
		
		//-- map��ȡֵ
		System.out.println(map.get("A"));
		
		//-- ��ȡMap�е����м� �ᷢ��ȡ����key˳��ͷ���Ĳ�һ��.����map���ص�:����.
		//-- ��:�ǲ���Ͷ�ȡ��˳��һ��.
		Set<String> keys = map.keySet();
		for (String string : keys) {
			System.out.println(string);
		}
		
		//-- ��ȡMap�����е�Value
		Collection<Integer> values = map.values();
		for (Integer integer : values) {
			System.out.println(integer);
		}
		
		//-- ��ȡMap�е����м�ֵ��
		Set<Map.Entry<String, Integer>> sets = map.entrySet();
		for (Map.Entry<String, Integer> entry : sets) {
			System.out.println(entry);
		}
	}
}
