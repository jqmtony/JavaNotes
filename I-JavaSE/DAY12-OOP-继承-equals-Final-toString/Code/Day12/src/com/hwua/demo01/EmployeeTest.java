package com.hwua.demo01;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(18,'��',"����","ABC");
		Employee e2 = new Employee(18,'��',"����","ABC");
		Employee e3 = new Employee(18,'��',"����","ABC");
		System.out.println(e1.getClass());

		
		System.out.println(e1 .equals(e2));
		System.out.println(e1 .equals(e3));
		System.out.println(e3 .equals(e2));
		
	}
}
