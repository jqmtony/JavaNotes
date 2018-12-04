package com.hvua.domain.D12_extends;

public class Test {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("张三", 22, "男", "业务员");
		Employee e2 = new Employee("王五", 29, "男", "总经理");
		Employee e3 = new Employee("李四", 30, "女", "客户经理");
		
		// 以规定格式输出Employee的信息
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3.toString()); // 写不写toString都可以，输出具体内容由类里面的Customer决定
		
		// 比较两个employee信息是否完全相同
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		
	}
}
