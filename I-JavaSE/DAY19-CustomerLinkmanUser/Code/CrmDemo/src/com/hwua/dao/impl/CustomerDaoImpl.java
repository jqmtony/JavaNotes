/**
 * 
 */
package com.hwua.dao.impl;

import java.util.ArrayList;

import com.hwua.bean.Customer;
import com.hwua.dao.CustomerDao;
import com.hwua.util.DataSet;

/**
 * @author Administrator
 *
 */
public class CustomerDaoImpl implements CustomerDao {


	@Override
	public boolean insertCustomer(String custName, String custSource, String custIndustry, int custLevel,
			String custPhone) {

		//-- 1.������Customer����
		Customer c = new Customer(custName, custSource, custIndustry, custLevel, custPhone);
		
		//-- 2.���뵽���ݿ���
		return DataSet.customerList.add(c);
	}

	
	@Override
	public ArrayList<Customer> listCustomers() {
		return DataSet.customerList;
	}


	
	@Override
	public Customer getCustomer(int id) {
		for (Customer c : DataSet.customerList) {
			if (c.getCustId() == id) {
				return c;
			}
		}
		return null;
	}

}
