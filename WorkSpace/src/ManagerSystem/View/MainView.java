package ManagerSystem.View;

public class MainView extends View {

	public MainView( ) {
		super("主界面");
	}

	@Override
	public View showView() {
		System.out.println(currentUser.getUserAccount()+" 欢迎回来！");
		return null;
	}

}
