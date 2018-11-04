package D19_CustomerContactsUser.Service.Imp;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Dao.CustomerDao;
import D19_CustomerContactsUser.Dao.Imp.CustomerDaoImp;
import D19_CustomerContactsUser.Service.CustomerService;

public class CustomerServiceImp implements CustomerService {
	private CustomerDao cd;

	public CustomerServiceImp() {
		cd = new CustomerDaoImp();
	}

	/**
	 * 添加用户
	 */
	@Override
	public boolean insertCustomer(int custID, String custName, String custSource, String custIndustry, int custLevel,
			String custPhone) {
		// 传入数据层
		return cd.insertCustomer(custID, custName, custSource, custIndustry, custLevel, custPhone);
	}

	/**
	 * 删除用户
	 */
	@Override
	public boolean delCustomer(int nextInt) {
		return cd.delCustomer(nextInt);
	}

	/**
	 * 查找用户ID并返回用户
	 */
	@Override
	public Customer getCustomerByID(int nextInt) {
		return cd.getCustomer(nextInt);
	}

	/**
	 * 显示所有用户
	 */
	@Override
	public Customer showAllCus() {
		return cd.showAllCus();
	}

}
