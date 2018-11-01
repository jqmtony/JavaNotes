package com.hwua.service.impl;

import java.util.ArrayList;

import com.hwua.bean.Customer;
import com.hwua.dao.CustomerDao;
import com.hwua.dao.impl.CustomerDaoImpl;
import com.hwua.service.CustomerService;

/**
 * Service 只负责处理业务
 * 	处理过程中所需要的数据都需要对接Dao
 * 	简单的业务一条数据处理语句就可以搞定..但负责的业务比如转账涉及两个数据操作
 * 	Dao是不可以掉Dao的.
 * 
 * @author Administrator
 *
 */
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao cd;
	
	/**
	 * 
	 */
	public CustomerServiceImpl() {
		cd = new CustomerDaoImpl();
	}

	
	@Override
	public boolean insertCustomer(String custName, String custSource, String custIndustry, int custLevel,
			String custPhone) {
		//-- 1.找Dao
		//-- 2.调用Dao中的方法
		return cd.insertCustomer(custName,custSource,custIndustry,custLevel,custPhone);
	}



	@Override
	public ArrayList<Customer> getAllCustomer() {
		return cd.listCustomers();
	}


	
	@Override
	public Customer getCustomerById(int id) {
		
		return cd.getCustomer(id);
	}

}
