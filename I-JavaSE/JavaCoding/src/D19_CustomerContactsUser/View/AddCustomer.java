package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Service.CustomerService;
import D19_CustomerContactsUser.Service.Imp.CustomerServiceImp;

public class AddCustomer extends View {

	public AddCustomer() {
		super("增加客户");
	}

	@Override
	protected View showView() {
		// 获取客户信息
		System.out.println("客户ID");
		int custID = scan.nextInt();
		System.out.println("客户姓名");
		String custName = scan.next();
		System.out.println("客户来源");
		String custSource = scan.next();
		System.out.println("客户所属行业");
		String custIndustry = scan.next();
		System.out.println("客户等级");
		int custLevel = scan.nextInt();
		System.out.println("客户联系方法");
		String custPhone = scan.next();
		// 传给Service
		CustomerService cs=new CustomerServiceImp();
		boolean ifAddCust = cs.insertCustomer(custID,custName,
				custSource, custIndustry, custLevel,custPhone);
		// 是否添加成功
		if(ifAddCust) {
			System.out.println("提示：已添加客户");
			nextView = new MainView();
		}else {
			System.out.println("提示：添加失败");
			nextView = this;
		}
		return nextView;
	}

}
