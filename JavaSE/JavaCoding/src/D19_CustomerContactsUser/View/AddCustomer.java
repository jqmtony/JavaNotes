package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Service.CustomerService;
import D19_CustomerContactsUser.Service.Imp.CustomerServiceImp;

public class AddCustomer extends View {

	public AddCustomer() {
		super("���ӿͻ�");
	}

	@Override
	protected View showView() {
		// ��ȡ�ͻ���Ϣ
		System.out.println("�ͻ�ID");
		int custID = scan.nextInt();
		System.out.println("�ͻ�����");
		String custName = scan.next();
		System.out.println("�ͻ���Դ");
		String custSource = scan.next();
		System.out.println("�ͻ�������ҵ");
		String custIndustry = scan.next();
		System.out.println("�ͻ��ȼ�");
		int custLevel = scan.nextInt();
		System.out.println("�ͻ���ϵ����");
		String custPhone = scan.next();
		// ����Service
		CustomerService cs=new CustomerServiceImp();
		boolean ifAddCust = cs.insertCustomer(custID,custName,
				custSource, custIndustry, custLevel,custPhone);
		// �Ƿ���ӳɹ�
		if(ifAddCust) {
			System.out.println("��ʾ������ӿͻ�");
			nextView = new MainView();
		}else {
			System.out.println("��ʾ�����ʧ��");
			nextView = this;
		}
		return nextView;
	}

}
