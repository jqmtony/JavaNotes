package D19_CustomerContactsUser.View;

import D19_CustomerContactsUser.Service.LinkManService;
import D19_CustomerContactsUser.Service.Imp.LinkManServiceImp;

public class ShowLinkManView extends View {

	public ShowLinkManView( ) {
		super("�鿴������ϵ��");
	}

	@Override
	protected View showView() {
		LinkManService lms=new LinkManServiceImp();
		lms.showAllLinkMan();
		return new MainView();
	}

}
