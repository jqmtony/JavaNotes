package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Service.LinkManService;
import D19_CustomerContactsUser.Service.Imp.LinkManServiceImp;

public class delLinkManView extends View {

	public delLinkManView() {
		super("ɾ����ϵ��");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected View showView() {
		LinkManService lms = new LinkManServiceImp();
		System.out.println("������Ҫɾ������ϵ��ID��");
		while (true) {
			if (lms.delLinkMan(scan.nextInt())) {
				System.out.println("��ʾ����ɾ����ϵ��");
				nextView = new MainView();
				break;
			}
			System.out.println("��ʾ��ɾ��ʧ��");
		}
		return nextView;
	}

}
