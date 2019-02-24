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
	 * ���һ���ͻ�
	 * @param custName
	 * @param custSource
	 * @param custIndustry
	 * @param custLevel
	 * @param custPhone
	 * @return
	 */
	boolean insertCustomer(String custName, String custSource, String custIndustry, int custLevel, String custPhone);

	/**
	 * ��ȡ���еĿͻ�
	 * @return
	 */
	ArrayList<Customer> getAllCustomer();

	/**
	 * @param id
	 * @return
	 */
	Customer getCustomerById(int id);

}
