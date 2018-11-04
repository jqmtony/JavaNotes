package D19_CustomerContactsUser.View;

public class UpdateLinkManView extends View {

	public UpdateLinkManView( ) {
		super("修改联系人的客户");
	}

	@Override
	protected View showView() {
		return new MainView();
	}

}
