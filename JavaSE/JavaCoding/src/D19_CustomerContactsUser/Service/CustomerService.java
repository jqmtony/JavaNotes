package D19_CustomerContactsUser.Service;

import D19_CustomerContactsUser.Bean.Customer;

public interface CustomerService {

	boolean insertCustomer(int custID, String custName, String custSource, String custIndustry, int custLevel,
			String custPhone);

	boolean delCustomer(int nextInt);

	Customer getCustomerByID(int nextInt);

	Customer showAllCus();

}
