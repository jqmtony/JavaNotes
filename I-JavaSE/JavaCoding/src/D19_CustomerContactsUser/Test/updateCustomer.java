package D19_CustomerContactsUser.Test;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Util.DataSet;

public class updateCustomer {
	/**
	 * 测试绑定联系人
	 */
	public static void main(String[] args) {
		Customer c1 = DataSet.customers.get(0);
		LinkMan lm1 = DataSet.linkMans.get(0);
		System.out.println(c1);
		System.out.println(lm1);
		System.out.println(c1.getLinkMans());
		c1.getLinkMans().add(lm1);
		
	}
}
