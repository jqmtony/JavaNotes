package ManagerSystem.App;

import java.sql.SQLException;

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
			try {
				view = view.showView();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
