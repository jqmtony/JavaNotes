package D19_CustomerContactsUser.App;

import D19_CustomerContactsUser.View.View;
import D19_CustomerContactsUser.View.welcomeView;

public class main {
	public static void main(String[] args) {
		// ���뻶ӭҳ��
		View view = new welcomeView();
		// ��תҳ�治Ϊ�������
		while(view!=null) {
			view = view.showCurrView();
		}
	}
}
