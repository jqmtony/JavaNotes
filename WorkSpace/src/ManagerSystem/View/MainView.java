package ManagerSystem.View;

public class MainView extends View {

	public MainView( ) {
		super("������");
	}

	@Override
	public View showView() {
		System.out.println(currentUser.getUserAccount()+" ��ӭ������");
		return null;
	}

}
