package com.hwua.demo01;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		/**
		 * ���󴴽�������ͬʱ.�����������Ѿ���ɸ�ֵ��
		 */
		//-- ����100�ڲ�Ʊ
		ArrayList<Lottery> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(new Lottery(i+1));
		}
		
		//-- ��ӡ100�ڲ�Ʊ��Ϣ
		Iterator<Lottery> iter = list.iterator();
		while (iter.hasNext()) {
			Lottery lottery = iter.next();
			System.out.println(lottery);
		}
		
		//-- ��ȡ100�������еĺ�����
		ArrayList<Integer> reds = new ArrayList<>();
		//-- ��ȡ100���е����е�������
		ArrayList<Integer> blues = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			reds.addAll(list.get(i).getReds());
			blues.add(list.get(i).getBlue());
		}
		
		//-- ��ÿ������ĳ��ִ���
		//-- ��ÿ������ĳ��ִ���
	
	}
}
