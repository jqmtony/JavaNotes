package D19_CustomerContactsUser.Dao.Imp;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Dao.CustomerDao;
import D19_CustomerContactsUser.Util.DataSet;

public class CustomerDaoImp implements CustomerDao {
	/**
	 * ��Ӵ�����û�����
	 */
	@Override
	public boolean insertCustomer(int custID, String custName, String custSource, String custIndustry, int custLevel,
			String custPhone) {
		Customer customer = new Customer(custID, custName, custSource, custIndustry, custLevel, custPhone);
		return DataSet.customers.add(customer);
	}

	/**
	 * ɾ���û�
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
	 * ͨ�������ID���ؿͻ���Ҫô��Customer��Ҫô��null
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
