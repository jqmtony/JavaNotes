package com.hvua.domain.customer;

public class Test{
	public static void main(String[] args) {
		// null是ID由方法生成并赋值
		Customer c1 = new Customer(null,"张三","上海","经理一号",8+"",8+"",8+"","天知道","110","210000","110","www.baidu.com"); 
		Customer c2 = new Customer(null,"李四","上海","经理一号",8+"",8+"",8+"","天知道","110","210000","110","www.baidu.com"); 
		Customer c3 = new Customer(null,"王五","上海","经理一号",8+"",8+"",8+"","天知道","110","210000","110","www.baidu.com"); 
		
		CustomerManager cm = new CustomerManager(10);
		// 顺序添加一个对象
		cm.addCustomer(c2);
		cm.addCustomer(c2);
		cm.addCustomer(c2);
		cm.addCustomer(c1);
		cm.addCustomer(c1);
		cm.addCustomer(c1);
		cm.addCustomer(c1);
		// 指定位置插入一个对象
		cm.addCustomer(c1, 2);
		cm.addCustomer(c1, 1);
		// 指定位置删除一个对象
		cm.delCustomer(1);
		// 客户等级降序排列
		
		
		// 显示所有对象
		cm.showAllCustomer();
	
	}
}