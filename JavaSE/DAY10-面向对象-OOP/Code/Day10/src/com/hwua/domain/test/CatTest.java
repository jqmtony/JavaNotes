package com.hwua.domain.test;

/*
 * С��������ֻè��һֻ��С�ڣ�����2�꣬
 * ��ɫ����һֻ��С�ף�����5�꣬��ɫ�����д
 * һ������Ҫ���û�����Сè������ʱ��
 * ����ʾè�����֡��������ɫ������û�����
 * ��Сè���ִ�������ʾ��С��û������ֻè����
 */
import java.util.Scanner;

import com.hwua.domain.Cat;

public class CatTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("������Сè������");
		String catName = scan.next();

		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 5;
		cat1.color = "��ɫ";

		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 2;
		cat2.color = "��ɫ";

		if (catName.equals(cat1.name)) {
			System.out.println(cat1);
		} else if (catName.equals(cat2.name)) {
			System.out.println(cat2);
		}else {
			System.out.println("û����ֻè");
		}
		

	}
}
