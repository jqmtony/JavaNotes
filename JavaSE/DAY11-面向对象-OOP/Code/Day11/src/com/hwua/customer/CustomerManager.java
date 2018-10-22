package com.hwua.customer;

import java.util.Arrays;

/**
 * 客户的管理类.里面提供方法对应客户的增删改查
 * 		1.有哪些行为(方法)
 * 			绝对不要较真实现的细节
 * 		2.建立Customer实体类
 * 		3.完善上面方法的细节.
 * 		4.建立测试
 * 
 * @author Administrator
 *
 */
public class CustomerManager {
	private Customer[] array;
	/**
	 * 用于记录数组中实际存放的元素个数
	 *  	成员变量会被自动初始化.初始化默认值
	 */
	private int size;
	
	/**
	 * 
	 * @param initCapacity 数组的初始长度
	 */
	public CustomerManager(int initCapacity) {
		array = new Customer[initCapacity];
	}
	
	/**
	 * 返回数组中实际存在元素的个数
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * 判断数组的容量是否需要扩容
	 */
	public void dilatation() {
		//-- 1.检查下数组中的容量是否足够.如果不够扩容.
		//-- 扩容的标准是实际存储元素个数超过了数组长度的80%.
		if ((double)size / array.length >= 0.8) {
			array = Arrays.copyOf(array, (int)(array.length * 1.75));
		}
	}
	
	/**
	 * 增加一个客户
	 * 
	 * @param customer 要被增加的客户
	 */
	public void addCustomer(Customer customer) {
		//-- 参数检查
		if (customer == null) {
			System.out.println("要插入的客户信息有误,插入失败!");
			//-- return 是结束当前方法.如果当前方法是main方法.则结束整个应用.
			return ;
		}
		//-- 检查容量
		dilatation();
		//-- 把元素放入到数组中
		array[size] = customer;
		//-- 让个数+1
		/*
		 *   要插入元素下标		元素个数
		 *	    0			          0 
		 * 		1					  1
		 */
		size = size + 1;
		
	}

	/**
	 * 同一个类中同名不同参数的叫做方法重载. 重载上面那个addCustomer方法.
	 * 
	 * @param customer 要被增加的客户
	 * @param index    指定的位置.
	 */
	public void addCustomer(Customer customer, int index) {
		//-- 检查参数
		if (customer == null || index < 0 || index > array.length) {
			System.out.println("位置并存在或者插入的客户信息不正确");
			return;
		}
		//- 判断容量
		dilatation();
		
		//-- 加入元素
		for (int i = size; i > index ; i--) {
			array[i] = array[i-1];
		}
		array[index] = customer;
		
		size ++;
	}

	/**
	 * 删除一个指定的客户
	 * 
	 * @param customer 要别删除的客户
	 */
	public void delCustomer(Customer customer) {

	}

	/**
	 * 根据位置删除指定的客户
	 * 
	 * @param index 指定的位置
	 */
	public void delCustomer(int index) {

	}

	/**
	 * 根据客户等级降序排列
	 */
	public void sortCustomerByLevel() {

	}

	/**
	 * 根据信用度降序排列.
	 */
	public void sortCustomerBuCredit() {
		//The constructor Customer() is undefined
		//Customer c = new Customer();
	}

	/**
	 * 根据地域汇总客户的数量
	 * 
	 * @param place 要被汇总的地域
	 * @return 该地域的客户数量
	 */
	public int getCustomerCountByPlace(String place) {
		return 0;
	}
	
	/**
	 * 显示所有的客户
	 */
	public void showAllCustomer() {
		if (size == 0) {
			System.out.println("容器中没有元素");
			return ;
		}else {
			System.out.println("容器中有" + size + "个元素,容器的总空间为:\t" + array.length);
		}
		for (Customer customer : array) {
			if (customer != null) {
				System.out.println(customer);
			}
		}
	}
}
