package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Service.CustomerService;
import D19_CustomerContactsUser.Service.Imp.CustomerServiceImp;

public class ShowCustomerView extends View {

	public ShowCustomerView() {
		super("显示所有客户");
	}

	@Override
	protected View showView() {
		CustomerService cs = new CustomerServiceImp();
		cs.showAllCus();
		return new MainView();
	}

}
