package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Service.CustomerService;
import D19_CustomerContactsUser.Service.LinkManService;
import D19_CustomerContactsUser.Service.Imp.CustomerServiceImp;
import D19_CustomerContactsUser.Service.Imp.LinkManServiceImp;

public class UpdateCustomerView extends View {

	public UpdateCustomerView() {
		super("�޸Ŀͻ�����ϵ��");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View showView() {
		CustomerService cs = new CustomerServiceImp();
		LinkManService lms = new LinkManServiceImp();
		// �ͻ���ID
		System.out.println("������Ҫ�󶨵Ŀͻ�ID");
		// �õ��ͻ���Ϣ
		Customer customer = null;
		while (true) {
			if ((customer = cs.getCustomerByID(scan.nextInt())) != null) {
				System.out.println(customer);
				break;
			}
			System.out.println("��Ų����ڣ����������룺");
		}

		// ��ϵ�˵�ID
		System.out.println("������Ҫ�󶨵���ϵ��ID");
		LinkMan lMan = null;
		while (true) {
			if ((lMan = lms.getLinkManByID(scan.nextInt())) != null) {
				System.out.println(lMan);
				break;
			}
			System.out.println("��Ų����ڣ����������룺");
		}
		// ����ϵ�˵�ID��ӵ��ͻ��Ķ�Ӧ������ȥ
		System.out.println("�Ƿ�����󶨣�");
		if (scan.next().equals("y")) {
//			customer.getLinkMans().add(lMan);
			System.out.println("��ʾ���Ѱ����");
		}
		return new MainView();
	}

}
