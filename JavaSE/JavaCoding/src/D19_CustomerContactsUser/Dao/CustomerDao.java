package D19_CustomerContactsUser.Dao;

import D19_CustomerContactsUser.Bean.Customer;

public interface CustomerDao {

	boolean insertCustomer(int custID, String custName, String custSource, String custIndustry, int custLevel,
			String custPhone);

	Customer getCustomer(int nextInt);

	Customer showAllCus();

	boolean delCustomer(int nextInt);

}
