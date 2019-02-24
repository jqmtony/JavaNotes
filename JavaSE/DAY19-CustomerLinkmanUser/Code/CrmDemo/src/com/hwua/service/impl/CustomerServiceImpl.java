package com.hwua.service.impl;

import java.util.ArrayList;

import com.hwua.bean.Customer;
import com.hwua.dao.CustomerDao;
import com.hwua.dao.impl.CustomerDaoImpl;
import com.hwua.service.CustomerService;

/**
 * Service ֻ������ҵ��
 * 	�������������Ҫ�����ݶ���Ҫ�Խ�Dao
 * 	�򵥵�ҵ��һ�����ݴ������Ϳ��Ը㶨..�������ҵ�����ת���漰�������ݲ���
 * 	Dao�ǲ����Ե�Dao��.
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
		//-- 1.��Dao
		//-- 2.����Dao�еķ���
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
