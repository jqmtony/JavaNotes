/**
 * 
 */
package com.hwua.dao;

import java.util.ArrayList;

import com.hwua.bean.Customer;

/**
 * @author Administrator
 *
 */
public interface CustomerDao {

	/**
	 * @param custName
	 * @param custSource
	 * @param custIndustry
	 * @param custLevel
	 * @param custPhone
	 * @return
	 */
	boolean insertCustomer(String custName, String custSource, String custIndustry, int custLevel, String custPhone);

	/**
	 * @return
	 */
	ArrayList<Customer> listCustomers();

	/**
	 * @param id
	 * @return
	 */
	Customer getCustomer(int id);

}
