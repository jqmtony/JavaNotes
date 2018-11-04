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
	 * ����û�
	 */
	@Override
	public boolean insertCustomer(int custID, String custName, String custSource, String custIndustry, int custLevel,
			String custPhone) {
		// �������ݲ�
		return cd.insertCustomer(custID, custName, custSource, custIndustry, custLevel, custPhone);
	}

	/**
	 * ɾ���û�
	 */
	@Override
	public boolean delCustomer(int nextInt) {
		return cd.delCustomer(nextInt);
	}

	/**
	 * �����û�ID�������û�
	 */
	@Override
	public Customer getCustomerByID(int nextInt) {
		return cd.getCustomer(nextInt);
	}

	/**
	 * ��ʾ�����û�
	 */
	@Override
	public Customer showAllCus() {
		return cd.showAllCus();
	}

}
