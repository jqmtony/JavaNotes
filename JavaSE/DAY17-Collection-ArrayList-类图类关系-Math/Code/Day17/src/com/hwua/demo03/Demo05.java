package com.hwua.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Demo05 {

	public static void main(String[] args) {
		//Ctrl + Shift + O �Զ�����
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			list.add(random.nextInt(6) + 30);
		}
			
		ArrayList<Integer> temp = new ArrayList<>();
		int num = 30;
		while(list.size() > 0) {
			temp.add(num);
			int oldSize = list.size();
			//-- ��list���Ƴ�temp��������������Ԫ��.
			list.removeAll(temp);
			int newSize = list.size();
			System.out.println("num:\t" + num + "����:\t" +(oldSize - newSize));
			num ++;
			//-- ���temp�е���������.(�����Ͽ��Բ���յ�.)
			temp.clear();
		}
		
		
		
		
		
		
		
		
		
	}
}
