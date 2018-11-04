package D19_CustomerContactsUser.View;

public class MainView extends View {

	public MainView() {
		super("主界面");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View showView() {
		System.out.println("1.查看所有客户");
		System.out.println("2.增加客户");
		System.out.println("3.删除客户");
		System.out.println("4.修改客户的联系人");
		System.out.println("5.查看所有联系人");
		System.out.println("6.增加联系人");
		System.out.println("7.删除联系人");
		System.out.println("8.修改联系人的客户");
		System.out.println("9.退出");
		// 找对应的View
		int itemChoose = scan.nextInt();
		switch (itemChoose) {
		case 1:
			nextView = new ShowCustomerView();
			break;
		case 2:
			nextView = new AddCustomer();
			break;
		case 3:
			nextView = new DelCustomer();
			break;
		case 4:
			nextView = new UpdateCustomerView();
			break;
		case 5:
			nextView = new ShowLinkManView();
			break;
		case 6:
			nextView = new AddLinkManView();
			break;
		case 7:
			nextView = new delLinkManView();
			break;
		case 8:
			nextView = new UpdateLinkManView();
			break;
		case 9:
			nextView = null;
			break;
		default:
			System.out.println("没有该选项");
			nextView = this;
			break;
		}

		return nextView;
	}

}
