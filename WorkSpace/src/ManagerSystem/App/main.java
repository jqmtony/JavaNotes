package ManagerSystem.App;

import ManagerSystem.View.View;
import ManagerSystem.View.WelcomeView;

/**
 * ͨ��main����ÿ��ҳ���ҳ����ת�����Ҫô��ת��Ҫô�ڱ�ҳ��
 * @author Administrator
 *
 */
public class main {
	public static void main(String[] args) {
		View view = new WelcomeView();
		while(view!=null) {
			view = view.showView();
		}
	}
}
