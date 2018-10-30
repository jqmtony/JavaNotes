package com.hwua.demo03;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		//-- <>泛型表明该ArrayList中元素的类型
		ArrayList<String> list = new ArrayList<>(10);
		
		//-- 1.放值
		list.add("a");
		//-- add(index,element)  index 下标从0开始
		list.add(1, "b");
		list.add(0,"c");
		 
		//-- 2.取值 利用get方法根据下标取值
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("----------------");
		//-- 3.遍历  list.size() 获取List中实际存放的元素个数.和初始长度没半毛钱关系.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------------");
		int i= 0 ;
		while (i ++ < list.size()) {
			System.out.println(list.get(i - 1));
		}
		System.out.println("******************");
		i = 0;
		do {
			System.out.println(list.get(i));
		}while(++i < list.size());
		System.out.println("-------------------------");
		for (String str : list) {
			System.out.println(str);
		}		
		
		//-- 获取迭代器对象.
		Iterator<String> iterator = list.iterator();
		//-- 判断是否有下一个元素
		while(iterator.hasNext()) {
			//-- 如果为有下一个元素则为true.否则是false
			//-- 利用next取出元素.
			System.out.println(iterator.next());
		}
		
		System.out.println("-------------------------------");
		
		//-- set 是替换.把指定位置的元素替换掉.并返回出来
		System.out.println("被替换的元素:\t" + list.set(1, "d"));
		//-- 把集合转变成数组
		String[] array = new String[list.size()];
		array = list.toArray(array);
		for (String str : array) {
			System.out.println(str);
		}
	}
}
