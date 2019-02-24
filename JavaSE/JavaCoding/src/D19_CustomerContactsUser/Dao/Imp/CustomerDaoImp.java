package D19_CustomerContactsUser.Dao.Imp;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Dao.CustomerDao;
import D19_CustomerContactsUser.Util.DataSet;

public class CustomerDaoImp implements CustomerDao {
	/**
	 * 添加传入的用户数据
	 */
	@Override
	public boolean insertCustomer(int custID, String custName, String custSource, String custIndustry, int custLevel,
			String custPhone) {
		Customer customer = new Customer(custID, custName, custSource, custIndustry, custLevel, custPhone);
		return DataSet.customers.add(customer);
	}

	/**
	 * 删除用户
	 */
	@Override
	public boolean delCustomer(int nextInt) {
		for (Customer c : DataSet.customers) {
			if(c.getCustId()==nextInt) {
				return DataSet.customers.remove(c);
			}
		}
		return false;
	}

	/**
	 * 通过传入的ID返回客户，要么是Customer，要么是null
	 */
	@Override
	public Customer getCustomer(int nextInt) {
		for (Customer c : DataSet.customers) {
			if (c.getCustId() == nextInt) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Customer showAllCus() {
		for (Customer c : DataSet.customers) {
			System.out.println(c);
		}
		return null;
	}

}
