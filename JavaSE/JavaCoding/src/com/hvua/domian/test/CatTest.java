package com.hvua.domian.test;

import java.util.Scanner;
import com.hvua.domain.Cat;

public class CatTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("输入小猫的名字");
		String catName = scan.next();
		
		// 创建2个类对象
		
		Cat cat1 = new Cat();
		cat1.name = "小黑";
		cat1.age = 5;
		cat1.color = "黑色";
		
		Cat cat2 = new Cat();
		cat2.name = "小白";
		cat2.age = 6;
		cat2.color = "白色";
		
		if(catName.equals(cat1.name)) {
			System.out.println(cat1);
		}else if(catName.equals(cat2.name)) {
			System.out.println(cat2);
		}else {
			System.out.println("没有这只猫");
		}
	}

}
