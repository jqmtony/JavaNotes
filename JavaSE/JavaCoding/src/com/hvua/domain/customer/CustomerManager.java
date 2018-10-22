package com.hvua.domain.customer;

import java.util.Arrays;

/**
 * 客户的管理类，提供对客户增删改查的方法
 * 
 * @author Administrator
 *
 */

public class CustomerManager {
	/**
	 * 只有成员变量可以在main外初始化，输出默认值
	 */
	private Customer[] array; // 用于存放Customer对象
	private int size;

	/**
	 * 初始化数组长度，有参构造法 测试时的调用方法，设置数组的长度：CustomerManager cm = new CustomerManager(4);
	 */
	public CustomerManager(int initCapacity) {
		array = new Customer[initCapacity];
	}

	/**
	 * 获取容器的大小
	 */
	public int getSize() {
		return size;
	}

	/**
	 * 检测容器的容量是否足够，使用率超过80%则扩充容器
	 */
	public void enlarge() {
		// -- 1.检查下数组中的容量是否足够.如果不够扩容.
		// -- 扩容的标准是实际存储元素个数超过了数组长度的80%.
		if ((double) size / array.length >= 0.8) {
			array = Arrays.copyOf(array, (int) (array.length * 1.8)); // 数组 = 扩充后的数组！
		}
	}

	/**
	 * 添加一个对象
	 */
	public void addCustomer(Customer customer) {
		if (customer == null) {
			System.out.println("要添加的Customer对象输入有误，请重新输入！"); // TODO 是否可以重新输入
			return;
		}
		enlarge(); // 确保容器有足够空间进行添加
		array[size] = customer;
		size = size + 1;
	}

	/**
	 * 指定位置添加一个对象
	 */
	public void addCustomer(Customer customer, int index) {
		if (customer == null || index < 0 || index > array.length) {
			System.out.println("对象或下标位置输入不合法，请重新输入 →_→");
			return;
		}
		enlarge();
		for (int i = size; i > index; i--) { // 整体向后移，i--
			array[i] = array[i - 1];
		}
		array[index] = customer;
		size = size + 1;
	}

	/**
	 * 指定位置删除一个对象
	 */
	public void delCustomer(int index) {
		if (index < 0 || index > array.length) {
			System.out.println("对象或下标位置输入不合法，请重新输入 →_→");
			return;
		}
		enlarge();
		for (int i = index; i < array.length-1; i++) { // 整体向前移
			array[i] = array[i + 1];
		}
		size = size - 1;
	}
	
	/**
	 * 客户等级降序排列
	 */
	public void sortCustomerLevel() {
		Customer a = new Customer();
		Customer b = new Customer();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[j].getCustomerLevel().length()<array[j-1].getCustomerLevel().length()) {
					
				}
			}
		}
	}

	/**
	 * 显示所有的Customer对象
	 */
	public void showAllCustomer() {
		if (size == 0) {
			System.out.println("容器中gon o(╥﹏╥)o 赶快添加吧！"); // TODO 是否添加
		} else {
			System.out.println("容器中共有" + size + "个数组元素，容器总空间为：" + array.length);
		}
		for (Customer cu : array) {
			if (cu != null) {
				System.out.println(cu);
			}
		}
	}
}
