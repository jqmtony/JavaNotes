package com.hwua.customer;

public class Test {
	public static void main(String[] args) {
		
		Customer c1 = new Customer("张三","上海","经理一号",8+"",8+"",8+"","天知道","110","210000","110","www.baidu.com");
		Customer c2 = new Customer("李四","上海","经理一号",8+"",8+"",8+"","天知道","110","210000","110","www.baidu.com");
		Customer c3 = new Customer("王五","上海","经理一号",8+"",8+"",8+"","天知道","110","210000","110","www.baidu.com");
		Customer c4 = new Customer("赵六","上海","经理一号",8+"",8+"",8+"","天知道","110","210000","110","www.baidu.com");
		Customer c5 = new Customer("孙七","上海","经理一号",8+"",8+"",8+"","天知道","110","210000","110","www.baidu.com");
		
		
		CustomerManager cm = new CustomerManager(10);
	
		cm.addCustomer(c1);
		cm.addCustomer(c2);
		cm.addCustomer(c3);
		cm.addCustomer(c4, 0);
		cm.addCustomer(c5, 2);		
		
		
		cm.showAllCustomer();
		
	}

}
