package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Service.LinkManService;
import D19_CustomerContactsUser.Service.Imp.LinkManServiceImp;

public class delLinkManView extends View {

	public delLinkManView() {
		super("删除联系人");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View showView() {
		LinkManService lms = new LinkManServiceImp();
		System.out.println("请输入要删除的联系人ID：");
		while (true) {
			if (lms.delLinkMan(scan.nextInt())) {
				System.out.println("提示：已删除联系人");
				nextView = new MainView();
				break;
			}
			System.out.println("提示：删除失败");
		}
		return nextView;
	}

}
