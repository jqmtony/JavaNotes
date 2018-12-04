package D19_CustomerContactsUser.App;

import D19_CustomerContactsUser.View.View;
import D19_CustomerContactsUser.View.welcomeView;

public class main {
	public static void main(String[] args) {
		// 进入欢迎页面
		View view = new welcomeView();
		// 跳转页面不为空则进入
		while(view!=null) {
			view = view.showCurrView();
		}
	}
}
