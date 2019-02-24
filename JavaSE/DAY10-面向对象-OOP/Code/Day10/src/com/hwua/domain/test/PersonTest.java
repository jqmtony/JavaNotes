package com.hwua.domain.test;
import com.hwua.domain.Person;

public class PersonTest {

	public static void main(String[] args) {
		//-- 构建一个Person类型的实例:对象.
		Person p = new Person();
		
		//-- 给对象的属性进行实际的赋值
		p.name = "陆德晨";
		p.gender = "男";
		p.age = 25;
		p.weight = 140;
		p.heght = 170;
		
		System.out.println(p.name);
		
		Person p1 = new Person();
		p1.name = "贲剑";
		
	}
}
