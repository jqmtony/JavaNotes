package com.hwua.service;

import java.util.ArrayList;

import com.hwua.bean.Customer;

/**
 * 
 * @author Administrator
 *
 */
public interface CustomerService {

	/**
	 * 添加一个客户
	 * @param custName
	 * @param custSource
	 * @param custIndustry
	 * @param custLevel
	 * @param custPhone
	 * @return
	 */
	boolean insertCustomer(String custName, String custSource, String custIndustry, int custLevel, String custPhone);

	/**
	 * 获取所有的客户
	 * @return
	 */
	ArrayList<Customer> getAllCustomer();

	/**
	 * @param id
	 * @return
	 */
	Customer getCustomerById(int id);

}
