package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Service.CustomerService;
import D19_CustomerContactsUser.Service.Imp.CustomerServiceImp;

public class DelCustomer extends View {

	public DelCustomer() {
		super("ɾ���ͻ�");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View showView() {
		CustomerService cs = new CustomerServiceImp();
		System.out.println("������Ҫɾ���Ŀͻ�ID��");
		while (true) {
			if (cs.delCustomer(scan.nextInt())) {
				System.out.println("��ʾ����ɾ���ÿͻ���");
				nextView = new MainView();
			} else {
				System.out.println("����������:");
				nextView = this;
			}
			return nextView;
		}
		
	}

}
