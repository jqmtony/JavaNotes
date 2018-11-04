package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Service.CustomerService;
import D19_CustomerContactsUser.Service.Imp.CustomerServiceImp;

public class DelCustomer extends View {

	public DelCustomer() {
		super("删除客户");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View showView() {
		CustomerService cs = new CustomerServiceImp();
		System.out.println("请输入要删除的客户ID：");
		while (true) {
			if (cs.delCustomer(scan.nextInt())) {
				System.out.println("提示：已删除该客户！");
				nextView = new MainView();
			} else {
				System.out.println("请重新输入:");
				nextView = this;
			}
			return nextView;
		}
		
	}

}
