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
		
		//-- <>���ͱ�����ArrayList��Ԫ�ص�����
		ArrayList<String> list = new ArrayList<>(10);
		
		//-- 1.��ֵ
		list.add("a");
		//-- add(index,element)  index �±��0��ʼ
		list.add(1, "b");
		list.add(0,"c");
		 
		//-- 2.ȡֵ ����get���������±�ȡֵ
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("----------------");
		//-- 3.����  list.size() ��ȡList��ʵ�ʴ�ŵ�Ԫ�ظ���.�ͳ�ʼ����û��ëǮ��ϵ.
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
		
		//-- ��ȡ����������.
		Iterator<String> iterator = list.iterator();
		//-- �ж��Ƿ�����һ��Ԫ��
		while(iterator.hasNext()) {
			//-- ���Ϊ����һ��Ԫ����Ϊtrue.������false
			//-- ����nextȡ��Ԫ��.
			System.out.println(iterator.next());
		}
		
		System.out.println("-------------------------------");
		
		//-- set ���滻.��ָ��λ�õ�Ԫ���滻��.�����س���
		System.out.println("���滻��Ԫ��:\t" + list.set(1, "d"));
		//-- �Ѽ���ת�������
		String[] array = new String[list.size()];
		array = list.toArray(array);
		for (String str : array) {
			System.out.println(str);
		}
	}
}
