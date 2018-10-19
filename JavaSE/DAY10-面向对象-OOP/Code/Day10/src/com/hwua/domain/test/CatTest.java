package com.hwua.domain.test;

/*
 * 小红养了两只猫，一只叫小黑，今年2岁，
 * 黑色，另一只叫小白，今年5岁，白色。请编写
 * 一个程序，要求当用户输入小猫的名字时，
 * 就显示猫的名字、年龄和颜色。如果用户输入
 * 的小猫名字错误，则显示“小红没有养这只猫”。
 */
import java.util.Scanner;

import com.hwua.domain.Cat;

public class CatTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入小猫的名字");
		String catName = scan.next();

		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 5;
		cat1.color = "白色";

		Cat cat2 = new Cat();
		cat2.name = "小黑";
		cat2.age = 2;
		cat2.color = "黑色";

		if (catName.equals(cat1.name)) {
			System.out.println(cat1);
		} else if (catName.equals(cat2.name)) {
			System.out.println(cat2);
		}else {
			System.out.println("没有这只猫");
		}
		

	}
}
