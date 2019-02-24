/**
 * 
 */
package com.hwua.view;

import java.util.ArrayList;

import com.hwua.bean.Customer;
import com.hwua.service.CustomerService;
import com.hwua.service.impl.CustomerServiceImpl;

/**
 * @author Administrator
 *
 */
public class ShowCustomerView extends View{

	/**
	 * @param viewName
	 */
	public ShowCustomerView() {
		super("显示所有客户界面");
	}
	

	@Override
	protected View showView() {
		CustomerService cs = new CustomerServiceImpl();
		ArrayList<Customer> list = cs.getAllCustomer();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		return new MainView();
	}

}
