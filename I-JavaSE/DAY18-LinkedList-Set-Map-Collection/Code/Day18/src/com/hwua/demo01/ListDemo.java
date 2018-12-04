package com.hwua.demo01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ArrayList中的常用API方法
 * 
 * @author Administrator
 *
 */
public class ListDemo {

	public static void main(String[] args) {

		// -- 1.构造方法
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>(10);

		// -- 把List2中的元素赋值到List3中
		ArrayList<Integer> list3 = new ArrayList<>(list2);

		// -- 2.添加元素的方法 下面统一使用List1

		// -- add(Object)
		list1.add(1);
		// -- add(index,Object)
		list1.add(0, 2);
		// -- 把List2中的所有元素添加到List1中
		list1.addAll(list2);
		// -- 把List3中的所有远在添加到List1中.从list1中下标为2的地方开始放元素
		list1.addAll(2, list3);

		// -- 3.把List中所有元素清空 实现方式就是对数组进行遍历.把所有位置都赋值null并把size置为0.
		list1.clear();

		// -- 4.判断集合中是否包含指定元素.返回布尔值.true包含.false不包含
		// -- 实现方式: 求指定元素在集合中第一次出现的下标.然后和0做比较
		list1.contains(0);

		// -- 5.从集合中根据下标取对应的元素
		// -- get(index). 需要注意的是取元素之前会先判断index和size的关系.如果index >= size 则会越界
		list1.get(0);

		// -- 6.求元素第一次出现下标
		// -- 通过原码我们可以发现list中是可以保存null的.
		list1.indexOf(0);

		// -- 7.判断集合中有无元素.即集合是否是空的 返回布尔值.
		list1.isEmpty();

		// -- 8.获取迭代器.通过迭代器来对集合进行遍历.foreach里面就包含迭代器
		Iterator<Integer> iterator = list1.iterator();

		// -- 9.和上面一样也是获取迭代器
		ListIterator<Integer> listIterator = list1.listIterator();

		// -- 10.求元素最后一次出现的下标 如果不包含该元素返回-1
		list1.lastIndexOf(0);

		// -- 11.移除指定位置上的元素
		// -- remove(index)
		list1.remove(1);

		// -- 12.移除指定的对象
		// -- remove(Object). 注意如果泛型是Integer.当我们写1是会默认为是index.
		// -- 把1保存成Integer类型 Integer i = 1; 把i放到小括号内.
		list1.remove(1);

		// -- 13.从list1中移除和list2中元素相同的元素.如果有重复的则全部移除.
		list1.removeAll(list2);

		// -- 14.替换指定位置上的元素
		// -- set(index,object);
		list1.set(1, 3);

		// -- 15.获取集合中元素的个数
		list1.size();

		// -- 16.对集合进行排序 .需要通过匿名内部类的形式提供一个Comparator接口的对象
		list1.sort(null);

		// -- 17.从集合中截取一段内容形成子集合存在
		List<Integer> subList = list1.subList(0, 3);

		// -- 18.把集合转变成数组(Object数组)
		Object[] array = list1.toArray();

		// -- 19.把集合转变成指定类型的数组.需要给类型的数组先有一个
		Integer[] array1 = new Integer[list1.size()];
		array1 = list1.toArray(array1);

		// -- 20.把一个数组中的所有元素装到集合中.
		for (Integer i : array1) {
			list1.add(i);
		}
	}
}
