package com.hvua.domian.test;

import java.util.Scanner;
import com.hvua.domain.Cat;

public class CatTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����Сè������");
		String catName = scan.next();
		
		// ����2�������
		
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 5;
		cat1.color = "��ɫ";
		
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 6;
		cat2.color = "��ɫ";
		
		if(catName.equals(cat1.name)) {
			System.out.println(cat1);
		}else if(catName.equals(cat2.name)) {
			System.out.println(cat2);
		}else {
			System.out.println("û����ֻè");
		}
	}

}
