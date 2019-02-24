package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Bean.Customer;
import D19_CustomerContactsUser.Bean.LinkMan;
import D19_CustomerContactsUser.Service.CustomerService;
import D19_CustomerContactsUser.Service.LinkManService;
import D19_CustomerContactsUser.Service.Imp.CustomerServiceImp;
import D19_CustomerContactsUser.Service.Imp.LinkManServiceImp;

public class UpdateCustomerView extends View {

	public UpdateCustomerView() {
		super("修改客户的联系人");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View showView() {
		CustomerService cs = new CustomerServiceImp();
		LinkManService lms = new LinkManServiceImp();
		// 客户的ID
		System.out.println("请输入要绑定的客户ID");
		// 拿到客户信息
		Customer customer = null;
		while (true) {
			if ((customer = cs.getCustomerByID(scan.nextInt())) != null) {
				System.out.println(customer);
				break;
			}
			System.out.println("编号不存在，请重新输入：");
		}

		// 联系人的ID
		System.out.println("请输入要绑定的联系人ID");
		LinkMan lMan = null;
		while (true) {
			if ((lMan = lms.getLinkManByID(scan.nextInt())) != null) {
				System.out.println(lMan);
				break;
			}
			System.out.println("编号不存在，请重新输入：");
		}
		// 将联系人的ID添加到客户的对应属性中去
		System.out.println("是否继续绑定？");
		if (scan.next().equals("y")) {
//			customer.getLinkMans().add(lMan);
			System.out.println("提示：已绑定完成");
		}
		return new MainView();
	}

}
