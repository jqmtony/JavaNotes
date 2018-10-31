package com.hwua.demo01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ArrayList�еĳ���API����
 * 
 * @author Administrator
 *
 */
public class ListDemo {

	public static void main(String[] args) {

		// -- 1.���췽��
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>(10);

		// -- ��List2�е�Ԫ�ظ�ֵ��List3��
		ArrayList<Integer> list3 = new ArrayList<>(list2);

		// -- 2.���Ԫ�صķ��� ����ͳһʹ��List1

		// -- add(Object)
		list1.add(1);
		// -- add(index,Object)
		list1.add(0, 2);
		// -- ��List2�е�����Ԫ����ӵ�List1��
		list1.addAll(list2);
		// -- ��List3�е�����Զ����ӵ�List1��.��list1���±�Ϊ2�ĵط���ʼ��Ԫ��
		list1.addAll(2, list3);

		// -- 3.��List������Ԫ����� ʵ�ַ�ʽ���Ƕ�������б���.������λ�ö���ֵnull����size��Ϊ0.
		list1.clear();

		// -- 4.�жϼ������Ƿ����ָ��Ԫ��.���ز���ֵ.true����.false������
		// -- ʵ�ַ�ʽ: ��ָ��Ԫ���ڼ����е�һ�γ��ֵ��±�.Ȼ���0���Ƚ�
		list1.contains(0);

		// -- 5.�Ӽ����и����±�ȡ��Ӧ��Ԫ��
		// -- get(index). ��Ҫע�����ȡԪ��֮ǰ�����ж�index��size�Ĺ�ϵ.���index >= size ���Խ��
		list1.get(0);

		// -- 6.��Ԫ�ص�һ�γ����±�
		// -- ͨ��ԭ�����ǿ��Է���list���ǿ��Ա���null��.
		list1.indexOf(0);

		// -- 7.�жϼ���������Ԫ��.�������Ƿ��ǿյ� ���ز���ֵ.
		list1.isEmpty();

		// -- 8.��ȡ������.ͨ�����������Լ��Ͻ��б���.foreach����Ͱ���������
		Iterator<Integer> iterator = list1.iterator();

		// -- 9.������һ��Ҳ�ǻ�ȡ������
		ListIterator<Integer> listIterator = list1.listIterator();

		// -- 10.��Ԫ�����һ�γ��ֵ��±� �����������Ԫ�ط���-1
		list1.lastIndexOf(0);

		// -- 11.�Ƴ�ָ��λ���ϵ�Ԫ��
		// -- remove(index)
		list1.remove(1);

		// -- 12.�Ƴ�ָ���Ķ���
		// -- remove(Object). ע�����������Integer.������д1�ǻ�Ĭ��Ϊ��index.
		// -- ��1�����Integer���� Integer i = 1; ��i�ŵ�С������.
		list1.remove(1);

		// -- 13.��list1���Ƴ���list2��Ԫ����ͬ��Ԫ��.������ظ�����ȫ���Ƴ�.
		list1.removeAll(list2);

		// -- 14.�滻ָ��λ���ϵ�Ԫ��
		// -- set(index,object);
		list1.set(1, 3);

		// -- 15.��ȡ������Ԫ�صĸ���
		list1.size();

		// -- 16.�Լ��Ͻ������� .��Ҫͨ�������ڲ������ʽ�ṩһ��Comparator�ӿڵĶ���
		list1.sort(null);

		// -- 17.�Ӽ����н�ȡһ�������γ��Ӽ��ϴ���
		List<Integer> subList = list1.subList(0, 3);

		// -- 18.�Ѽ���ת�������(Object����)
		Object[] array = list1.toArray();

		// -- 19.�Ѽ���ת���ָ�����͵�����.��Ҫ�����͵���������һ��
		Integer[] array1 = new Integer[list1.size()];
		array1 = list1.toArray(array1);

		// -- 20.��һ�������е�����Ԫ��װ��������.
		for (Integer i : array1) {
			list1.add(i);
		}
	}
}
